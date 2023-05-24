package Ex1e2;

public class Juridica extends Pessoa {
    // Atributos
    public int CNPJ;

    // ------- Ex2 --------
    @Override
    public int getIdade() {
        return super.getIdade()+100;
    }
    // --------------------

    // Getters e setters
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    public int getCNPJ() {
        return this.CNPJ;
    }
    
}
