package Ex3e4;

public class Juridica extends Pessoa {
    private long CNPJ;

    // ------- Ex3 -------
    public Juridica(String nome, int idade, long CNPJ) {
      super(nome, idade+100);
      this.CNPJ = CNPJ;
    }
    // -------------------

    public void setCNPJ(long CNPJ) {
      this.CNPJ = CNPJ;
    }

    public long getCNPJ() {
      return this.CNPJ;
    }
}
