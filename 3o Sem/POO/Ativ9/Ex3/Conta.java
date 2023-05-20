package Ex3;

/**
 * Conta
 */

public abstract class Conta {
    // Atributos
    private String nome;
    private int idade;
    private String endereco;
    private double saldo;

    // Constructor
    public Conta(String nome, int idade, String endereco, double saldo){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    // Métodos
    public double deposita(double valorDeposito) {
        return this.saldo += valorDeposito;
    }
    public double retira(double valorSaque) {
        return this.saldo -= valorSaque;
    }

    abstract public String tipo();  // Que retorna o tipo da conta
    abstract public double calculaOperacao(); // Operação que calcula o salário final conforme o tipo

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    // Apenas o getSaldo()
    public double getSaldo() {
        return saldo;
    }
}