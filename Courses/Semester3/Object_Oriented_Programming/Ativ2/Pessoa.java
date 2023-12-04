package Ativ2;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private int quantVida;
    private boolean habilidadeParaAtirar;
    
    // Constructor
    public Pessoa(String nome, int idade, int quantVida, boolean habilidadeParaAtirar) {
        this.nome = nome;
        this.idade = idade;
        this.quantVida = quantVida;
        this.habilidadeParaAtirar = habilidadeParaAtirar;
    }
    
    // Métodos
    public void atirar() {
        if (this.habilidadeParaAtirar) {
            System.out.println(this.nome + " atirou!");
        } else {
            System.out.println(this.nome + " não tem habilidade para atirar.");
        }
    }
    
    public void envelhecer() {
        this.idade++;
        System.out.println(this.nome + " envelheceu para " + this.idade + " anos.");
    }
    
    public void perderVida(int dano) {
        this.quantVida -= dano;
        if (this.quantVida <= 0) {
            System.out.println(this.nome + " morreu.");
        } else {
            System.out.println(this.nome + " perdeu " + dano + " pontos de vida e agora tem " + this.quantVida + " pontos de vida.");
        }
    }
}
