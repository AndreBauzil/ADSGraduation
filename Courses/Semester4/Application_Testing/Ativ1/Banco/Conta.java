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
    

    // Métodos
    public void Saldar(){
        System.out.println(
            this.saldo < this.divida ? "Saldo insuficiente" : "Dívida saldada"
        );
    }
    
    public void Sacar(double valor){
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado");
        } else {
            System.out.println("Saque não realizado");
        }
    }
    
    public void Depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado");
    }
    
    public void transferPara(Conta receptor, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            receptor.Depositar(valor);
            System.out.println("Transferência realizada");
        } else {
            System.out.println("Transferência não realizada");
        }
    }
    
    public void exibirSaldo(){
        System.out.println("O Seu saldo é de R$" + this.saldo);
    }
}