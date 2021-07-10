package dia12.Televisão;

//Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
//        aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//        aumentar e diminuir o número do canal em uma unidade
//        trocar para um canal indicado;
//        consultar o valor do volume de som e o canal selecionado.

import javax.naming.ldap.Control;

public class ControleRemoto {

    private Televisao televisao;

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume(){
        this.televisao.ajustarVolume(1);
    }

    public void diminuirVolume(){
        this.televisao.ajustarVolume(-1);
    }

    public void aumentarCanal() {
        this.televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        this.televisao.diminuirCanal();
    }

    public void trocarParaUmCanal(Integer canal) {
        this.televisao.trocarParaUmCanal(canal);
    }

    public void infoCanalESom() {
        this.televisao.infoCanalESom();
    }

    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        Televisao lg = new Televisao();

        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.setTelevisao(samsung);

        System.out.println("----------------SAMSUNG----------------");
        controleRemoto.setTelevisao(samsung);


        controleRemoto.aumentarVolume();
        controleRemoto.infoCanalESom();

        controleRemoto.diminuirCanal();
        controleRemoto.infoCanalESom();

        controleRemoto.trocarParaUmCanal(7);
        controleRemoto.infoCanalESom();

        System.out.println("----------------LG----------------");

        controleRemoto.setTelevisao(lg);
        controleRemoto.infoCanalESom();


        controleRemoto.diminuirVolume();
        controleRemoto.aumentarCanal();
        controleRemoto.infoCanalESom();

        System.out.println("---Vendo as informações pela própria TV---");
        samsung.infoCanalESom();
        lg.infoCanalESom();
    }
}
