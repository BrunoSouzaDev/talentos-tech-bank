package dia2;

public class Main {

    public static void main(String[] args) {

    }

    public static void  operadores() {
        // Atribuição
        int idade = 28;

        // Aritiméticos
        int i = 1 + 1; // + - * / ++ -- %

        // Relacionais
        boolean operadorRelacional = 1 >= 1; // <= >= != == > <

        // Lógicos
        boolean testeLogico = 1 == 1 && 2 ==2; // && ||

        // Negação
        boolean invertido = !true; // ! !!
    }

    public static void primeiroIf () {
        int idade = 19;

        if (idade < 0) {
            System.out.println("idade inválida");
        } else if (idade >= 150){
            System.out.println("idade inválida");
        } else if (idade >= 18) {
            System.out.println("Você tem permissao para assistir este conteúdo");
        } else {
            System.out.println("Você não term permissao para assistir este conteúdo");
        }
    }
}
