public class ContaCorrente {
    private float saldo;
    
    // Métodos
        // Ex 3
    public String retirada(float valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return "Depósito Realizado!";
        } else{
            return "Não foi possível realizar o saque";
        }
    }

    public float getSaldo(){
        return saldo;
    }

    public void deposito(float valor){
        saldo = saldo + valor;
    }
}