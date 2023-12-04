import java.io.*;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        try {
            File file = new File("./dados.txt");
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(" -");
                String nome = dados[0];
                String sobrenome = dados[1];
                String idade = dados[2];

                String mensagem = "Nome(s): " + nome + "\nSobrenome(s): " + sobrenome + "\nIdade(s): " + idade;
                JOptionPane.showMessageDialog(null, mensagem);
            }

            br.close();
            reader.close();
        } catch (IOException e) {
            
        }
    }
}
