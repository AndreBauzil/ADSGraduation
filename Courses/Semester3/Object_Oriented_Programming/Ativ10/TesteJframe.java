import javax.swing.*;
import java.awt.*;

public class TesteJframe extends JFrame {
    final private Font mainFont = new Font("Concert One", Font.BOLD, 18); // Fonte principal
    private JTextField tfUsuario;         // Inputs de texto
    private JPasswordField tfSenha;



    public TesteJframe() {
        setTitle("Login");
        setSize(300, 200);
        // setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());


    }
}
 