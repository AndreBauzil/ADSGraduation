public class Cachorro {
    // Atributos
    private String nome;
    private int idade;
    private String corPelo;
    private int ID;

    // Construtor
    public Cachorro(String nome, int idade, String corPelo) {
        this.nome = nome;
        this.idade = idade;
        this.corPelo = corPelo;
    }

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

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public String getCorPelo() {
        return corPelo;
    }

    public void setId(int ID) {
        this.ID = ID;
    }
    public int getId() {
        return ID;
    }
}