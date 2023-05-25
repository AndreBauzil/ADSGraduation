import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ex2 extends JFrame {
    private JTextArea filaTextArea;

    public Ex2() {
        setTitle("Exercício 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //
        JPanel panel = new JPanel(new BorderLayout());

        //
        // filaTextArea = new JTextArea();
        filaTextArea.setEditable(false);

        //
        JScrollPane scrollPane = new JScrollPane(filaTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton adicionarButton = new JButton("Adicionar na Fila");
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
                long cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF:"));

                Fisica pessoa = new Fisica(nome, idade, cpf);
                pessoa.setNome(nome);

                // fila.offer(pessoa);
            }
        });

        JButton mostrarButton = new JButton("Mostrar Fila");
        mostrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // StringBuilder sb = new StringBuilder();
                // for (Fisica pessoa : fila) {
                //     sb.append(pessoa.getNome()).append(", ")
                //             .append(pessoa.getIdade()).append(", ")
                //             .append(pessoa.getCPF()).append("\n");
                // }
                // filaTextArea.setText(sb.toString());
            }
        });

        //
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(adicionarButton);
        buttonPanel.add(mostrarButton);

        //
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        pack();
        setLocationRelativeTo(null);
    }

    private Queue<Fisica> fila = new LinkedList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ex2 Ex2 = new Ex2();
            Ex2.setVisible(true);
        });
    }
}
