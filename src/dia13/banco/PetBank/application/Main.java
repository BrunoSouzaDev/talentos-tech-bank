package dia13.banco.PetBank.application;

import dia13.banco.PetBank.domain.*;

import java.util.Scanner;

import static dia13.banco.PetBank.application.Validador.*;

public class Main {

    private static Conta contaAtual;

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao PetBank");

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        textoMenuInicial();
        int opcao = in.nextInt();

        while(opcao != 11){
            opcao = mostrarMenu(opcao, in);
        }

        in.close();
        System.out.println("Aplicativo fechado.");
        System.exit(0);
    }

    private static void textoMenuInicial(){
        System.out.println("\n");
        System.out.println("É necessário criar uma conta para começar. Selecione uma opção:");
        System.out.println(
                "1) Criar Conta\n" +
                        "11) Sair");

    }

    private static void textoMenu(){
        System.out.println("\n------------------------------------------");
        System.out.println(String.format("Olá, %s. Você está acessando a conta %s.\n", contaAtual.mostrarNomeCliente(), contaAtual.getNumero()));
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println(
                        "1) Criar e acessar outra conta\n" +
                        "2) Acessar uma conta existente diferente\n" +
                        "3) Listar Extrato\n"+
                        "4) Realizar saque\n"+
                        "5) Depositar\n"+
                        "6) Alterar limite de cheque especial (Conta Corrente)\n"+
                        "7) Ver limite da conta (Conta Corrente)\n" +
                        "8) Transferir dinheiro para outra conta\n" +
                        "9) Simular Emprestimo\n" +
                        "10) Encerrar conta\n"+
                        "11) Sair");
    }

    private static int mostrarMenu(int opcao, Scanner in){
        if(contaAtual == null){
            return menuInicial(opcao, in);
        }else{
            return menu(opcao, in);
        }
    }

    private static int menuInicial(int opcao, Scanner in){
        switch(opcao) {
            case 1:
                criarConta(in);
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }

    private static int menu(int opcao, Scanner in){
        switch(opcao){
            case 1:
                criarConta(in);
                break;
            case 2:
                acessarOutraConta(in);
                break;
            case 3:
                contaAtual.listarExtrato();
                break;
            case 4:
                sacar(in);
                break;
            case 5:
                depositar(in);
                break;
            case 6:
                alterarLimiteChequeEspecial(in);
                break;
            case 7:
                if(contaAtual instanceof ContaCorrente){
                    ((ContaCorrente) contaAtual).verLimiteMaximo();
                } else {
                    System.out.println("Contas do tipo Poupança não possuem limite.");
                }
                break;
            case 8:
                transferirParaOutraConta(in);
                break;
            case 9:
                simularEmprestimo(in);
                break;
            case 10:
                if(contaAtual.encerrar()){
                    System.out.println("Conta fechada.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Vocë não digitou uma opção válida! Digite um valor válido.");
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }

    private static Conta criarConta(Scanner in){
        System.out.println("Vamos criar uma conta.");
        Conta conta = null;

        System.out.println("Digite o seu nome: ");
        String nome = in.next();

        System.out.println("Digite o depósito inicial da sua conta: ");
        validaInputDouble(in);
        double depositoInicial = in.nextDouble();
        validaInputNegativo(depositoInicial);

        System.out.println("Digite \n" +
                "1) Conta Poupança \n" +
                "2) Conta Corrente \n");
        validaInputInt(in);
        int tipoDeConta = in.nextInt();
        do {
            if (tipoDeConta == 1) {
                conta = new ContaPoupanca(nome, depositoInicial);
                conta.adicionarLancamento(depositoInicial);
                System.out.println("Conta Poupança criada com sucesso!");
            }else if(tipoDeConta == 2){
                conta = new ContaCorrente(nome, depositoInicial);
                conta.adicionarLancamento(depositoInicial);
                System.out.println("Conta Corrente criada com sucesso!");
            }else{
                System.out.println("Digite 1) Conta Poupança ou 2) Conta Corrente:");
                tipoDeConta = in.nextInt();
            }
        } while(tipoDeConta != 1 && tipoDeConta !=2);

        Banco.adicionarConta(conta);
        contaAtual = conta;
        return conta;
    }

    public static void depositar(Scanner in){
        System.out.println("Digite o quanto deseja depositar: ");
        validaInputDouble(in);
        double valor = in.nextDouble();
        validaInputNegativo(valor);
        contaAtual.depositar(valor);
    }

    public static void sacar(Scanner in){
        System.out.println("Digite o quanto deseja sacar: ");
        validaInputDouble(in);
        double valor = in.nextDouble();
        validaInputNegativo(valor);

        double saque = contaAtual.sacar(valor);
        if(saque == 0 && contaAtual instanceof ContaCorrente){
            System.out.println("Deseja aumentar o seu limite do Cheque Especial? 1) Sim 2) Não");
            int resposta = in.nextInt();
            if(resposta == 1) alterarLimiteChequeEspecial(in);
        }
    }

    public static void alterarLimiteChequeEspecial(Scanner in){
        if(contaAtual instanceof ContaCorrente){
            System.out.println("Para alteração do limite da conta, é necessária a senha do Gerente.");

            System.out.println("Gerente, informe o novo valor de limite:");
            validaInputDouble(in);
            double novoLimite = in.nextDouble();
            validaInputNegativo(novoLimite);

            System.out.println("Gerente, digite a senha:");
            String senha = in.next();

            ((ContaCorrente) contaAtual).alterarLimiteChequeEspecial(novoLimite, senha);
        } else {
            System.out.println("Contas do tipo Poupança não possuem limite.");
        }
    }

    public static void acessarOutraConta(Scanner in){
        System.out.println("Cliente, digite o número da conta que deseja acessar:");
        validaInputInt(in);
        int numeroConta = in.nextInt();
        Conta conta = Banco.procurarConta(numeroConta);

        if(conta == null){
            System.out.println("Não foi encontrada uma conta com este número.");
        }else{
            contaAtual = conta;
            System.out.println("Bem-vindo(a) à sua conta.");
        }
    }

    public static void transferirParaOutraConta(Scanner in){
        System.out.println("Digite o número da conta para a qual deseja transferir:");
        validaInputInt(in);
        int numeroConta = in.nextInt();
        Conta conta = Banco.procurarConta(numeroConta);

        if(conta == null) {
            System.out.println("Não foi encontrada uma conta com este número.");
        }else{
            System.out.println("Digite o valor que deseja transferir:");
            validaInputDouble(in);
            double transferencia = in.nextDouble();
            validaInputNegativo(transferencia);

            contaAtual.transferirPara(conta, transferencia);
            System.out.println(String.format("Transferência para %s realizada com sucesso.", conta.getNumero()));
        }
    }

    public static void simularEmprestimo(Scanner in) {
        System.out.println("Digite o valor que gostaria de simular:");
        validaInputInt(in);
        double emprestimo = in.nextDouble();

        System.out.println("Digite o numero de parcelas que deseja simular:");
        int numeroDeParcelas = in.nextInt();
        validaInputNegativo(numeroDeParcelas);

        Emprestimo.simularEmprestimo(emprestimo, numeroDeParcelas);
    }

}
