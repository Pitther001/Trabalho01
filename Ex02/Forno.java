public class Forno {
    public final int volume;
    public final int tensao;
    public final int potencia;
    public final int largura;
    public final int altura;
    public final int profundidade;
    private int temperatura = 0;
    private boolean ligado = false;
    public int timer;

    public Forno(int volume, int tensao, int potencia, int altura, int largura, int profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public int temperatura() {
        return temperatura;
    }

    public boolean ligado() {
        return ligado;
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            ligado = true;
            temperatura = 50;
        } else if (temperatura < 200) {
            temperatura = temperatura + 50;
        } else if (temperatura < 220) {
            temperatura = temperatura + 20;
        } else if (temperatura < 250) {
            temperatura = temperatura + 30;
        } else if (temperatura < 300) {
            temperatura = temperatura + 50;
        }
    }

    public void diminuirTemperatura(){
        if(temperatura == 300){
            temperatura = temperatura - 50;
        } else if(temperatura == 250){
            temperatura = temperatura - 30;
        } else if (temperatura == 220){
            temperatura = temperatura - 20;
        } else if (temperatura <=200 && temperatura <0) {
            temperatura = temperatura - 50;
            if(temperatura == 0){
                desligar();
            }
        }
    }

    public void desligar(){
        ligado = false;
        temperatura = 0;
    }

    public void setTimer(int tempo){
        if(tempo >=1 && tempo <=120){
            this.timer = tempo;
        }
    }

    public int tempoRestante(){
        return timer;
    }

    public void tick(){
        if (timer > 0) {
            timer--;
            if(timer == 0){
                desligar();
            }
        }
    }
}
