package dia12.Sobrecarga;

public class Main {

    public static void main(String[] args) {
        MinhaLista minhaLista = new MinhaLista();
        minhaLista.add(1);
        minhaLista.add("2");
        minhaLista.add(3.0);

        System.out.println(minhaLista);
    }
}
