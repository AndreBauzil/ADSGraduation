import java.io.*;
import java.awt.Desktop; 
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        String idade = JOptionPane.showInputDialog("Digite sua idade:");

        String conteudo = nome + " - " + sobrenome + " - " + idade + " Anos";

        
        try {
            File file = new File("./dados.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(conteudo);
            writer.close();
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");

            Desktop.getDesktop().open(file); 
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
