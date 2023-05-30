import JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    private JTextField tfNome, tfIdade;
    private JTextArea tarRegistros;
    private ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
    private int contID=1;
    
    public Cadastro() {
        setTitle("Cadastro de Cachorros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        // setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel(new BorderLayout());

        JLabel lbNome = new JLabel("Nome: ");
        tfNome = new JTextField(20);
        
        JLabel lbIdade = new JLabel("Idade: ");
        tfIdade = new JTextField(20);


        JButton btnCadast = new JButton("Cadastrar");
        btnCadast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });



        panel.add(btnCadast);

    }
    
    
    
    public static void main(String[] args) {
        
    }
}