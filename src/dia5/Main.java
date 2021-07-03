package dia5;

import java.util.Scanner;

public class Main {

  // Revisão e exercicios de fixação
  public static void main(String[] args) {
    // System.out.println(Math.pow(2, 3));
    exercicio2();
  }

  // Façam um programa que calcule o exponencial a partir da sua base
  // Ex 2 elevado a 3 = 8

  public static void exercicio1() {
    Scanner in = new Scanner(System.in);
    System.out.println("Escolha um numero para Base");
    double base = in.nextDouble();
    System.out.println("Escolha um numero para Exponencial");
    double exponencial = in.nextDouble();
    double resultado = 1;

    for (double i = exponencial; i >= 1; i--) {
      resultado = resultado * base;
    }
    System.out.println("O resultado é " + resultado);

    in.close();
  }

  public static void exercicio2() {
    // i
    // for (int i = 4; i > 0; i--) {
    // System.out.println("**********");
    // }

    // ii
    // int rep = 5;
    // for (int i = 1; i <= rep; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("");
    // }

    // iii
    // int rep = 5;
    // for (int i = 1; i <= rep; i++) {

    // int k = rep - i;
    // while (k > 0) {
    // System.out.print(" ");
    // k--;
    // }

    // for (int j = 1; j <= i; j++) {
    // System.out.print(" *");
    // }
    // System.out.println("");
    // }

    // iv
    // int rep = 5;
    // for (int i = 1; i <= rep; i++) {

    // int k = rep - i;
    // while (k > 0) {
    // System.out.print(" ");
    // k--;
    // }

    // int j = 0;
    // while (j != 2 * i - 1) {
    // System.out.print("* ");
    // j++;
    // }
    // System.out.println("");
    // }

    // v
    // int rep = 5;
    // for (int i = 1; i <= rep; i++) {

    // int k = rep - i;
    // while (k > 0) {
    // System.out.print(" ");
    // k--;
    // }

    // int j = 0;
    // while (j != 2 * i - 1) {
    // System.out.print(i + " ");
    // j++;
    // }
    // System.out.println("");
    // }

    // vi
    // int rep = 5;
    // for (int i = 1; i <= rep; i++) {

    // int k = rep - i;
    // while (k > 0) {
    // System.out.print(" ");
    // k--;
    // }

    // int j = 0;
    // int l = i;
    // boolean d = true;
    // while (j != 2 * i - 1) {

    // System.out.printf("%d ", l);
    // j++;

    // if (l > 1 && d) {
    // l--;
    // } else {
    // d = false;
    // l++;
    // }
    // }
    // System.out.println("");
    // }
  }

  // ColegaVirginia
  // public static void exercicio2VIVirginia() {
  // int rows = 5;
  // System.out.println("");
  // for (int i = 1; i <= rows; i++) {
  // for (int j = 1; j <= (rows - i) * 2; j++) {
  // System.out.print(" ");
  // }
  // for (int k = i; k >= 1; k--) {
  // System.out.print(" " + k);
  // }
  // for (int l = 2; l <= i; l++) {
  // System.out.print(" " + l);
  // }
  // System.out.println();
  // }
  // }
}
