package Ex3;

/**
 * Corrente
 */
public class Corrente extends Conta {
    public Corrente(String nome, int idade, String endereco, double saldo) {
        super(nome, idade, endereco, saldo);
    }

    @Override
    public String tipo() {
        return "Corrente";
    }

    @Override
    public double calculaOperacao() {  // Retira 15% do saldo final
        return retira(getSaldo()*0.15);
    }

}