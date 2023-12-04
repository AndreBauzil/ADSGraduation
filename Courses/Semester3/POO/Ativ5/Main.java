import java.util.*;
import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        String frases = "0) Cadastro de bebida.\n1) Mostar a quantidade de bebidas em estoque.\n2) Mostar o nome da bebida mais cara.\n3) Mostar a descrição e preço da bebida mais cara.\n4) Mostraro nome e o preço de venda da bebida mais barata.\n5) Mostraro nome das bebida com quantidade superior a 30.\n6) Mostraro nome da bebida com preço entre 4e 5 reais.\n7) Mostrar todos os dados de todos as bebidas.\n8) Exit";
        Bebida bebida = new Bebida();
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
        boolean cond = true;

        while (cond) {
            String menu = JOptionPane.showInputDialog(null, frases, "");
            int opcao = Integer.parseInt(menu);
            switch (opcao) {
                case 0:
                    // Adicionando nova bebida na lista de bebidas
                    bebidas.add(bebida);
                    // Declarando nome
                    bebidas.get(bebidas.size()-1).setName(JOptionPane.showInputDialog(null, "Informe o nome da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE));
                    
                    // Declarando custo
                    bebidas.get(bebidas.size()-1).setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o custo da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE)));
                    
                    // Declarando descrição
                    bebidas.get(bebidas.size()-1).setDescricao(JOptionPane.showInputDialog(null, "Informe a descrição da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE));
                    
                    // Declarando estoque
                    bebidas.get(bebidas.size()-1).setEstoque(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o estoque da bebida", "Cadastro de Bebida", JOptionPane.QUESTION_MESSAGE)));
                    break;
                case 1:
                    int allEsto = 0;
                    
                    // somando errado, 100+29+101 = 303???
                    // 100 + 29 = 58???
                    for (Bebida est : bebidas) {
                        allEsto += est.getEstoque();
                    }

                    JOptionPane.showMessageDialog(null, "A quantidade de bebidas em estoque é de: "+allEsto, "Quantidade em Estoque", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 2:
                    int maisCara = 0;

                    for (int i = 0; i < bebidas.size(); i++) {
                        if (bebidas.get(i).getCusto()>maisCara) {
                            maisCara = i;
                        }
                    }
                        
                        JOptionPane.showMessageDialog(
                            null, 
                            "A descrição da bebida mais cara é: '"+bebidas.get(maisCara).getDescricao()+
                            "'\ne o preço é de: R$"+bebidas.get(maisCara).getCusto(), 
                            "Quantidade em Estoque", 
                            JOptionPane.INFORMATION_MESSAGE
                        );

                    break;
                case 3:
                    // inverter com o 2
                    break;
                case 4:
                    // getPrecoVenda
                    break;
                case 5:
                    String mensagem = "";

                    // repetindo os nomes, declaração de var
                    for (int i = 0; i < bebidas.size(); i++) {   
                        if (bebidas.get(i).getEstoque()>30) {
                            mensagem += bebidas.get(i).getNome() + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(
                        null, 
                        mensagem, 
                        "Bebidas com Estoque Maior que 30", 
                        JOptionPane.INFORMATION_MESSAGE
                    );


                    break;
                case 6:
                    // igual ao 5
                    mensagem = "";

                    for (int i = 0; i < bebidas.size(); i++) {   
                        if (bebidas.get(i).getCusto()>4.0 && bebidas.get(i).getCusto()<5.0) {
                            mensagem += bebidas.get(i).getNome() + "\n";
                        }
                    }
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        mensagem, 
                        "Bebidas entre 4 e R$5", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                        
                    break;
                case 7:
                    mensagem = "";

                    for (int i = 0; i < bebidas.size(); i++) {
                        mensagem += "Nome: " + bebidas.get(i).getNome() + "\n"
                        + "Custo: " + bebidas.get(i).getCusto() + "\n"
                        + "Preço de Venda:" + bebidas.get(i).getPrecoVenda() + "\n"
                        + "Descrição: " + bebidas.get(i).getDescricao() + "\n"
                        + "Estoque: " + bebidas.get(i).getEstoque() + "\n";
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        mensagem, 
                        "Todas as bebidas", 
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    break;
                case 8:
                    cond=false;
                    break;
                default:
                    break;
            }
        }
    
    
    }
}