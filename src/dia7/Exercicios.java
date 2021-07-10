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

    public static void exercicio5ProfAnderson() {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, dê uma dica sobre a palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();


        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>();
        for (char x : palavraParaSerAdivinhada) {
            listaDeLetrasAcertadas.add(false);
        }

        System.out.println("Agora é a vez do jogador 2...");
        System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2, chute uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true);
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes--;
                System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
            }

            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (listaDeLetrasAcertadas.get(i)) {
                    System.out.printf("%s ", palavraParaSerAdivinhada[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();

        }

        System.out.println("------------------------------");
        if (!listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("Jogador 1 ganhou o jogo");
        }

        in.close();
    }

    public static void exercicio6() {
//        Dado um array de números inteiros com valores negativos e positivos, encontro o número mais próximo de zero.
//        Se houver valores como 2 e -2, considere o número positivo.

        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            numeros.add(scan.nextInt());
        }

        int aux = Integer.MAX_VALUE;
        for (Integer numero : numeros) {
            boolean maisProximoDeZero = Math.abs(numero) < Math.abs(aux);
            boolean maisProximoDeZeroEPositivo = Math.abs(numero) == Math.abs(aux) && numero > aux;
            if (maisProximoDeZero || maisProximoDeZeroEPositivo) {
                aux = numero;
            }
        }
        System.out.println(aux);

        scan.close();
    }

//    Colega Rafaela Sygliane
    public static void exercicio6colega() {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro, varie entre positivo e negativo");
            numeros[i] = in.nextInt();
        }
        in.close();

        int numeroPositivo = Integer.MAX_VALUE;
        int numeroNegativo = Integer.MIN_VALUE;

        for (Integer numero : numeros) {
            if (numero < numeroPositivo && numero > 0) {
                numeroPositivo = numero;
            }
            if (numero > numeroNegativo && numero < 0) {
                numeroNegativo = numero;
            }
        }
        System.out.println("O número mais proximo de zero é: ");
        System.out.println((numeroPositivo <= Math.abs(numeroNegativo) ? numeroPositivo : numeroNegativo));
    }

    public static void main(String[] args) {
        exercicio6();
    }
}
