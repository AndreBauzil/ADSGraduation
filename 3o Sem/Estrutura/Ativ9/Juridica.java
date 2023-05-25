public class Juridica extends Pessoa {
    // Atributos
    public int CNPJ;

    public Juridica(String nome, int idade, int CNPJ) {
        super(nome, idade);
        this.CNPJ = CNPJ;
    }
    // Getters e setters
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    public int getCNPJ() {
        return this.CNPJ;
    }
    
}
