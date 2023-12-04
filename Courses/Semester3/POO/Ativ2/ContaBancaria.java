package Ativ2;

public class ContaBancaria {
    // Atributos
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    // Constructor
    public ContaBancaria(String nomeTitular, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    // Métodos
    public void mostrar() {
        System.out.println("Você acessou na conta de " + nomeTitular + ".");
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + this.numeroConta + ".");
    }
    
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + this.numeroConta + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque na conta " + this.numeroConta + ".");
        }
    }
}