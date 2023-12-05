package Classes;

public abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String endereco;

    // Apenas um Construtor que recebe todos os dados
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Método
    abstract public double calculaSalario();
    abstract public double getSalario();

    // Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
