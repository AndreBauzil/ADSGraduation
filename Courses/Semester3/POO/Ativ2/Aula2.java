package Ativ2;

/*
 * Created by Andre G. Bauzil
 */
public class Aula2 {
    public static void main(String[] args) {
        // Instâncias
        ContaBancaria conta = new ContaBancaria("Maria", 123456, 1000.0);
        Cachorro cachorro = new Cachorro("Toby", 2, 50, "Preto", 50);
        Pessoa pessoa = new Pessoa("Andre", 19, 100, true);

        // "Ações" (Métodos)
        // Classe Pessoa
        System.out.println("\n-------- Pessoa --------");
        pessoa.atirar();
        pessoa.envelhecer();
        pessoa.perderVida(20);
        
        // Classe Cachorro
        System.out.println("\n-------- Cachorro --------");
        cachorro.latir();
        cachorro.morder();
        cachorro.envelhecer();
        cachorro.perderVida(30);
        cachorro.olharPelo();
        
        // Classe ContaBancaria
        System.out.println("\n-------- Conta Bancária --------");
        conta.mostrar();
        conta.sacar(500.0);
        conta.depositar(1000.0);
        System.out.println();
    }
}


