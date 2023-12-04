package Ex3e4;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    // ------------------- Ex3 -------------------
    // Criando pessoas e adicionando os atributos (Hardcode)
    Fisica pessoa1 = new Fisica("Andre", 19, 1234567890);
    Juridica pessoa2 = new Juridica("Empresa", 4, 12345678901234L);

    // Mensagem na tela - Física
    String message = "Nome: " + pessoa1.getNome() 
    + "\nIdade: " + pessoa1.getIdade();
    JOptionPane.showMessageDialog(null, message, "Exercício 3", JOptionPane.INFORMATION_MESSAGE);

    // Mensagem na tela - Juridica
    String message1 = "Nome: " + pessoa2.getNome() 
    + "\nIdade: " + pessoa2.getIdade();
    JOptionPane.showMessageDialog(null, message1, "Exercício 3", JOptionPane.INFORMATION_MESSAGE);
    // -------------------------------------------
    
    // ------------------- Ex4 -------------------
    // Criando professor e alunos
    Professor prof = new Professor("Alexandre",30,5000.00);
    Aluno aluno = new Aluno("José", 18, 7.8);
    Aluno aluno1 = new Aluno("Maria", 26, 9.3);

    // Mostrar professor e alunos
    String messageProf = "Nome: " + prof.getNome() 
    + "\nIdade: " + prof.getIdade()
    + "\nSalario: R$" + prof.getSalario();
    JOptionPane.showMessageDialog(null, messageProf, "Exercício 4", JOptionPane.INFORMATION_MESSAGE);
    
    String messageAlu = "Nome: " + aluno.getNome() 
    + "\nIdade: " + aluno.getIdade()
    + "\nNota: " + aluno.getNota();
    JOptionPane.showMessageDialog(null, messageAlu, "Exercício 4", JOptionPane.INFORMATION_MESSAGE);
    
    String messageAlu1 = "Nome: " + aluno1.getNome() 
    + "\nIdade: " + aluno1.getIdade()
    + "\nNota: " + aluno1.getNota();
    JOptionPane.showMessageDialog(null, messageAlu1, "Exercício 4", JOptionPane.INFORMATION_MESSAGE);
    // -------------------------------------------

  }
}
