/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictac;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author thari
 */
public class Settings extends JFrame{
    
    JButton b1,b2,b3,b4,b5,b6,b7;
    JComboBox jc1,jc2;
    JLabel l1,l2;
    
    Settings(){
        
        setLayout(null);
        
        l1 = new JLabel("Player X");
        l1.setBounds(40,100,100,35);
        l1.setBackground(new Color(195, 195, 195, 250));
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        add(l1);
        
        String[] jc1Items = { "Board 1","Board 2","Board 3" };
        jc1 = new JComboBox(jc1Items);
        jc1.setBounds(145,105,100,25);
        jc1.setFont(new Font("Arial", Font.BOLD, 16));
        jc1.setSelectedItem("Board 3");
        add(jc1);
        
        l2 = new JLabel("Player O");
        l2.setBounds(40,150,100,35);
        l2.setBackground(new Color(195, 195, 195, 250));
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        add(l2);
        
        String[] jc2Items = { "Small", "Medium","Large" };
        jc2 = new JComboBox(jc2Items);
        jc2.setBounds(145,155,100,25);
        jc2.setFont(new Font("Arial", Font.BOLD, 16));
        jc2.setSelectedItem("medium");
        add(jc2);
        
        b1 = new JButton("Reset Default Settings");
        b1.setBounds(40,200,205,35);
        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setFocusable(false);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(40,255,205,35);
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
