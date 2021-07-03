package dia6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    // public static void exercicio1() {
    // // Dado um array com 20 números, imprima seus valores de trás para frente.
    // int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
    // 18, 19, 20 };

    // for (int i = lista.length - 1; i >= 0; i--) {
    // System.out.println(lista[i]);
    // }
    // }

    public static void exercicioShort() {
        int tamanho, i, j, aux;
        int lista[] = new int[200];
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o tamanho da lista : ");
        tamanho = scan.nextInt();
        System.out.print("Insira os valores para a lista : ");
        for (i = 0; i < tamanho; i++)
            lista[i] = scan.nextInt();
        for (i = 0; i < tamanho; i++) {
            for (j = i + 1; j < tamanho; j++) {
                if (lista[i] > lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
        System.out.print("A nova lista é :\n");
        for (i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + "  ");
        }
    }

    public static int[] selectionShort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min_idx]) {
                    min_idx = j;
                }
            }
            int temporario = vetor[min_idx];
            vetor[min_idx] = vetor[i];
            vetor[i] = temporario;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetor = { 8, 7, 45, 78, 54 };
        selectionShort(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    // Rafaela solução
    // public static void main(String[] args) {
    // exercicio02();
    // }
    //
    // public static void exercicio02() {
    // Scanner entrada = new Scanner(System.in);
    // int vetor[] = new int[tamanho];
    // int aux;
    // int a = 0;
    //
    // while (a < vetor.length) {
    // System.out.print("Digite o " + (a + 1) + "º número: ");
    // vetor[a] = entrada.nextInt();
    // a++;
    // }
    //
    // for (int i = 0; i < vetor.length; i++) {
    // for (int j = 0; j < i; j++) {
    // if (vetor[i] < vetor[j]) {
    // aux = vetor[i];
    // vetor[i] = vetor[j];
    // vetor[j] = aux;
    // }
    // }
    // }
    //
    // System.out.println("\n ");
    // for (int k = 0; k < vetor.length; k++) {
    // System.out.printf("%d ", vetor[k]);
    // }
    // }

}