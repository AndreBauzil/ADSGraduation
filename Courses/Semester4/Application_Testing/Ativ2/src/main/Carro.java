package main;

import java.text.DecimalFormat;

// Classe Carro
public class Carro {
    // Atributos
        // gasolina
    private double km;
    private double kmPorLitro;
    private double tanque;
    private double nivelTanque = 0.0;

        // carro
    private String marca;
    private String modelo;
    
    private Motor motor;
    private Pneu pneu;
    private Banco banco;
    private Vidro vidro;
    private Acessorios acessorios;
    private Painel painel;

        // etc
    private boolean isLigado;
 
    // Constructor
    public Carro() {};
    public Carro(String marca, String modelo, double cilindradas, int potencia, double qtdLitros, double kmPorLitro) {
        this.marca = marca;
        this.modelo = modelo;

        this.tanque = qtdLitros;
        this.kmPorLitro = kmPorLitro;

        this.motor = new Motor(this, cilindradas, potencia);

        this.pneu = new Pneu(100);
        this.pneu = new Pneu(this);
        this.banco = new Banco(this);
        this.vidro = new Vidro(this);
        this.acessorios = new Acessorios(this);
        this.painel = new Painel(this, motor);

        painel.mostrarInformacoes("");
    }

    // Funcionamento
    public String girarChave() {
        if(banco.isSafe()){
            System.out.println("Girando a chave, aguarde");
            if (isLigado == true) {
                this.desligar();
                motor.desligarMotor();
                System.out.println("Desligado");
                return "Desligado";
            } else if (nivelTanque!=0) {
                this.ligar();
                motor.ligarMotor();
                System.out.println("Ligado");
                return "Ligado" ;
            } else {
                return "tanque vazio";
            }
        } else {
            return "Coloque o cinto";
        }
    }
    public void ligar() {
        System.out.println("Ligando o carro.");
        this.isLigado = true;
    }
    public void desligar() {
        System.out.println("Desligando o carro.");
        this.isLigado = false;
    }

    public void dirigir(double km) {
        System.out.println("\nManobrando o carro, aguarde.");
        if (nivelTanque==0) {
            System.out.print("Carro com tanque vazio, abasteça para dirigir.");
        } else {
            System.out.println("Carro em movimento.");
            pneu.girarPneus();
            this.setKm(km);
            this.consumir(km);
            System.out.println("O carro rodou " + km + "KMs.");
        }
    }


    // Resto das classes
    public void abrirJanela() {
        vidro.abrirVidros();
    }
    public void ajustarBanco() {
        banco.ajustarPosicao();
    }
    public void ligarAcessorios() {
        acessorios.ligar();
    }
        // Painel
    public void exibirPainelSimples() {
        System.out.println("\nPainel do Carro:");
        painel.mostrarInformacoes("simples");
    }
    public void exibirPainelAvançado() {
        System.out.println("\nPainel do Carro:");
        painel.mostrarInformacoes("");
    }

    // etc
        // getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public double getKm() {
        return km;
    }
    public double getKmPorLitro() {
        return kmPorLitro;
    }
    public double getTanque() {
        return tanque;
    }

    public double getNivelTanque() {
        return nivelTanque;
    }
    public double getNivelCombustivel() {
        if (nivelTanque!=0) {
            return ((nivelTanque/tanque)*100);
        } else {
            return nivelTanque;
        }
    }
    public boolean getEstado() {
        return isLigado;
    }

    public Pneu getPneu() {
        return this.pneu;
    }
    public Banco getBanco() {
        return this.banco;
    }
    public Motor getMotor() {
        return motor;
    }
    public Vidro getVidro() {
        return vidro;
    }
    public Acessorios getAcessorios() {
        return acessorios;
    }
    public Painel getPainel() {
        return painel;
    }


    // setters
    public void setKm(double km) {
        this.km += km;
    }
    

    public void abastecer(double litrosGasolina) {
        this.nivelTanque += litrosGasolina;
        System.out.println("\nCarro abastecido com " + litrosGasolina + "L de gasolina" );
        System.out.println("Nível atual do tanque: " + nivelTanque + "\n");
    }
    public void consumir(double km) {

        String consumoStr = (new DecimalFormat("#.##").format(km / kmPorLitro));
        double consumo = Double.valueOf(consumoStr.replaceAll(",", "."));

        if (consumo <= nivelTanque) {
            this.nivelTanque -= consumo;
            System.out.println("Consumiu " + consumo + " litros de gasolina. \nNível do tanque: " + nivelTanque + " litros.");
        } else {
            System.out.println("Sem gasolina suficiente para percorrer " + km + " quilômetros.");
        }
    }
}