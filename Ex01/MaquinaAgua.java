package Trabalho01.Ex01;

public class MaquinaAgua {
    private int copos200;
    private int copos300;
    private int agua;

    public MaquinaAgua() {
        this.copos200 = 0;
        this.copos300 = 0;
        this.agua = 0;
    }

    public int copos200() {
        return this.copos200;
    }

    public int copos300() {
        return this.copos300;
    }

    public int agua() {
        return this.agua;
    }

    public void servirCopo200() {
        if (this.copos200 > 0 && this.agua >= 200) {
            this.copos200--;
            this.agua -= 200;
        }
    }

    public void abastecerAgua() {
        this.agua = 20000;
    }

    public void abastecerCopo200() {
        this.copos200 = 100;
    }

    public void abastecerCopo300() {
        this.copos300 = 100;
    }
    
    public void servirCopo300() {
        if (this.copos300 > 0 && this.agua >= 300) {
            this.copos300--;
            this.agua -= 300;
        }
    }
}
