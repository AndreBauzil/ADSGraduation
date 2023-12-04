package Ex3e4;

public class Aluno extends Pessoa {
    // Atributos
    private double nota;

    // Constructor
    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    // Getters e setters
    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
}
