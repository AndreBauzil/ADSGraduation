public class Inscrito extends Pessoa {
    private int inscricao;
    
    public Inscrito(String nome, int idade, String endereco, int inscricao) {
        super(nome, idade, endereco);
        this.inscricao = inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    public int getInscricao() {
        return inscricao;
    }
}