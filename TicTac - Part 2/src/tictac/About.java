package tictac;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class About extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7;
    JComboBox jc1, jc2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;

    About() {

        setLayout(null);

        l1 = new JLabel("TIC TAC TOE");
        l1.setBounds(20, 40, 200, 20);
        l1.setBackground(new Color(195, 195, 195, 250));
        l1.setFont(new Font("Arial", Font.BOLD, 25));
        add(l1);

        l2 = new JLabel("Perpared by a Delwo Athauda");
        l2.setBounds(20, 80, 200, 20);
        l2.setBackground(new Color(195, 195, 195, 250));
        l2.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l2);

        l3 = new JLabel("if you have any comments, please let me know");
        l3.setBounds(20, 110, 250, 20);
        l3.setBackground(new Color(195, 195, 195, 250));
        l3.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l3);

        l4 = new JLabel("email: delwo.athauda@live.vu.edu.au");
        l4.setBounds(20, 140, 250, 20);
        l4.setBackground(new Color(195, 195, 195, 250));
        l4.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l4);

        l5 = new JLabel("Instergram: @ezio.wolf");
        l5.setBounds(20, 170, 250, 20);
        l5.setBackground(new Color(195, 195, 195, 250));
        l5.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l5);

        l6 = new JLabel("<HTML><U>Note</U></HTML>");
        l6.setBounds(20, 200, 250, 20);
        l6.setBackground(new Color(195, 195, 195, 250));
        l6.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l6);

        l7 = new JLabel("I used JDK 1.8 to compile the source code.");
        l7.setBounds(20, 215, 250, 20);
        l7.setBackground(new Color(195, 195, 195, 250));
        l7.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l7);

        int copyrightSymbolCodePoint = 169;
        String copyright = Character.toString(copyrightSymbolCodePoint);

        l8 = new JLabel(copyright + " CopyRight 2020 VU.edu.au - All Rights Reserved");
        l8.setBounds(20, 290, 250, 20);
        l8.setBackground(new Color(195, 195, 195, 250));
        l8.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        add(l8);

        b1 = new JButton("OK");
        b1.setBounds(100, 330, 90, 25);
//        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.TYPE1_FONT, 10));
        b1.setFocusable(false);
        add(b1);

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                setVisible(false);

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
