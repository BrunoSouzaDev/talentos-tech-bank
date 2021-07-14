package dia13.banco;

import java.util.Scanner;

import static dia13.banco.Validador.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao PetBank");

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Conta conta = criarConta(in);
        textoMenu();
        int opcao = in.nextInt();

        do {
            opcao = menu(opcao, in, conta);
        } while(opcao != 9);

        in.close();
        System.out.println("Televisão desligada.");
        System.exit(0);
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
                System.out.println("Conta Poupança criada com sucesso!");
            }else if(tipoDeConta == 2){
                conta = new ContaCorrente(nome, depositoInicial);
                System.out.println("Conta Corrente criada com sucesso!");
            }else{
                System.out.println("Digite 1 ou 2:");
                tipoDeConta = in.nextInt();
            }
        } while(tipoDeConta != 1 && tipoDeConta !=2);

        return conta;
    }

    private static void textoMenu(){
        System.out.println("\n");
        System.out.println("O que deseja fazer? Selecione uma opção:");
        System.out.println(
                "1) Listar Extrato\n"+
                        "2) Realizar saque\n"+
                        "3) Depositar\n"+
                        "4) Adicionar limite de cheque especial\n"+
                        "5) Encerrar conta");

    }

    private static int menu(int opcao, Scanner in, Conta conta){

        switch(opcao){
            case 1:
                conta.listarExtrato();
                break;
            case 2:
                //conta.sacar();
                break;
            case 3:
                //conta.depositar();
                break;
            case 4:
                if(conta instanceof ContaCorrente){
                    // ((ContaCorrente) conta).adicionarLimiteChequeEspecial();
                } else {
                    System.out.println("Contas do tipo Poupança não possuem limite");
                }
                break;
            case 5:
                //conta.encerrar();
                break;
            default:
                System.out.println("Você não digitou uma opção válida! Digite um valor válido.");
                break;
        }

        textoMenu();
        validaInputInt(in);
        return in.nextInt();
    }

}