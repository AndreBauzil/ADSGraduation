/**
 * Pessoa2
 */
package Ex3e4;

abstract class Pessoa {
  // Atributos
  private String nome;
  public int idade;

  // ------- Ex3 ------
  // Construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  // ------------------

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