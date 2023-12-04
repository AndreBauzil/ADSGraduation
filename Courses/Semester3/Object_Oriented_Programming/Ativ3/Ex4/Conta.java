package Ex4;

public class Conta {
    private float saldo;
    
    // Métodos
    
    public boolean retirada(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public float getSaldo(){
        return saldo;
    }

    public void deposito(float valor){
        saldo = saldo + valor;
    }
    
    
}