import java.io.*;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println("--------------- Ex2 ---------------");
        try {
            File file = new File("./dados.txt");
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(" - ");
                String nome = dados[0];
                String sobrenome = dados[1];
                String idade = dados[2];

                System.out.println("Nome(s): " + nome);
                System.out.println("Sobrenome(s): " + sobrenome);
                System.out.println("Idade(s): " + idade);
            }
            
            
            br.close();
            reader.close();
        } catch (IOException e) {
            
        }
        System.out.println("-----------------------------------");
    }
}
