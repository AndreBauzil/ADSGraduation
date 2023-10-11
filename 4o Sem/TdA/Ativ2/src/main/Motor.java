package main;
public class Motor {
    private double cilindradas;
    private int potencia;

    private Carro carro;

    public boolean isLigado = false;

    public Motor(Carro carro, double cilindradas, int potencia) {
        this.carro = carro;
        this.cilindradas = cilindradas;
        this.potencia = potencia;
    }


    public boolean ligarMotor() {
        if(!isLigado){
            isLigado = !isLigado;
            return true;
        } else {
            return false;
        }
    }

    public boolean desligarMotor() {
        if(isLigado){
            isLigado = !isLigado;
            return true;
        } else {
            return false;
        }
    }

    public String acelerar() {
        if(carro.getBanco().isSafe() && this.isLigado)
            return "Acelerando";
        else if (!this.isLigado){
            return ("Ligue o motor");
        } else
            return "Bote o cinto";
    }


    public boolean getEstado() {
        return isLigado;
    }

    public double getCilindradas() {
        return cilindradas;
    }
    public int getPotencia() {
        return potencia;
    }
}