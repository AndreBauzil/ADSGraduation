/**
 * Main
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* ------------ Ex1 ------------
            O polimorfismo é um prática que permite 
            tratar diferentes objetos de maneira semelhante, 
            mesmo que eles tenham comportamentos ou características diferentes,
            é como se várias coisas diferentes pudessem ser tratadas 
            como se fossem do mesmo tipo. Por exemplo, os animais...
         ------------------------------ */


        /* ------------ Ex2 ------------
            O Polimorfismo Estático é quando temos a mesma função
			implementada várias vezes na mesma classe, a escolha de qual função
			vai ser chamada depende da assinatura do método sobrecarregado. 
            Já o Dinâmico acontece na herança, quando a subclasse 
			sobrepõe (Override) o método original.
         ------------------------------ */
    

        // ------------ Ex3 ------------
        Boi boi = new Boi();
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Elefante elefante = new Elefante();
        Gato gato = new Gato();
        Leao leao = new Leao();

        boi.setNomeEspecie("Boi");
        cachorro.setNomeEspecie("Cachorro");
        cavalo.setNomeEspecie("Cavalo");
        elefante.setNomeEspecie("Elefante");
        gato.setNomeEspecie("Gato");
        leao.setNomeEspecie("Leão");
        // -----------------------------


        // ------------ Ex4 ------------
        ArrayList<Mamiferos> animais = new ArrayList<>();
        animais.add(boi);
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(elefante);
        animais.add(gato);
        animais.add(leao);

        for (Mamiferos animal : animais) {
            System.out.println(
                "O animal que faz o som '"+animal.som()
                +"' é o "+animal.getNomeEspecie()
            );
        }
        // -----------------------------
    }
}