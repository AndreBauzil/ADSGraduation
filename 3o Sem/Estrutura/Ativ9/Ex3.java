import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ex3 extends JFrame {
    // Declaração de vars globais e criação das filas
    private JTextArea tfFila, tfIdosos;
    private Queue<Fisica> filaAtendimento = new LinkedList<>();
    private Queue<Fisica> filaIdosos = new LinkedList<>();

    public Ex3() {
        setTitle("Exercício 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Criação do painel principal
        JPanel panel = new JPanel(new GridLayout(2, 1));

        // Criação do textField 'Fila'
        tfFila = new JTextArea();
        tfFila.setEditable(false);
        tfFila.setBorder(BorderFactory.createEmptyBorder(20, 25, 10, 10));   // Seta a borda do painel
        JScrollPane scrFila = new JScrollPane(tfFila);
        
        // Criação do textField 'Idosos'
        tfIdosos = new JTextArea();
        tfIdosos.setEditable(false);
        tfIdosos.setBorder(BorderFactory.createEmptyBorder(20, 25, 10, 10));   // Seta a borda do painel
        JScrollPane scrIdosos = new JScrollPane(tfIdosos);

        // Adição dos textFields com scroll no painel principal
        panel.add(scrFila);
        panel.add(scrIdosos);

        // Criação do botão para identificar os idosos
        JButton btnVerif = new JButton("Verificar Idosos");
        btnVerif.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarIdosos();      // Chama a função que verifica
            }
        });

        // Criação e inserção do painel de botões
        JPanel panelBtns = new JPanel(new FlowLayout());
        panelBtns.add(btnVerif);

        // Adição dos paineis no frame principal
        add(panel, BorderLayout.CENTER);
        add(panelBtns, BorderLayout.SOUTH);

        // Criação hardcode das pessoas
        filaAtendimento.add(new Fisica("Nome1", 65, 481734131));
        filaAtendimento.add(new Fisica("Nome2", 40, 634563454));
        filaAtendimento.add(new Fisica("Nome3", 70, 481274131));
        filaAtendimento.add(new Fisica("Nome4", 50, 745656477));
        filaAtendimento.add(new Fisica("Nome5", 55, 234523435));

        // Atualiza a fila
        updateTfFila();
    }

    private void verificarIdosos() {        // Verifica quais objetos são considerados idosos
        for (int i = 0; i < filaAtendimento.size(); i++) {
            Fisica pessoa = filaAtendimento.poll();
            if (pessoa.getIdade() > 60) {   // idade maior que 60
                filaIdosos.add(pessoa);
            } else {
                filaAtendimento.add(pessoa);
            }
        }

        updateTfFila();
        updateTfIdosos();
    }

    private void updateTfFila() {       // Função para atualizar a fila de atendimento
        String message = "-=-=-=-=-=- Fila Atendimento -=-=-=-=-=-\n\n";
        for (Fisica pess : filaAtendimento) {
            message += "Nome: "+pess.getNome()+"\n"
            +"Idade: "+pess.getIdade()+"\n"
            +"CPF: "+pess.getCPF()+"\n\n";
        }
        message += "-=-=-=-=-=--=-=-=-=-=--=-=-=-=-=-=-=-=-=-";
        tfFila.setText(message);
    }

    private void updateTfIdosos() {       // Função para atualizar a fila de idosos
        String message = "-=-=-=-=-=-=- Fila Idosos -=-=-=-=-=-=-\n\n";
        for (Fisica idos : filaIdosos) {
            message += "Nome: "+idos.getNome()+"\n"
            +"Idade: "+idos.getIdade()+"\n"
            +"CPF: "+idos.getCPF()+"\n\n";
        }
        message += "-=-=-=-=-=--=-=-=-=-=--=-=-=-=-=-=-=-=-";
        tfIdosos.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ex3 ex3 = new Ex3();
            ex3.setVisible(true);
        });
    }
}
