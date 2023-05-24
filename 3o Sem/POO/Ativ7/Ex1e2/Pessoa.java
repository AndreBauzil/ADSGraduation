/**
 * Pessoa
 */
package Ex1e2;

abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    
    // Getters e setters
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
}