package dia13.banco;

public class ContaPoupanca extends Conta{


    ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    public double sacar(double valor){
        if(getSaldo() >= valor) {
            System.out.println("Saque realizado com sucesso!");
            setSaldo(getSaldo()-valor);
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

}