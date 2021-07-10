package dia12.ConversaoDeUnidade;

public class Main {

    public static void main(String[] args) {

        System.out.println(ConversaoDeUnidades.converteMetrosQuadradosParaPesQuadrados(1));
        System.out.println(ConversaoDeUnidades.converteMetrosQuadradosParaPesQuadrados(2));
        System.out.println(ConversaoDeUnidades.converteMetrosQuadradosParaPesQuadrados(0.5));
        System.out.println(ConversaoDeUnidades.converteMetrosQuadradosParaPesQuadrados(1.5));

        System.out.println("-----------------------------------------");

        System.out.println(ConversaoDeUnidades.convertePesQuadradosParaCentimetrosQuadrados(1));
        System.out.println(ConversaoDeUnidades.convertePesQuadradosParaCentimetrosQuadrados(2));
        System.out.println(ConversaoDeUnidades.convertePesQuadradosParaCentimetrosQuadrados(0.5));
        System.out.println(ConversaoDeUnidades.convertePesQuadradosParaCentimetrosQuadrados(1.5));

        System.out.println("-----------------------------------------");


        System.out.println(ConversaoDeUnidades.converteMilhasQuadradosParaAcres(1));
        System.out.println(ConversaoDeUnidades.converteMilhasQuadradosParaAcres(2));
        System.out.println(ConversaoDeUnidades.converteMilhasQuadradosParaAcres(0.5));
        System.out.println(ConversaoDeUnidades.converteMilhasQuadradosParaAcres(1.5));

        System.out.println("-----------------------------------------");


        System.out.println(ConversaoDeUnidades.converteAcreParaPesQuadrados(1));
        System.out.println(ConversaoDeUnidades.converteAcreParaPesQuadrados(2));
        System.out.println(ConversaoDeUnidades.converteAcreParaPesQuadrados(0.5));
        System.out.println(ConversaoDeUnidades.converteAcreParaPesQuadrados(1.5));

//        System.out.println("-----------------------------------------");
//        System.out.println(ConversaoDeUnidades.convertePesQuadradosParaCentimetrosQuadrados(
//                ConversaoDeUnidades.converteAcreParaPesQuadrados(1)
//        ));
    }
}
