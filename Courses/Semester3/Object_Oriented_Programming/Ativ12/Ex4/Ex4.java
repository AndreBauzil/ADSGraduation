package Ex4;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;


/**
 * Main
 */
	public class Ex4 {
    public static void main(String[] args) {
        // ----------- Ex1 ----------
        String frases = "0) Cadastro de bebida.\n1) Mostar a quantidade de bebidas em estoque.\n2) Mostar o nome da bebida mais cara.\n3) Mostar a descrição e preço da bebida mais cara.\n4) Mostrar o nome e o preço de venda da bebida mais barata.\n5) Mostrar o nome das bebida com quantidade superior a 30.\n6) Mostrar o nome da bebida com preço entre 4 e 5 reais.\n7) Mostrar todos os dados de todos as bebidas.\n8) Exit";
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();    // Lista de bebidas que serão adicionadas
        // Condição do while
        boolean cond = true;
        
        carregarDados(bebidas); // Carrega os dados do arquivo "bebidas.txt"

        // ----------- Ex2 ----------
        while (cond) {
            String menu = JOptionPane.showInputDialog(null, frases, "");   // Menu
            int opcao = Integer.parseInt(menu);      // Opção do menu

            switch (opcao) {
                // ----------- Ex3 ----------
                case 0:
                    // Instancia uma nova bebida na lista de bebidas
                    Bebida novaBebida = new Bebida();
                    
                    // Declarando nome
                    novaBebida.setName(JOptionPane.showInputDialog(null, "Informe o nome da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE));
                    // Declarando custo
                    novaBebida.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o custo da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE)));
                    // Declarando descrição
                    novaBebida.setDescricao(JOptionPane.showInputDialog(null, "Informe a descrição da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE));
                    // Declarando estoque
                    novaBebida.setEstoque(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o estoque da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE)));

                    bebidas.add(novaBebida);

                    try {
                        salvarDados(bebidas); // Salva os dados no arquivo "bebidas.txt" após adicionar a bebida
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 1:
                    int allEsto = 0;
                    for (Bebida est : bebidas) {          // Puxa o estoque de todas as bebidas e soma
                        allEsto += est.getEstoque();
                    }

                    JOptionPane.showMessageDialog(
                        null, 
                        "A quantidade de bebidas em estoque é de: "+allEsto, 
                        "Quantidade em Estoque", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 2:
                    int maisCara = 0;
                    for (int i = 0; i < bebidas.size(); i++) {   // Puxa o custo de cada bebida e pega o index da que for maior
                        if (bebidas.get(i).getCusto()>maisCara) {
                            maisCara = i;
                        }
                    }
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        "O nome da bebida mais cara é: '" + bebidas.get(maisCara).getNome()+"'",
                        "Bebida mais Cara", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 3:
                    maisCara = 0;
                    for (int i = 0; i < bebidas.size(); i++) {    // Mesma coisa que a anterior
                        if (bebidas.get(i).getCusto()>maisCara) {
                            maisCara = i;
                        }
                    }
                        
                    JOptionPane.showMessageDialog(
                        null, 
                        "A descrição da bebida mais cara é: '"+bebidas.get(maisCara).getDescricao()+
                        "'\ne o preço é de: R$"+bebidas.get(maisCara).getCusto(), 
                        "Desc e Preço - Mais cara", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 4:
                    int maisBara = 1000;
                    for (int i = 0; i < bebidas.size(); i++) {     // Puxa o preço, compara com o anterior e pega o index do menor
                        if (bebidas.get(i).getCusto()<maisBara) {
                            maisBara = i;
                        }
                    }
                        
                    JOptionPane.showMessageDialog(
                        null, 
                        "A nome da bebida mais barata é: '"+bebidas.get(maisBara).getNome()+
                        "'\ne o preço de venda é de: R$"+bebidas.get(maisBara).getPrecoVenda(), 
                        "Nome e Preço - Mais barata", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 5:
                    String mensagem = "";
                    for (int i = 0; i < bebidas.size(); i++) {   
                        if (bebidas.get(i).getEstoque()>30) {          // Se a bebida tiver o estoque maior que 30, adiciona o nome numa String
                            mensagem += bebidas.get(i).getNome() + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(
                        null, 
                        "As bebidas em estoque são: "+"\n"
                        +mensagem,                                  // Printa a string com a lista de bebidas
                        "Estoque Acima de '30'", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 6:
                    mensagem = "";
                    for (int i = 0; i < bebidas.size(); i++) {   // O mesmo que a anterior, porém com parâmetros diferentes
                        if (bebidas.get(i).getCusto()>=4.0 && bebidas.get(i).getCusto()<=5.0) {  
                            mensagem += bebidas.get(i).getNome() + "\n";
                        }
                    }
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        "As bebidas são: "
                        +mensagem, 
                        "Bebidas entre 4 e 5 reais", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 7:
                    mensagem = "";
                    for (Bebida bebida : bebidas) {            // O mesmo que as anteriores porém dessa vez adiciona todos os atributos à mensagem
                        // ----------- Ex4 ----------
												mensagem += "Indice: " + bebidas.indexOf(bebida) + "\n"
                        +"Nome: " + bebida.getNome() + "\n"
                        + "Custo: " + bebida.getCusto() + "\n"
                        + "Preço de Venda: " + bebida.getPrecoVenda() + "\n"
                        + "Descrição: " + bebida.getDescricao() + "\n"
                        + "Estoque: " + bebida.getEstoque() + "\n\n";
                    }
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        mensagem, 
                        "Todas as bebidas", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 8:
                    cond = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, por favor insira um número de 0 a 8", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private static void salvarDados(ArrayList<Bebida> bebidas) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("./Ex4/bebidas.txt"));

        for (Bebida bebida : bebidas) {
            writer.write(bebida.getNome() + ";" + bebida.getCusto() + ";" + bebida.getDescricao() + ";" + bebida.getEstoque());
            writer.newLine();
        }

        writer.close();
    }

    private static void carregarDados(ArrayList<Bebida> bebidas) {
        // Carrega os dados do arquivo "bebidas.txt" e adiciona no ArrayList
        try {
            Scanner scanner = new Scanner(new File("./Ex4/bebidas.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] dados = line.split(";");
                if (dados.length == 4) {
                    Bebida bebida = new Bebida();
                    bebida.setName(dados[0]);
                    bebida.setCusto(Float.parseFloat(dados[1]));
                    bebida.setDescricao(dados[2]);
                    bebida.setEstoque(Integer.parseInt(dados[3]));
                    bebidas.add(bebida);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}