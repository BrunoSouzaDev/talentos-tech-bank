package dia2;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        exercicio4();
    }

    public static void exercicio1() {
        // 1.Escreva um algoritmo que armazene o valor 99 em uma variável Y e
        // o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre
        // variáveis)
        // troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e
        // vice-versa. Ao final, escrever os valores que ficaram armazenados nas
        // variáveis.

        short Y = 99;
        short Z = 11;
        short C = 0;

        System.out.println("O valor de Y é " + Z);
        System.out.println("O valor de Z é " + Y);

        C = Y;
        Y = Z;
        Z = C;

        System.out.println("Após a troca");

        System.out.println("O novo valor de Z é " + Z);
        System.out.println("O novo valor de Y é " + Y);
    }

    public static void exercicio2() {
        // 2.Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o
        // seu antecessor.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor:");
        int valor = in.nextInt();

        int antecessor = valor - 1;
        System.out.println("O antecessor de " + valor + " é: " + antecessor);
        // or
        // System.out.println("O antecessor de " + valor + " é: "+ --valor);
        // or
        // System.out.println("O antecessor de " + valor + " é: " + valor-1);

        System.out.println(valor);
        in.close();

    }

    public static void exercicio3() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor para altura do seu retangulo:");
        double base = in.nextDouble();

        System.out.println("Digite o valor para base do seu retangulo:");
        double altura = in.nextDouble();

        double area = altura * base;
        System.out.println("A area dos eu retangulo de " + base + " e " + altura + " é: " + area + " de area total.");
        in.close();
    }

    public static void exercicio4() {
        // 4.Escreva um algoritmo para ler o
        // número total de eleitores de um município, o número de votos
        // brancos, nulos e válidos. Calcular e escrever o percentual que cada
        // um representa em relação ao total de eleitores.

        Scanner in = new Scanner(System.in);

        // System.out.println("Digite a quantidade de eleitores:");
        // double eleitores = in.nextDouble();

        System.out.println("Digite os votos brancos:");
        double brancos = in.nextDouble();

        System.out.println("Digite os votos nulos:");
        double nulos = in.nextDouble();

        System.out.println("Digite os votos válidos:");
        double validos = in.nextDouble();

        double eleitores = nulos + validos + brancos;
        double brancosPorcentagem = (brancos / eleitores) * 100;
        double nulosPorcentagem = (nulos / eleitores) * 100;
        double validosPorcentagem = (validos / eleitores) * 100;

        System.out.println(brancosPorcentagem + "% Porcentagem de brancos");
        System.out.println(nulosPorcentagem + "% Porcentagem de nulos");
        System.out.println(validosPorcentagem + "% Porcentagem de validos");
        in.close();
    }
}
