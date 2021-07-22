package dia13.banco.PetBank.domain;

import java.time.LocalDate;

public class Lancamento {

    private LocalDate data;
    private double movimentacao;
    private double saldo;

    @Override
    public String toString() {
        return "Lançamento [ " +
                "data: " + data +
                ", movimentação: R$" + movimentacao +
                ", saldo: R$" + saldo +
                " ]";
    }

    public Lancamento(LocalDate data, double movimentacao, double saldo) {
        this.data = data;
        this.movimentacao = movimentacao;
        this.saldo = saldo;
    }

    public LocalDate getData() {
        return data;
    }
}
