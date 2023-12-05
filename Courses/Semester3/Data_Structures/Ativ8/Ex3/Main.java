package Ex3;
import java.util.*;
import javax.swing.*;

import Classes.*;  // Estrutura de classes dos outros exercícios

public class Main {
    public static void main(String[] args) {
        Queue<Pessoa> filaAtendimento = new LinkedList<Pessoa>();
        Queue<Pessoa> filaAtendidos = new LinkedList<Pessoa>();

        boolean cond = true;
        while (cond) {
            // Menu
            int opc = Integer.parseInt(JOptionPane.showInputDialog("1) Adicionar \n2) Remover \n3) Mostrar Clientes \n8) Sair"));
            
            switch (opc) {
                case 1:    // Acrescentar civil na queue
                    Civil civil = new Civil(  // Cria novo civil
                        JOptionPane.showInputDialog(null, "Insira o nome: ").toString(),
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade: ")),
                        JOptionPane.showInputDialog(null, "Insira o endereço: ").toString()
                    );
                    filaAtendimento.add(civil);   // Adiciona o civil na fila de atendimento

                    break;
                    
                case 2:    // Retira civil do topo da queue
                    String message = "Cliente "+filaAtendimento.peek().getNome()+" removido da fila de atendimento";
                    filaAtendidos.add(
                        filaAtendimento.remove()
                    );
                    JOptionPane.showMessageDialog(null, message, "Em atendimento", JOptionPane.INFORMATION_MESSAGE);

                    break;
                    
                case 3:   // Mostrar Clientes
                    message = "-=-=-=- Fila de Atendimento -=-=-=-\n";
                    if (!filaAtendimento.isEmpty()) {
                        message += listaDados(filaAtendimento);
                    } else {   
                        message += "A fila de atendimento está vazia\n\n";
                    }
                    
                    message += "-=-=-=- Lista de Atendidos -=-=-=-\n";
                    if (!filaAtendidos.isEmpty()) {
                        message += listaDados(filaAtendidos);
                    } else {   
                        message += "A lista de atendidos está vazia\n";
                    }

                    // Finalização mostrando os civis atendidos e a fila de atendimento
                    JOptionPane.showMessageDialog(null, message, "Atendimento e Atendidos", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 8:
                    cond = false;
                    break;
                
                default:  // Caso coloque outra opção mostra mensagem de erro
                    JOptionPane.showMessageDialog(null, "Digite um dos números: 1,2,3 ou 8", "Opção Inválida", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    // Método para criar a lista de dados das pessoas na queue específicada como uma única mensagem
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

