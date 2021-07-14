package dia13.banco.Trybank;

public class ContaCorrente extends Conta{

    private double limite;

    ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
        this.limite = 500.00;

    }

    @Override
    public double sacar(double valor) {
        double limiteSaque = getSaldo() + limite;

        if(limiteSaque >= valor) {
            checarLimite(valor);
            System.out.println("Saque realizado com sucesso!");
            setSaldo(getSaldo()-valor);
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

    private void checarLimite(double valor){
        if(valor > getSaldo()){
            System.out.println("Usando cheque especial.");
        }
    }

    public void adicionarLimiteChequeEspecial(double valor, String senha){
        if(getGerente().getSenha().equals(senha)){
            this.limite = valor;
        }
    }
}