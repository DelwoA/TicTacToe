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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiPlayer extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextField t1, t2;
    JLabel l1, l2;

    MultiPlayer() {
        setLayout(null);

        l1 = new JLabel("Player X");
        l1.setBounds(40, 100, 100, 35);
        l1.setBackground(new Color(195, 195, 195, 250));
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(145, 105, 100, 25);
        t1.setFont(new Font("Arial", Font.BOLD, 16));
        add(t1);

        l2 = new JLabel("Player O");
        l2.setBounds(40, 150, 100, 35);
        l2.setBackground(new Color(195, 195, 195, 250));
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        add(l2);

        t2 = new JTextField();
        t2.setBounds(145, 155, 100, 25);
        t2.setFont(new Font("Arial", Font.BOLD, 16));
        add(t2);

        b1 = new JButton("Start");
        b1.setBounds(40, 200, 205, 35);
        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setFocusable(false);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(40, 255, 205, 35);
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

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                PlayerVsPlayer playerVsPlayer = new PlayerVsPlayer(t1.getText(), t2.getText(), "0", "0");
                dispose();

            }
        });

        setTitle("Tic Tac Toe");
        setLocationRelativeTo(null);
        setSize(300, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
