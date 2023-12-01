package tictac;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTac extends JFrame{
    
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    TicTac(){
        
        setLayout(null);
        
        b1 = new JButton("Single Player");
        b1.setBounds(40,80,205,35);
        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setFocusable(false);
        add(b1);
        
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                SinglePlayer singlePlayer = new SinglePlayer(); 
                dispose();

            }
        });
        
        b2 = new JButton("Multi Player");
        b2.setBounds(40,130,205,35);
        b2.setBackground(new Color(195, 195, 195, 250));
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setFocusable(false);
        add(b2);
        
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                MultiPlayer multiPlayer = new MultiPlayer(); 
                dispose();

            }
        });
        
        b3 = new JButton("Settings");
        b3.setBounds(40,180,205,35);
        b3.setBackground(new Color(195, 195, 195, 250));
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setFocusable(false);
        add(b3);
        
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Settings settings = new Settings(); 
                dispose();

            }
        });
        
        b4 = new JButton("About");
        b4.setBounds(40,230,205,35);
        b4.setBackground(new Color(195, 195, 195, 250));
        b4.setFont(new Font("Arial", Font.BOLD, 16));
        b4.setFocusable(false);
        add(b4);
        
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                About about = new About(); 

            }
        });
        
        b5 = new JButton("Exit");
        b5.setBounds(40,280,205,35);
        b5.setBackground(new Color(195, 195, 195, 250));
        b5.setFont(new Font("Arial", Font.BOLD, 16));
        b5.setFocusable(false);
        add(b5);
        
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                System.exit(0);

            }
        });
           
        setTitle("Tic Tac Toe");
        setLocationRelativeTo(null);
        setSize(300,430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        TicTac ticTac = new TicTac();
    }
    
}
