package dia8;

public class Caneta {

    String cor;

    String tubo;

    String ponta;

    String carga;

    Double tamanhoDaCaneta;

    Double quantidadeDeTinta;

    Double peso;

    @Override
    public String toString() {
        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponta='" + ponta + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta=" + tamanhoDaCaneta +
                ", quantidadeDeTinta=" + quantidadeDeTinta +
                ", peso=" + peso +
                '}';
    }
}
