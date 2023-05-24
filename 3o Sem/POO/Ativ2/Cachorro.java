package Ativ2;

public class Cachorro {
    // Atributos
    private String nome;
    private int idade;
    private int quantVida;
    private String corDoPelo;
    private int forcaDaMordida;

    // Constructor
    public Cachorro(String nome, int idade, int quantVida, String corDoPelo, int forcaDaMordida) {
        this.nome = nome;
        this.idade = idade;
        this.quantVida = quantVida;
        this.corDoPelo = corDoPelo;
        this.forcaDaMordida = forcaDaMordida;
    }
    
    // Métodos
    public void latir() {
        System.out.println(this.nome + " está latindo.");
    }
    
    public void morder() {
        System.out.println(this.nome + " mordeu com força de " + this.forcaDaMordida + " quilos.");
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

    public void olharPelo() {
        System.out.println("A cor do pelo é " + this.corDoPelo + ".");
    }
}


