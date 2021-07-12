package dia12.Abstratos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostrarValoresAPagar(List<Empregado> empregados){
        for (Empregado e : empregados){
            System.out.println(e);
            System.out.println(e.ganha());
        }
    }

    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();

        empregados.add(new Chefe("Virginia Silva",18_000));
        empregados.add(new PorComissao("Rafaela Ferreira", 5_000, 10, 200));
        empregados.add(new PorItem("Beatriz Rodrigues", 40, 180));

        mostrarValoresAPagar(empregados);
    }
}
