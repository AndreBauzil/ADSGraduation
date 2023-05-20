/**
 * Mamiferos
 */
abstract class Mamiferos {
    // Atributos
    private String nomeEspecie;
    private String vocalizacao;

    
    // Métodos
    public String som() {
        return vocalizacao;
    }
    
    public String nome() {
        return nomeEspecie;
    }

    // Getters e setters
    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setVocalizacao(String vocalizacao) {
        this.vocalizacao = vocalizacao;
    }
    
}