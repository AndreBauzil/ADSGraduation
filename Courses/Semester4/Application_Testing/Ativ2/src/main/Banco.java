package main;

public class Banco extends Carro{
    boolean cinto = false; 
    private Carro carro;

    public Banco(Carro carro) {
        this.carro = carro;
    }

    public boolean isSafe() {
        if (cinto == true) {
            return true;
        } else {
            return false;
        }
    }

    public void colocarCinto() {
        cinto = true;
    }
    public void tirarCinto() {
        cinto = false;
    }


    public void ajustarPosicao() {
        System.out.println("Banco ajustado.");
    }

    public boolean aquecerBanco() {
        if(carro.getEstado() == true){
            System.out.println("Banco aquecido.");
            return true;
        } else {
            System.out.println("Ligue o carro");
            return false;
        }
    }
}