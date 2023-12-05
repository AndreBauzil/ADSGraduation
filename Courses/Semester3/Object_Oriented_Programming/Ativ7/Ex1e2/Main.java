package Ex1e2;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        // Criando pessoas e adicionando os atributos (Hardcore)
        Fisica pessoa1 = new Fisica();
        pessoa1.setNome("Andre");
        pessoa1.setIdade(19);

        Juridica pessoa2 = new Juridica();
        pessoa2.setNome("Empresa");
        pessoa2.setIdade(4);

        // Mensagem na tela - Física
        String message = "Nome: "+pessoa1.getNome() + "\nIdade: "+pessoa1.getIdade();
        JOptionPane.showMessageDialog(null, message, "Exercício 1", JOptionPane.INFORMATION_MESSAGE);

        // Mensagem na tela - Jurídica
        String message1 = "Nome: " + pessoa2.getNome() + "\nIdade: " + pessoa2.getIdade();
        JOptionPane.showMessageDialog(null, message1, "Exercício 2", JOptionPane.INFORMATION_MESSAGE);
    }
}
