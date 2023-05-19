public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private int quantVida;
    private boolean habAtirar;
    
    // Getters e setters
        // Ex 1
    public boolean setNome(String nomeTemp) {
        if (nomeTemp.length() > 0) {
            this.nome = nomeTemp;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }

        // Ex 2
    public String setIdade(int idade) {
        this.idade = idade;
        String tipo;

        if (idade>=0 && idade<=3) {
            tipo = "Bebê";
        } else if (idade>=4 && idade<=12) {
            tipo = "Criança";
        } else if (idade>=13 && idade<=17) {
            tipo = "Adolescente";
        } else if (idade>=18 && idade<=59) {
            tipo = "Adulto";
        } else if (idade>60) {
            tipo = "Idoso";
        } else {
            tipo = "Idade inválida"; 
        }
        return tipo;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setQuantVida(int quantVida) {
        this.quantVida = quantVida;
    }
    
    public int getQuantVida() {
        return quantVida;
    }

    public void setHabAtirar(boolean habAtirar) {
        this.habAtirar = habAtirar;
    }
    
    public boolean getHabAtirar() {
        return habAtirar;
    }
    
}
