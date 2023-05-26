import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ex2 extends JFrame {
    // Declaração de vars globais e criação da fila
    private JTextArea tfFila;
    private Queue<Fisica> fila = new LinkedList<>();

    public Ex2() {
        setTitle("Exercício 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        //  Criação do painel onde vai a fila
        JPanel panel = new JPanel(new BorderLayout());

        //  TextField da Fila
        tfFila = new JTextArea();
        tfFila.setEditable(false);
        tfFila.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));   // Seta a borda do painel
        

        //  Criação do painel com scroll
        JScrollPane scrFila = new JScrollPane(tfFila);
        panel.add(scrFila, BorderLayout.CENTER);

        // Criação do botão para adicionar na fila
        JButton btnAdd = new JButton("Adicionar na Fila");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Abre um JOption para cada atributo de pessoa fisica, instancia e adiciona
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF:"));

                Fisica pessoa = new Fisica(nome, idade, cpf);

                fila.add(pessoa);
            }
        });

        // Criação do botão para mostar a fila
        JButton btnMostrar = new JButton("Mostrar Fila");
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                for (Fisica pess : fila) {
                    message += "Nome: "+pess.getNome()+"\n"
                    +"Idade: "+pess.getIdade()+"\n"
                    +"CPF: "+pess.getCPF()+"\n\n";
                }
                tfFila.setText(message);
            }
        });

        // Criação e inserção do painel de botões
        JPanel panelBtns = new JPanel(new FlowLayout());
        panelBtns.add(btnAdd);
        panelBtns.add(btnMostrar);

        // Adição dos paineis no frame
        add(panel, BorderLayout.CENTER);
        add(panelBtns, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ex2 Ex2 = new Ex2();
            Ex2.setVisible(true);
        });
    }
}
