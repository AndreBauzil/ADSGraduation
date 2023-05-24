import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
    // ----------- Global Vars ------------
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18); // Fonte principa
    JTextField tfFirstName, tfLastName;         // Inputs de texto
    JLabel lbWelcome;

    public void initialize() {
        // ------------- Form Panel (north) ---------------
            // Componentes
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
        
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);
        
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

            // Criação Painel 'Form' 
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(
            4, // Rows
            1, // Columns
            5, // Margin between 
            5  // diff components
        ));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        
            // Adicionando os components no form
        formPanel.add(lbFirstName);  
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        
        
        // ------------- Welcome Panel (center) ---------------
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        
        
        // ------------- Buttons Panel (south) ---------------
            // Criação dos botões
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {   // Adição do ouvinte do botão OK
            
            @Override
            public void actionPerformed(ActionEvent e) { // Envia os nomes para o welcome label
                String firstName = tfFirstName.getText();
                String LastName = tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + "" + LastName);
            }
            
        });
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });
        
            // Criação do painel e adição dos botões
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


        // ------------- Main Painel ----------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        // mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);  // Adicionando painel form ao painel principal
        mainPanel.add(lbWelcome, BorderLayout.CENTER);  // Adicionando label welcome ao painel principal
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);  // Adicionando label welcome ao painel principal

        add(mainPanel);  // Adição do painel princiapl no JFrame


        // ------------- Main Frame -----------
        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    
}
