package dia12.Televisão;


//Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
//        aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//        aumentar e diminuir o número do canal em uma unidade
//        trocar para um canal indicado;
//        consultar o valor do volume de som e o canal selecionado.



public class Televisao {

    private Integer volume = 15;

    private Integer canal = 13; // Globo

    public void ajustarVolume(Integer volume) {
        if (volume == -1) {
            this.diminuirVolume();
        } else if (volume == 1) {
            this.aumentarVolume();
        }
    }

    private void aumentarVolume() {

        if (this.volume == 50){
            return;
        }

        this.volume++;
    }

    private void diminuirVolume() {
        if (this.volume == 0) {
            return;
        }

        this.volume--;
    }

    public void aumentarCanal() {
        if (this.canal == 100) {
            this.canal = 0;
        } else {
            this.canal++;
        }
    }

    public void diminuirCanal() {
        if (this.canal == 1) {
            this.canal = 100;
        } else {
            this.canal--;
        }
    }

    public void trocarParaUmCanal(Integer canal) {
        if (canal < 1 || canal > 100) {
            return;
        }
        this.canal = canal;
    }

    public void infoCanalESom() {
        System.out.printf("A tv esta no canal %d\n", this.canal);
        System.out.printf("A tv esta no volume %d\n", this.volume);
    }

}
