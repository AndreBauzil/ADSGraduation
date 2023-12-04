package Ex3e4;

public class Professor extends Pessoa {
    // Atributos
    private double salario;

    // Constructor
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Getters e setters
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

}
