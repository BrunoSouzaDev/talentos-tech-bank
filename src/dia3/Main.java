package dia3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // WHILE = enquanto
        int x = 1;

        while (x < 11) {
            System.out.println(x);
            x++;
        }

        //  DO WHILE = faça enquanto
        x = 11;
        do {
            System.out.println(x);
            x++;
        } while (x < 11);

        // for = para
        // TODO For (i = 0; i < 10; i++)
        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }

        // forEach = paraCada
        // TODO Foreach List

        List<Integer> listaDeInteiros= new ArrayList<>();
        listaDeInteiros.add(1);
        listaDeInteiros.add(2);
        listaDeInteiros.add(3);

        listaDeInteiros.forEach(item -> {
            System.out.println(item);
        });

        for (int i = 0; i < listaDeInteiros.size(); i++) {
            System.out.println(listaDeInteiros.get(i));
        }
    }
}

