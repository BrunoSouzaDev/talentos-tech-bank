package dia2;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Exercicio4();
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

        System.out.println("Digite o segundo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o terceiro numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o quarto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o quinto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o sexto numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o setimo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o oitavo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o nono numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("Digite o decimo numero:");
        numero = in.nextInt();

        if (numero > maiorValor) {
            maiorValor = numero;
        }

        if (numero < menorValor) {
            menorValor = numero;
        }

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
    }

    public static void Exercicio5() {
//        5.Calcule a média dos números lidos
//        Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração, multiplicação e divisão).
//        Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a operação que deseja fazer (a, s, m, d)");
        String operacao = in.next();

        System.out.println("Digite o primeiro valor");
        int valor1 = in.nextInt();

        System.out.println("Digite o segundo valor");
        int valor2 = in.nextInt();

        switch(operacao) {
            case "a":
                int soma = valor1 + valor2;
                System.out.println("A soma entre os valores é: " + soma);
                break;
            case "s":
                int subtracao = valor1 - valor2;
                System.out.println("A subtração entre os valores é: " + subtracao);
                break;
            case "m":
                int multiplicacao = valor1 * valor2;
                System.out.println("A multiplicação entre os valores é: " + multiplicacao);
                break;
            case "d":
                if (valor2 == 0) {
                    System.out.println("Não se pode dividir por 0");
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
    }
}




























