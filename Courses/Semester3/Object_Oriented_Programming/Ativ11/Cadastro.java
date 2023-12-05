import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Cadastro extends JFrame {
    // Declaração de vars globais e criação da lista
    public static JTextField tfNome, tfIdade;
    public static JTextArea tarRegistros;
    static ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
    public static int contID=1;
    
    // Frame principal 
    public Cadastro() {
        setTitle("Cadastro de Cachorros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(400, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);    // Abrir no centro

        // Painel principal
        JPanel panel = new JPanel(new BorderLayout());

        // Componentes
        JLabel lbNome = new JLabel("Nome: ");
        tfNome = new JTextField(20);
        JLabel lbIdade = new JLabel("Idade: ");
        tfIdade = new JTextField(20);

        // Criação dos botões
        JButton btnCadast = new JButton("Cadastrar");
        btnCadast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Metodos.cadastrarCachorro();
            }
        });
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Metodos.excluirCachorro();
            }
        });
        JButton btnAlterar = new JButton("Alterar");
        btnAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Metodos.alterarCachorro();
            }
        });

        // Criação da textarea dos registros
        tarRegistros = new JTextArea(10, 30);
        tarRegistros.setEditable(false);
        tarRegistros.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Criação do painel de botões e adição dos mesmos
        JPanel panelBtns = new JPanel();
        panelBtns.add(btnCadast);
        panelBtns.add(btnAlterar);
        panelBtns.add(btnExcluir);

        // Adição de todos os componentes no panel principal
        panel.add(lbNome);
        panel.add(tfNome);
        panel.add(lbIdade);
        panel.add(tfIdade);
        panel.add(panelBtns, BorderLayout.PAGE_END);
        panel.add(new JScrollPane(tarRegistros), BorderLayout.CENTER);

        // Adição do painel principal ao frame principal
        add(panel);
    }

    // Main para mostrar o frame principal
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
}