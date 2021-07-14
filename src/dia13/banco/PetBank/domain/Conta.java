package dia13.banco.PetBank.domain;

import java.util.*;

public abstract class Conta {

    private int numero;
    private Cliente cliente;
    private double saldo;
    private Deque<Lancamento> extrato;
    private String tipoConta;
    private Gerente gerente;

    //TODO: validar se numero de conta ja existe - generate random number
    Conta(String nome, double saldo){
        this.numero = (int) (Math.random() * 10000);
        this.cliente = new Cliente(nome);
        this.saldo = saldo;
        this.extrato = new ArrayDeque<>();
        this.tipoConta = this.getClass().getSimpleName();
        this.gerente = new Gerente();
    }

    public abstract double sacar(double valor);

    public void depositar(double valor){
        this.saldo += valor;
        adicionarLancamento(valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    public void listarExtrato(){
        System.out.println("Seu extrato:");
        System.out.println(String.format("Número da conta: %d / Nome: %s", this.numero, this.cliente.getNome()));
        extrato.stream().forEach(lancamento -> System.out.println(lancamento.toString()));
    }

    public void adicionarLancamento(double valor){
        if(valor != 0){
            Lancamento lancamento = new Lancamento(new Date(), valor, this.saldo);
            getExtrato().push(lancamento);
        }
    }

    public boolean encerrar(){
        if(saldo == 0){
            System.out.println("Conta encerrada!");
            return true;
        } else if (saldo > 0){
            System.out.println(
                    String.format("Ainda há dinheiro na sua conta. Realize um saque no valor de %s.", this.saldo));
            return false;
        } else {
            System.out.println(String.format("Seu saldo está negativo. Realize um depósito no valor de %s.", Math.abs(this.saldo)));
            return false;
        }
    }

    //TODO: colocar transferencia no extrato
    public abstract void transferirPara(Conta conta, double valor);

    public String mostrarNomeCliente(){
        if(getCliente() != null){
            return getCliente().getNome();
        }else{
            return "Cliente não encontrado.";
        }
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Deque<Lancamento> getExtrato() {
        return extrato;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
