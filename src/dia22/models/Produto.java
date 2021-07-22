package dia22.models;

import java.math.BigDecimal;

public class Produto {

    private Long id;

    private String descricao;

    private BigDecimal valorDeCusto;

    private BigDecimal pesoUnitario;

    private String unidadeDeMedida;

    private String codigoDeBarras;

    private BigDecimal valorDeVenda;

    public Produto(String descricao, BigDecimal valorDeCusto, BigDecimal pesoUnitario, String unidadeDeMedida, String codigoDeBarras, BigDecimal valorDeVenda) {
        this.descricao = descricao;
        this.valorDeCusto = valorDeCusto;
        this.pesoUnitario = pesoUnitario;
        this.unidadeDeMedida = unidadeDeMedida;
        this.codigoDeBarras = codigoDeBarras;
        this.valorDeVenda = valorDeVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(BigDecimal valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public BigDecimal getPesoUnitario() {
        return pesoUnitario;
    }

    public void setPesoUnitario(BigDecimal pesoUnitario) {
        this.pesoUnitario = pesoUnitario;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public BigDecimal getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(BigDecimal valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

}
