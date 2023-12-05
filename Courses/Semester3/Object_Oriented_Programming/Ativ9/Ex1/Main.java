package Ex1;
import java.util.ArrayList;
import Classes.*;

/**
 * Main - Exercício 1
 */

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos com dados hardcode
        Gerente gerente = new Gerente("Paulo", 45, "Av. Rodrigo Alves", 15450);
        Programador programador = new Programador("Rodrigo", 32, "R. Lobo da Costa", 10500);
        Vendedor vendedor = new Vendedor("Flavio", 28, "R. Maroto Felipe", 8000);

        // Armazena na arraylist de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); 
        pessoas.add(gerente);
        pessoas.add(programador);
        pessoas.add(vendedor);

        // Percorre a arraylist com for compactado e mostra todos os dados
        int cont=0;
        for (Pessoa pessoa : pessoas) {
            cont++;
            System.out.println(
                cont + ": Nome: "+pessoa.getNome()
                +", Idade: "+pessoa.getIdade()
                +", Endereço: "+pessoa.getEndereco()
                +", Salário Base: "+String.format("%.2f",pessoa.getSalario())
                +", Salário: "+String.format("%.2f",pessoa.calculaSalario())
            );
        }
    }
}