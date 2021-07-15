package dia13.banco.PetBank.application;

import java.util.Scanner;
import static dia13.banco.PetBank.application.Menu.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao PetBank.");

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        textoMenuInicial();
        int opcao = in.nextInt();

        while(opcao != 11){
            opcao = mostrarMenu(opcao, in);
        }

        in.close();
        System.out.println("Aplicativo fechado.");
        System.exit(0);
    }
}
