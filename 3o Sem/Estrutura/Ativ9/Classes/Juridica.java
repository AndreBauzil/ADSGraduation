package Classes;
public class Juridica extends Pessoa {
    // Atributos
    public long CNPJ;

    public Juridica(String nome, int idade, long CNPJ) {
        super(nome, idade);
        this.CNPJ = CNPJ;
    }
    // Getters e setters
    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }
    public long getCNPJ() {
        return this.CNPJ;
    }
    
}
