package tictac;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SinglePlayer extends JFrame{
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextField  t1;
    
    SinglePlayer(){
        setLayout(null);
        
        JLabel l1 = new JLabel("Player Name");
        l1.setBounds(40,120,100,35);
        l1.setBackground(new Color(195, 195, 195, 250));
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        add(l1);
        
        t1 = new JTextField("Player");
        t1.setBounds(145,125,100,25);
        t1.setFont(new Font("Arial", Font.BOLD, 16));
        add(t1);
        
        b1 = new JButton("Start");
        b1.setBounds(40,170,205,35);
        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setFocusable(false);
        add(b1);
        
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                PlayerVsComputer PlayerVsComputer = new PlayerVsComputer(t1.getText(), "0","0");
                dispose();

            }
        });
        
        b2 = new JButton("Back");
        b2.setBounds(40,225,205,35);
        b2.setBackground(new Color(195, 195, 195, 250));
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setFocusable(false);
        add(b2);
        
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                TicTac ticTac = new TicTac();
                dispose();

            }
        });
        
        setTitle("Tic Tac Toe");
        setLocationRelativeTo(null);
        setSize(300,430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
}
