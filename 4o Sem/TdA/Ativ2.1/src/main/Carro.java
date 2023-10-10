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
    private boolean estaLigado;
 
    // Constructor
    public Carro(String marca, String modelo, double cilindradas, int potencia, double qtdLitros, double kmPorLitro) {
        this.marca = marca;
        this.modelo = modelo;

        this.tanque = qtdLitros;
        this.kmPorLitro = kmPorLitro;

        this.motor = new Motor(cilindradas, potencia);

        this.pneu = new Pneu(100);
        this.banco = new Banco();
        this.vidro = new Vidro(false);
        this.acessorios = new Acessorios();
        this.painel = new Painel(this, motor);

        painel.mostrarInformacoes("");
    }

    // Funcionamento
    public void girarChave() {
        System.out.println("Girando a chave, aguarde");
        if (estaLigado==true) {
            this.desligar();
            motor.desligarMotor();
            System.out.println();
        } else if (nivelTanque!=0) {
            this.ligar();
            motor.ligarMotor();
            System.out.println();
        } else {
            System.out.println("Carro com tanque vazio, abasteça para dirigir");

        }
    }
    public void ligar() {
        System.out.println("Ligando o carro.");
        estaLigado = true;
    }
    public void desligar() {
        System.out.println("Desligando o carro.");
        estaLigado = false;
    }

    public void dirigir(double km) {
        System.out.println("\nManobrando o carro, aguarde");
        if (nivelTanque==0) {
            System.out.print("Carro com tanque vazio, abasteça para dirigir.");
        } else {
            System.out.println("Carro em movimento.");
            pneu.girarPneus(banco);
            this.setKm(km);
            this.consumir(km);
            System.out.println("O carro rodou " + km + "KMs");
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