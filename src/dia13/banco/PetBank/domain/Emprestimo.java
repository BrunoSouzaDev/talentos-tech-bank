package dia13.banco.PetBank.domain;

public class Emprestimo {

    private static final double juros = 0.0398;

    public static void simularEmprestimo(double emprestimo, int numeroDeParcelas) {
        double montante = calculoMontante(emprestimo, numeroDeParcelas);
        double valorDaParcela = montante/numeroDeParcelas;

        System.out.println("---------------------------");
        System.out.printf(String.format("Para um emprestimo de %s você tera %s parcelas no valor de %.2f.", emprestimo, numeroDeParcelas, valorDaParcela));
    }

    private static double calculoMontante(double emprestimo, int numeroDeParcelas){
        double montanteAhPagar = emprestimo*(Math.pow((1+juros),numeroDeParcelas));

        return montanteAhPagar;
    }
}
