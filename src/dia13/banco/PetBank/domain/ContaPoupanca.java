package dia13.banco.PetBank.domain;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    public double sacar(double valor){
        if(getSaldo() >= valor) {
            setSaldo(getSaldo()-valor);
            adicionarLancamento(valor);

            System.out.println("Saque realizado com sucesso!");
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

    @Override
    public void transferirPara(Conta conta, double valor) {
        if(getSaldo() >= valor){
            this.setSaldo(this.getSaldo()-valor);
            conta.depositar(valor);
        }
    }

}
