package Ex2;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        // Criação de pessoas e inserção de dados hardcode
        Pessoa pessoa = new Pessoa("Andre", 19);
        Pessoa pessoa1 = new Pessoa("Maria", 48);
        Pessoa pessoa2 = new Pessoa("José", 7);
        Pessoa pessoa3 = new Pessoa("Ana", 23);
        Pessoa pessoa4 = new Pessoa("Antônio", 67);
        
        // Acomodando as pessoas em uma stack
        Stack<Pessoa> pessoas = new Stack<Pessoa>();
        pessoas.push(pessoa);
        pessoas.push(pessoa1);
        pessoas.push(pessoa2);
        pessoas.push(pessoa3);
        pessoas.push(pessoa4);

        // Mostrando os dados em único JOptionPane
        String mensagem = "";
        for (Pessoa pes : pessoas) {
            mensagem += "Nome: " + pes.getNome()
            + "\nIdade: " + pes.getIdade()+ "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem, "Exercício 2", JOptionPane.INFORMATION_MESSAGE);

        // Retirando 2 elementos e mostrando-a novamente
        pessoas.pop();
        pessoas.pop();
        
        mensagem = "";
        for (Pessoa pes : pessoas) {
            mensagem += "Nome: " + pes.getNome()
            + "\nIdade: " + pes.getIdade()+ "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem, "Exercício 2", JOptionPane.INFORMATION_MESSAGE);

    }
}