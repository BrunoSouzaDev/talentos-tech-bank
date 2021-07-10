package dia8.exercicios.agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno Souza", 1994, 1.80);
        pessoa.mostrarQuantosFara();
        pessoa.imprimirDadosDaPessoa();

        Scanner in = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Bem vindo a sua agenda");

        while (true) {
            System.out.println("Escolha uma das opções");
            System.out.println("(1) - adicionar um contato" );
            System.out.println("(2) - remover contato");
            System.out.println("(3) - buscar pelo nome");
            System.out.println("(4) - mostrar todos");
            System.out.println("(0) -sair");

            Short opcao = in.nextShort();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = in.toString();

                    System.out.println("Digite o ano de nascimento:");
                    Integer ano = in.nextInt();

                    System.out.println("Digite a Altura:");
                    Double altura = in.nextDouble();

                    agenda.armazenaPessoa(nome, ano, altura);
                    break;

                case 2:

            }


        in.close();
        }
    }


}

