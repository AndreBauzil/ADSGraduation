package Ex3e4;
 
public class Fisica extends Pessoa {
    private int CPF;
    
    // ------- Ex3 --------
    public Fisica(String nome, int idade, int CPF) {
        super("Dr. "+nome, idade);
        this.CPF = CPF;
    }
    // --------------------

    public void setCPF(int cPF) {
        this.CPF = cPF;
    }
    public int getCPF() {
        return this.CPF;
    }
}
