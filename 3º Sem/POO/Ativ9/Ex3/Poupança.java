package Ex3;

/**
 * Poupança
 */
public class Poupança extends Conta {
    public Poupança(String nome, int idade, String endereco, double saldo) {
        super(nome, idade, endereco, saldo);
    }

    @Override
    public String tipo() {
        return "Poupança";
    }

    @Override
    public double calculaOperacao() {  // Soma 20% ao saldo final
        return deposita(getSaldo()*0.20);
    }

    
}