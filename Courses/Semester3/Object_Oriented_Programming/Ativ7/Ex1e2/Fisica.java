package Ex1e2;

public class Fisica extends Pessoa {
    // Atributos
    private int CPF;

    // ------- Ex1 -------
    @Override
    public String getNome() {
        return "Dr. "+super.getNome();
    }
    // ------------------

    // Getters e setters
    public void setCPF(int cPF) {
        this.CPF = cPF;
    }
    public int getCPF() {
        return this.CPF;
    }
}
