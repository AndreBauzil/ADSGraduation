package main;

 public class Acessorios {
    private Carro carro;

    public Acessorios(Carro carro) {
        this.carro = carro;
    }

    public String ligar() {
        if (carro.getEstado()) return "Acessórios ligados";
        else return "Ligue o carro.";
    }

    public String desligar() {
        return "Acessórios desligados";
    }
}