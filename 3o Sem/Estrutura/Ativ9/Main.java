import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Main {
    public static void main(String[] args) {
        Queue<Juridica> fila = new LinkedList<Juridica>();
        
        fila.add(new Juridica("Empresa A", 12, 123456789));
        fila.add(new Juridica("Empresa B", 73, 567891234));
        fila.add(new Juridica("Empresa C", 54, 216549873));
        fila.add(new Juridica("Empresa D", 86, 156234534));
        fila.add(new Juridica("Empresa E", 25, 789123456));
        

        JTextArea tfOriginal = new JTextArea();
        tfOriginal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));   // Seta a borda do painel
        for (Juridica pesJ : fila) {
            String message = 
                "Nome: "+pesJ.getNome()+","
                + "\nIdade: "+String.valueOf(pesJ.getIdade())+","
                + "\nCNPJ: "+String.valueOf(pesJ.getCNPJ()+"\n\n");
            tfOriginal.append(message);
            System.out.println(pesJ.getNome());
        }
        
        // Cria fila e inverte com for invertido
        Queue<Juridica> filaInvert = new LinkedList<Juridica>();
        for (int i = fila.size()-1; i >= 0; i--) {
            filaInvert.add(fila.remove());        // Remove da filaOg e adiciona na filaInvert
        }
            // for (int i = 0; i < fila.size(); i++) {
            //     filaInvert.add(fila.poll());
            //     System.out.println(filaInvert);
            // }

        JTextArea tfInvert = new JTextArea();
        tfInvert.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));   // Seta a borda do painel
        for (Juridica pesJInv : filaInvert) {
            String message = 
                "Nome: "+pesJInv.getNome()+","
                + "\nIdade: "+String.valueOf(pesJInv.getIdade())+","
                + "\nCNPJ: "+String.valueOf(pesJInv.getCNPJ()+"\n\n");
            tfInvert.append(message);
            System.out.println(pesJInv.getNome());
        }

        // Criação do frame que mostra a fila original
        JFrame frameOg = new JFrame();
        frameOg.setTitle("Fila Original");
        frameOg.setLayout(new GridLayout(1, 1));
        frameOg.setSize(300, 200);
        frameOg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameOg.setLocationRelativeTo(null);
        
        
        // Adiciona o textArea ao frameOriginal
        frameOg.add(new JScrollPane(tfOriginal));
        
        
        // Criação do frame que mostra a fila invertida
        JFrame frameInvert = new JFrame();
        frameInvert.setTitle("Fila Invertida");
        frameInvert.setLayout(new GridLayout(1, 1));
        frameInvert.setSize(300, 200);
        frameInvert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInvert.setLocationRelativeTo(null);
        

        // Adiciona o textArea ao frameInvert
        frameInvert.add(new JScrollPane(tfInvert));
        
        
        frameOg.setVisible(true);
        frameOg.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                // Criar e exibir o novo JFrame
                frameInvert.setVisible(true);
            }
        });
    }
}
