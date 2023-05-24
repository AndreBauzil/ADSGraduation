package Classes;

public class Gerente extends Pessoa {
    private double salario;
    
    // Construtor
    public Gerente(String nome, int idade, String endereco, double salario) {
        super(nome,idade,endereco);
        this.salario = salario;
    }

    // Método
    @Override // Acrescimo de 20% no valor do salario total
    public double calculaSalario() {
        return salario * 1.2;
    }

    // Getters e Setters
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public double getSalario() {
        return salario;
    }
}
