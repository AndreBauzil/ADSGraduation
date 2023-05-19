import java.util.Stack;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Stack<Inscrito> pilhaDeInscritos = new Stack<Inscrito>();
        boolean cond = true;
        
        
        while (cond) {
            // tirar opc cancel
            int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Inscrição \n2) Lista de Inscrições \n3) Homologar Inscrição \n8) Sair"));
            
            switch (opc) {
                case 1:
                    Inscrito inscrito = new Inscrito(
                        JOptionPane.showInputDialog(null, "Insira o nome: ").toString(),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade: ")),
                        JOptionPane.showInputDialog(null, "Insira o endereço: ").toString(),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a inscrição: "))
                    );
                    pilhaDeInscritos.push(inscrito);

                    break;
                    
                case 2:
                    String message = "";
                    
                    for (Inscrito pessoa : pilhaDeInscritos) {
                        message += "Inscrito Nº" + pessoa.getInscricao() 
                        +"\nNome: " + pessoa.getNome()
                        +"\nIdade: " + pessoa.getIdade()
                        +"\nEndereço: " + pessoa.getEndereco()+"\n\n";
                    }

                    JOptionPane.showMessageDialog(null, message);
                    
                    break;
                    
                case 3:
                    message = "";
                    message += "Inscrito Nº"+pilhaDeInscritos.lastElement().getInscricao()+" homologado";
                    pilhaDeInscritos.pop();
                    
                    JOptionPane.showMessageDialog(null, message);
                    
                    break;

                case 8:
                    cond = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um dos números: 1,2,3 ou 8", "Opção Inválida", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }


    }
}