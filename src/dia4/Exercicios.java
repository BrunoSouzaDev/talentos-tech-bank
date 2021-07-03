package dia4;

import java.util.Scanner;

public class Exercicios {

    public static void Exercicio1() {
        // 1.Construa um algoritmo que leia 10 valores inteiros e positivos e:
        // -Encontre o maior valor
        // -Encontre o menor valor
        // -Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora
        // vamos otimizar ele utilizando o while e for.

        Scanner in = new Scanner(System.in);
        int c = 1;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int somaDosValores = 0;

        while (c < 10) {
            System.out.println("Digite o " + c + "* numero");
            int numero = in.nextInt();
            if (numero < menorValor) {
                menorValor = numero;
                somaDosValores = somaDosValores + numero;
            } else if (numero > maiorValor) {
                maiorValor = numero;
                somaDosValores = somaDosValores + numero;
            }
            c++;
        }
        System.out.println("O maior valor é " + maiorValor);
        System.out.println("O menor valor é " + menorValor);
        System.out.println("A média dos valores é " + somaDosValores / 10);

        in.close();
    }

    public static void Exercicio2() {
        // 2.Construa um algoritmo usando uma estrutura de repetição que calcule o
        // fatorial de um número.

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um numero para fazer o Fatorial");
        double n = in.nextDouble();
        double resultado = 1;

        for (double i = n; i > 1; i--) {
            resultado = resultado * i;
        }
        System.out.println("O resultado é " + resultado);
        in.close();
    }

    public static void main(String[] args) {
        Exercicio2();
    }
}
