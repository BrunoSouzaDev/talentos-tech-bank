package dia13.banco.PetBank.utils;

import dia13.banco.PetBank.domain.Banco;

public class NumberUtils {

    public static Integer gerarNumeroDeContaAleatorio(){
        int numero = 0;
        do {
            numero = (int) (Math.random() * 10000);
        }while(Banco.procurarConta(numero) != null
                || numero < 1000);

        return numero;
    }


}
