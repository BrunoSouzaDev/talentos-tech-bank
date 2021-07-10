package dia8.exercicios.agenda;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutionException;

public class Pessoa {

    private String nome;

    private Integer anoDeNascimento;

    private Double altura;

    public Pessoa(String nome, Integer anoDeNascimento, Double altura) {

        this.setNome(nome);
        this.setAnoDeNascimento(anoDeNascimento);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(Integer anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", anoDeNascimento=" + this.getAnoDeNascimento() +
                ", altura=" + this.getAltura() +
                '}';
    }

    public void imprimirDadosDaPessoa() {
        System.out.println(this);
    }

    public void mostrarQuantosFara() {
        if (this.getAnoDeNascimento() == null){
            System.out.println("Ano de nascimento não informado");
            return;
        }

        Integer anoAtual = Calendar.getInstance().get(Calendar.YEAR); // or Year.now().getValue()

        Integer quantosAnosTera = anoAtual - this.getAnoDeNascimento();
        System.out.println("A pessoa tera: " + quantosAnosTera + " anos");
    }
}
