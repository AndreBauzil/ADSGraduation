package Classes;
public class Fisica extends Pessoa {
    // Atributos
    private long CPF;
    
    public Fisica(String nome, int idade, long CPF) {
        super(nome, idade);
        this.CPF = CPF;
    }

    // Getters e setters
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    public long getCPF() {
        return this.CPF;
    }
}