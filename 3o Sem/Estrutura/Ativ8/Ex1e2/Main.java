package Ex1e2;
import java.util.*;
import Classes.*;
import javax.swing.JOptionPane;


/**
 * Main - Exercício 1 e 2
 */

public class Main {
    public static void main(String[] args) {
        // --------------- Ex1 ---------------
        Queue<Integer> fila = new LinkedList<>(); 
        
        for (int i = 1; i < 11; i++) {   // For que adiciona números de 1 a 10 na fila
            fila.add(i);
        }
        for (int i = 0; i < 5; i++) {   // For que retira 4 itens da fila
            fila.remove();
        }
        System.out.println(   // Mostra a lista
            "--------------- Ex1 ---------------\n"
            +fila
            +"\n-----------------------------------"
        );      
        // -----------------------------------

        // --------------- Ex2 ---------------
        // Criação da queue de pagaemmento de contas e dos civis de forma hardcode junto da adição na queue
        Queue<Pessoa> civis = new LinkedList<Pessoa>();
        civis.add(new Civil("Andre", 19, "Av. 24 de Maio"));  
        civis.add(new Civil("Simone", 59, "R. Tapirapé"));
        civis.add(new Civil("Fernando", 62, "R. Júlio Reis"));
        civis.add(new Civil("Cecília", 39, "Tra. Vinte e Quatro"));
        civis.add(new Civil("Raul", 26, "Rua do Porto"));

        // Mostra todos os dados das pessoas das fila em um único JOption
        JOptionPane.showMessageDialog(null, listaDados(civis), "Pagamento de Conta", JOptionPane.INFORMATION_MESSAGE);

        // Retira 2 elementos da fila e mostra novamente
        for (int i = 0; i < 2; i++){
            civis.remove();
        }
        JOptionPane.showMessageDialog(null, listaDados(civis), "Pagamento de Conta", JOptionPane.INFORMATION_MESSAGE);
        // -----------------------------------

    }

    // Método para criar a lista de dados das pessoas na Queue específicada como uma única mensagem
    public static String listaDados(Queue<Pessoa> queue) { 
        String message = "";
        for (Pessoa pes : queue) {
            message += "Nome: "+pes.getNome()
            +"\nIdade: "+pes.getIdade()
            +"\nEndereço: "+pes.getEndereco()+"\n\n";
        }
        return message;
    }
}