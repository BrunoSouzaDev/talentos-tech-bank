package dia13.banco;

import java.util.Stack;

public abstract class Conta {

    private int numero;
    private Cliente cliente;
    private double saldo;
    private Stack<Extrato> extrato;
    private String tipoConta;
    private Gerente gerente;

    Conta(String nome, double saldo){
        this.numero = (int) (Math.random() * 10000);
        this.cliente = new Cliente(nome);
        this.saldo = saldo;
        this.extrato = new Stack<>();
        this.tipoConta = this.getClass().getSimpleName();
        this.gerente = new Gerente();
    }

    public abstract double sacar(double valor);

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void listarExtrato(){
        System.out.println("Seu extrato:");
        System.out.println(String.format("Número da conta: %d / Nome: %s", this.numero, this.cliente.getNome()));
        extrato.stream().forEach(Extrato::toString);
    }

    public void encerrar(){
        if(saldo == 0){
            System.out.println("Conta encerrada!");
        } else if (saldo > 0){
            System.out.println(
                    String.format("Ainda há dinheiro na sua conta. Realize um saque no valor de %s.", this.saldo));
        } else {
            System.out.println(String.format("Seu saldo está negativo. Realize um depósito no valor de %s.", this.saldo));
        }
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setExtrato(Stack<Extrato> extrato) {
        this.extrato = extrato;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Stack<Extrato> getExtrato() {
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