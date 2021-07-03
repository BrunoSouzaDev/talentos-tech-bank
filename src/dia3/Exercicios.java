package dia2;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Exercicio5();
}

    public static void validaSystemInInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa digitar um número inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void validaSystemInString(Scanner in) {
        if (!in.hasNext()) {
            System.out.println("Você precisa digitar uma string");
            in.close();
            System.exit(1);
        }
    }

    public static void validaSystemInDouble(Scanner in) {
        if (!in.hasNextDouble()) {
            System.out.println("Você precisa digitar um número real");
            in.close();
            System.exit(1);
        }
    }

    public static void Exercicio1() {
//        1.Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero para saber se é par ou impar:");

        if (!in.hasNextInt()) {
            System.out.println("Voce precisa informar um numero inteiro");
            System.exit(1);
        }

        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um numero par");
        } else {
            System.out.println("É um numero impar");
        }

//        String resultadoTernario = numero % 2 == 0 ? "É um numero par" : "É um numero impar";
//        System.out.println(resultadoTernario);

        in.close();
    }

    public static void Exercicio2() {
//        2.Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//        Infantil A = 5 a 7 anos
//        Infantil B = 8 a 11 anos
//        Juvenil A = 12 a 13 anos
//        Juvenil B = 14 a 17 anos
//        Adultos = Maiores de 18 anos

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a idade do nadador:");

        if (!in.hasNextInt()) {
            System.out.println("Voce precisa informar um numero inteiro");
            System.exit(1);
        }

        int idade = in.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade não permitida");
        }

        in.close();
    }

    public static void Exercicio3() {
//        3.Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");

        if (!in.hasNextInt()) {
            System.out.println("Voce precisa informar um numero inteiro");
            System.exit(1);
        }

        int primeiroNumero = in.nextInt();

        System.out.println("Digite o segundo numero:");

        if (!in.hasNextInt()) {
            System.out.println("Voce precisa informar um numero inteiro");
            System.exit(1);
        }

        int segundoNumero = in.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior numero é " + primeiroNumero);
            System.out.println("O menor numero é " + segundoNumero);
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("O maior numero é " + segundoNumero);
            System.out.println("O menor numero é " + primeiroNumero);
        }

        in.close();
    }

    public static void Exercicio4() {
//        4.Construa um algoritmo que leia 10 valores inteiros e positivos e:
//        Encontre o maior valor
//        Encontre o menor valor

        Scanner in = new Scanner(System.in);
    
        System.out.println("Digite o primeiro numero:");
        int numero = in.nextInt();

        int menorValor = numero;
        int maiorValor = numero;
        int somaDosValores = 0;

        somaDosValores = somaDosValores + numero;

        System.out.println("Digite o segundo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o terceiro numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o quarto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o quinto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o sexto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o setimo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o oitavo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o nono numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("Digite o decimo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        somaDosValores += numero;

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.printf("A média dos valores é: " + (somaDosValores/10.0));

        in.close();
    }

    public static void Exercicio5() {
//        5.Calcule a média dos números lidos
//        Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração, multiplicação e divisão).
//        Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

        Scanner in = new Scanner(System.in);

        System.out.println("Adição - 1");
        System.out.println("Subtração - 2");
        System.out.println("Multiplicação - 3");
        System.out.println("Divisão - 4");
        System.out.println("Digite a operação que deseja fazer");
        validaSystemInString(in);
        int operacao = in.nextInt();

        System.out.println("Digite o primeiro valor");
        validaSystemInDouble(in);
        double valor1 = in.nextDouble();

        System.out.println("Digite o segundo valor");
        validaSystemInDouble(in);
        double valor2 = in.nextDouble();

        switch(operacao) {
            case 1:
                double soma = valor1 + valor2;
                System.out.println("A soma entre os valores é: " + soma);
                break;
            case 2:
                double subtracao = valor1 - valor2;
                System.out.println("A subtração entre os valores é: " + subtracao);
                break;
            case 3:
                double multiplicacao = valor1 * valor2;
                System.out.println("A multiplicação entre os valores é: " + multiplicacao);
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("Não se pode dividir por 0");
                    break;
                } else {
                    double divisao = valor1 / (double) valor2;
                    System.out.println("A divisão entre os valores é: " + divisao);
                }
                break;
            default:
                System.out.println("Operação não encontrada");
        }
        in.close();
    }

    public static void Exercicio6() {
//        6.Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
//        O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2.
//        No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
//

        int player, computer;

        Scanner in = new Scanner(System.in);

        final String pedra = "pe";
        final String papel = "pa";
        final String tesoura = "te";

        System.out.println("Pedra, papel e tesoura");
        System.out.println("pe = Pedra");
        System.out.println("pa = Papel");
        System.out.println("te = Tesoura");

        System.out.println("Insira a escolha do primeiro jogador ");
        String escolhaJogador1 = in.next();

        if (!(escolhaJogador1.equals(pedra) || escolhaJogador1.equals(papel) || escolhaJogador1.equals(tesoura))) {
            System.out.println("O jogador 1 não escolheu uma opção válida");
            System.exit(1);
        }

        System.out.println("Insira a escolha do segundo jogador ");
        String escolhaJogador2 = in.next();

        if (!(escolhaJogador2.equals(pedra) || escolhaJogador2.equals(papel) || escolhaJogador2.equals(tesoura))) {
            System.out.println("O jogador 2 não escolheu uma opção válida");
            System.exit(1);
        }

        if (escolhaJogador1.equals(escolhaJogador2)) {
            System.out.println("Houve empate");
            System.exit(1);
        }


        switch (escolhaJogador1) {
            case pedra:
                if (escolhaJogador2.equals(tesoura)) {
                    System.out.println("Vitória do jogador 1!");
                } else if (escolhaJogador2.equals(papel)) {
                    System.out.println("Vitória do jogador 2!");
                }
                break;
            case papel:
                if (escolhaJogador2.equals(pedra)) {
                    System.out.println("Vitória do jogador 1!");
                } else if (escolhaJogador2.equals(tesoura)) {
                    System.out.println("Vitória do jogador 2!");
                }
                break;
            case tesoura:
                if (escolhaJogador2.equals(papel)) {
                    System.out.println("Vitória do jogador 1!");
                } else if (escolhaJogador2.equals(pedra)) {
                    System.out.println("Vitória do jogador 2!");
                }
                break;
        }

        in.close();
    }
}




























