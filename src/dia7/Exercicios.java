package dia7;

import java.util.*;

public class Exercicios {

    public static void exercicio1() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        // Ler somente 5 números
        Scanner scan = new Scanner(System.in);
//
//        int[] numeros = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite um numero");
//            numeros[i] =scan.nextInt();
//        }
//
//        System.out.println(Arrays.toString(numeros));
//

//        Arrays list

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            int num = scan.nextInt();
            lista.add(num);
        }
        System.out.println(lista);

        scan.close();
    }

    public static void exercicio2() {
//        Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numeros.add(scan.nextInt());
        }

        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero < 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);

//        System.out.println(numeros.stream().filter(numero -> numero < 0).count());
//          Lambda ^

        scan.close();
    }

    public static void exercicio3() {
//        Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numeros.add(scan.nextInt());
        }

        int quantidade = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println(quantidade);

//        System.out.println(numeros.stream().filter(numero -> numero % 2 == 0).count());
//          Lambda ^

        scan.close();
    }

    public static void exercicio4() {
//        Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numeros.add(scan.nextInt());
        }


        int aux = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if (numero > aux) {
                aux = numero;
            }
        }
        System.out.println(aux);

/*
        System.out.println(Collections.max(numeros));
        System.out.println(numeros.stream().max(Integer::compare));
*/

        scan.close();
    }


    public static void exercicio5() {
//        Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes,
//        caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

        String[] palavra = { "v", "e", "n", "o", "u", "r", "a" };

        Scanner scan = new Scanner(System.in);

        int forca = 1, vencer = 0, perder = 0, contador = 0;

        String digito;
        String[] letrasDigitadas = new String[20];

        while (true) {
            int existePalavra = 0;
            System.out.println("Digite a letra:");
            digito = scan.next();
            letrasDigitadas[contador] = digito;
            for (String letrasDigitada : letrasDigitadas) {
                if (letrasDigitada != null) {
                    if (letrasDigitada.equals(digito)) {
                        existePalavra++;
                    }
                }
            }

            if (!(existePalavra > 1)) {
                for (int i = 0; i < palavra.length; i++) {
                    if (palavra[i].equals(digito)) {
                        System.out.println("Letra correta.");
                        vencer++;
                        break;
                    } else {
                        if (i == 4) {
                            System.out.println("Letra inexistente.");
                            perder++;
                        }
                    }
                }
                if (perder == 10) {
                    System.out.println("Você perdeu.");
                    System.exit(1);
                } else if (vencer == 7) {
                    System.out.println("Voce venceu.");
                    System.exit(1);
                }
            } else {
                System.out.println("Essa letra já foi digitada.");
            }
            contador++;
        }
    }


    public static void main(String[] args) {
        exercicio5();
    }
}
