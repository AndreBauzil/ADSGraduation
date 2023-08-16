package Banco;

public class Conta extends Cliente {
    // Atributos
    private double saldo;
    private double divida;
    

    //Construtores
    public Conta(double saldo) {      /* Conta comum */
        this.saldo = saldo;
    } 
    public Conta(double saldo, double divida) {   /* Conta endividada */
        this.saldo = saldo;
        this.divida = divida;
    } 
    


    public String Saldar(){
        return this.saldo < this.divida ? "Saldo insuficiente" : "Dívida saldada";
    }
    
    public double Sacar(double valor){
        return this.saldo -= valor;
    }
    
    public double Depositar(double valor){
        return this.saldo += valor;
    }
    
    public double transferPara(Conta receptor, double valor){
        // return this.Sacar(valor);
    }
    
    public double exibirSaldo(){
        return this.saldo;
    }
}
