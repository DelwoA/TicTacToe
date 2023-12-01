package tictac;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerVsComputer extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, lDraw;
    JPanel jp1, jp2, jp3, jp4, jp5, jp6, jp7, jp8, jp9, jp10, jp11, jp12, jp13, jp14, jp15;
    JButton b1, b2, b3, b4;
    String click = "";
    String clickL1 = "", clickL2 = "", clickL3 = "", clickL4 = "", clickL5 = "", clickL6 = "", clickL7 = "", clickL8 = "", clickL9 = "";
    ArrayList result;
    boolean fal = true;
    int randomNumber;

    public PlayerVsComputer(String name, String player1, String player2) {

        ArrayList<String> clicks = new ArrayList<>();

        setLayout(null);

        l1 = new JLabel("X - " + name);
        l1.setBounds(20, 10, 100, 35);
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        add(l1);

        l2 = new JLabel("O - Computer");
        l2.setBounds(170, 10, 100, 35);
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        add(l2);

        l3 = new JLabel(player1);
        l3.setBounds(50, 35, 100, 35);
        l3.setFont(new Font("Arial", Font.BOLD, 14));
        add(l3);

        l4 = new JLabel(player2);
        l4.setBounds(230, 35, 100, 35);
        l4.setFont(new Font("Arial", Font.BOLD, 14));
        add(l4);

        l5 = new JLabel("X");
        l5.setBounds(135, 25, 100, 35);
        l5.setForeground(new Color(0, 0, 195, 250));
        l5.setFont(new Font("Arial", Font.BOLD, 10));
        add(l5);

        lDraw = new JLabel("Draw");
        lDraw.setBounds(120, 50, 100, 35);
        lDraw.setForeground(new Color(200, 0, 0, 250));
        lDraw.setFont(new Font("Arial", Font.BOLD, 15));
        lDraw.setVisible(false);
        add(lDraw);

        jp1 = new JPanel();
        jp1.setBounds(20, 80, 245, 245);
//        jp1.setBackground(new Color(0, 0, 0, 250));
        jp1.setLayout(null);
        add(jp1);

        jp2 = new JPanel();
        jp2.setBounds(0, 0, 80, 80);
//        jp2.setBackground(new Color(255, 252, 0, 250));
        jp2.setLayout(null);
        jp1.add(jp2);

        jp3 = new JPanel();
        jp3.setBounds(82, 0, 80, 80);
//        jp3.setBackground(new Color(0, 0, 200, 250));
        jp3.setLayout(null);
        jp1.add(jp3);

        jp4 = new JPanel();
        jp4.setBounds(164, 0, 80, 80);
//        jp4.setBackground(new Color(0, 0, 200, 250));
        jp4.setLayout(null);
        jp1.add(jp4);

        jp5 = new JPanel();
        jp5.setBounds(0, 82, 80, 80);
//        jp5.setBackground(new Color(0, 0, 200, 250));
        jp5.setLayout(null);
        jp1.add(jp5);

        jp6 = new JPanel();
        jp6.setBounds(82, 82, 80, 80);
//        jp6.setBackground(new Color(0, 0, 200, 250));
        jp6.setLayout(null);
        jp1.add(jp6);

        jp7 = new JPanel();
        jp7.setBounds(164, 82, 80, 80);
//        jp7.setBackground(new Color(0, 0, 200, 250));
        jp7.setLayout(null);
        jp1.add(jp7);

        jp8 = new JPanel();
        jp8.setBounds(0, 164, 80, 80);
//        jp8.setBackground(new Color(0, 0, 200, 250));
        jp8.setLayout(null);
        jp1.add(jp8);

        jp9 = new JPanel();
        jp9.setBounds(82, 164, 80, 80);
//        jp9.setBackground(new Color(0, 0, 200, 250));
        jp9.setLayout(null);
        jp1.add(jp9);

        jp10 = new JPanel();
        jp10.setBounds(164, 164, 80, 80);
//        jp10.setBackground(new Color(0, 0, 200, 250));
        jp10.setLayout(null);
        jp1.add(jp10);

//        
        jp11 = new JPanel();
        jp11.setBounds(80, 0, 2, 244);
        jp11.setBackground(new Color(0, 0, 0, 250));
        jp11.setLayout(null);
        jp1.add(jp11);

        jp12 = new JPanel();
        jp12.setBounds(162, 0, 2, 244);
        jp12.setBackground(new Color(0, 0, 0, 250));
        jp12.setLayout(null);
        jp1.add(jp12);

        jp13 = new JPanel();
        jp13.setBounds(0, 80, 244, 2);
        jp13.setBackground(new Color(0, 0, 0, 250));
        jp13.setLayout(null);
        jp1.add(jp13);

        jp14 = new JPanel();
        jp14.setBounds(0, 162, 244, 2);
        jp14.setBackground(new Color(0, 0, 0, 250));
        jp14.setLayout(null);
        jp1.add(jp14);

        l6 = new JLabel("");
        l6.setBounds(30, 30, 200, 20);
        l6.setBackground(new Color(195, 195, 195, 250));
        l6.setFont(new Font("Arial", Font.BOLD, 25));
        jp2.add(l6);

        l7 = new JLabel("");
        l7.setBounds(30, 30, 200, 20);
        l7.setBackground(new Color(195, 195, 195, 250));
        l7.setFont(new Font("Arial", Font.BOLD, 25));
        jp3.add(l7);

        l8 = new JLabel("");
        l8.setBounds(30, 30, 200, 20);
        l8.setBackground(new Color(195, 195, 195, 250));
        l8.setFont(new Font("Arial", Font.BOLD, 25));
        jp4.add(l8);

        l9 = new JLabel("");
        l9.setBounds(30, 30, 200, 20);
        l9.setBackground(new Color(195, 195, 195, 250));
        l9.setFont(new Font("Arial", Font.BOLD, 25));
        jp5.add(l9);

        l10 = new JLabel("");
        l10.setBounds(30, 30, 200, 20);
        l10.setBackground(new Color(195, 195, 195, 250));
        l10.setFont(new Font("Arial", Font.BOLD, 25));
        jp6.add(l10);

        l11 = new JLabel("");
        l11.setBounds(30, 30, 200, 20);
        l11.setBackground(new Color(195, 195, 195, 250));
        l11.setFont(new Font("Arial", Font.BOLD, 25));
        jp7.add(l11);

        l12 = new JLabel("");
        l12.setBounds(30, 30, 200, 20);
        l12.setBackground(new Color(195, 195, 195, 250));
        l12.setFont(new Font("Arial", Font.BOLD, 25));
        jp8.add(l12);

        l13 = new JLabel("");
        l13.setBounds(30, 30, 200, 20);
        l13.setBackground(new Color(195, 195, 195, 250));
        l13.setFont(new Font("Arial", Font.BOLD, 25));
        jp9.add(l13);

        l14 = new JLabel("");
        l14.setBounds(30, 30, 200, 20);
        l14.setBackground(new Color(195, 195, 195, 250));
        l14.setFont(new Font("Arial", Font.BOLD, 25));
        jp10.add(l14);

        jp2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                System.out.println(clicks.size());

                if (click == "") {

                    if (l6.getText() == "") {

                        if (fal == true) {

                            l6.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL1 = "x";
                            clicks.add("1");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l6.getText() == "") {

                        if (fal == true) {
                            l6.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL1 = "x";

                            clicks.add("1");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l6.getText() == "") {

                        if (fal == true) {

                            l6.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL1 = "o";

                            clicks.add("1");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l7.getText() == "") {

                        if (fal == true) {

                            l7.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL2 = "x";

                            clicks.add("2");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }

                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l7.getText() == "") {

                        if (fal == true) {
                            l7.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL2 = "x";

                            clicks.add("2");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l7.getText() == "") {

                        if (fal == true) {

                            l7.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL2 = "o";

                            clicks.add("2");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l8.getText() == "") {

                        if (fal == true) {

                            l8.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL3 = "x";

                            clicks.add("3");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }

                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l8.getText() == "") {

                        if (fal == true) {

                            l8.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL3 = "x";

                            clicks.add("3");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l8.getText() == "") {

                        if (fal == true) {

                            l8.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL3 = "o";

                            clicks.add("3");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l9.getText() == "") {

                        if (fal == true) {

                            l9.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL4 = "x";

                            clicks.add("4");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l9.getText() == "") {

                        if (fal == true) {

                            l9.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL4 = "x";

                            clicks.add("4");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l9.getText() == "") {

                        if (fal == true) {

                            l9.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL4 = "o";

                            clicks.add("4");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l10.getText() == "") {

                        if (fal == true) {

                            l10.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL5 = "x";

                            clicks.add("5");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l10.getText() == "") {

                        if (fal == true) {

                            l10.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL5 = "x";

                            clicks.add("5");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l10.getText() == "") {

                        if (fal == true) {

                            l10.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL5 = "o";

                            clicks.add("5");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l11.getText() == "") {

                        if (fal == true) {

                            l11.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL6 = "x";

                            clicks.add("6");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l11.getText() == "") {

                        if (fal == true) {

                            l11.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL6 = "x";

                            clicks.add("6");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l11.getText() == "") {

                        if (fal == true) {

                            l11.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL6 = "o";

                            clicks.add("6");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l12.getText() == "") {

                        if (fal == true) {

                            l12.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL7 = "x";

                            clicks.add("7");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l12.getText() == "") {

                        if (fal == true) {

                            l12.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL7 = "x";

                            clicks.add("7");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l12.getText() == "") {

                        if (fal == true) {

                            l12.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL7 = "o";

                            clicks.add("7");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l13.getText() == "") {

                        if (fal == true) {

                            l13.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL8 = "x";

                            clicks.add("8");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l13.getText() == "") {

                        if (fal == true) {

                            l13.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL8 = "x";

                            clicks.add("8");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }

                            }
                        }
                    }
                } else {

                    if (l13.getText() == "") {

                        if (fal == true) {

                            l13.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL8 = "o";

                            clicks.add("8");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

        jp10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                System.out.println(clicks.size());
                if (click == "") {

                    if (l14.getText() == "") {

                        if (fal == true) {

                            l14.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL9 = "x";

                            clicks.add("9");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }

                } else if (click == "x") {

                    if (l14.getText() == "") {

                        if (fal == true) {

                            l14.setText("X");
                            l5.setText("O");
                            click = "o";
                            clickL9 = "x";

                            clicks.add("9");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                } else {

                    if (l14.getText() == "") {

                        if (fal == true) {

                            l14.setText("O");
                            l5.setText("X");
                            click = "x";
                            clickL9 = "o";

                            clicks.add("9");

                            if (clicks.size() <= 4) {

                                for (int i = 1; i < 2; i++) {

                                    randomNumber = random();

                                    if (randomNumber == 1) {
                                        if (l6.getText() == "") {
                                            l6.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL1 = "o";

                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 2) {
                                        if (l7.getText() == "") {
                                            l7.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL2 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 3) {
                                        if (l8.getText() == "") {
                                            l8.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL3 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 4) {
                                        if (l9.getText() == "") {
                                            l9.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL4 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 5) {
                                        if (l10.getText() == "") {
                                            l10.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL5 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 6) {
                                        if (l11.getText() == "") {
                                            l11.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL6 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 7) {
                                        if (l12.getText() == "") {
                                            l12.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL7 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 8) {
                                        if (l13.getText() == "") {
                                            l13.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL8 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    } else if (randomNumber == 9) {
                                        if (l14.getText() == "") {
                                            l14.setText("O");
                                            l5.setText("X");
                                            click = "x";
                                            clickL9 = "o";
                                            break;
                                        } else {
                                            i--;
                                        }
                                    }
                                }
                            }

                            result = check(clickL1, clickL2, clickL3, clickL4, clickL5, clickL6, clickL7, clickL8, clickL9);
                            int resultSize = result.size();

                            if (result.size() == 1) {
                                if (clicks.size() >= 5 && result.get(0) == "draw") {
                                    lDraw.setVisible(true);
                                }
                            }

                            if (result.size() >= 3) {

                                for (int i = 0; i < resultSize; i++) {

                                    if (result.get(i) == "1") {
                                        jp2.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "2") {
                                        jp3.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "3") {
                                        jp4.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "4") {
                                        jp5.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "5") {
                                        jp6.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "6") {
                                        jp7.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "7") {
                                        jp8.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "8") {
                                        jp9.setBackground(new Color(255, 252, 0, 250));
                                    }
                                    if (result.get(i) == "9") {
                                        jp10.setBackground(new Color(255, 252, 0, 250));
                                    }

                                    if (result.get(i) == "player1") {
                                        String player2 = l3.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l3.setText(Player);
                                    }

                                    if (result.get(i) == "player2") {

                                        String player2 = l4.getText();
                                        String Player = String.valueOf(Integer.parseInt(player2) + 1);
                                        l4.setText(Player);
                                    }

                                    fal = false;
                                }
                            }
                        }
                    }
                }
            }
        });

//        jp2.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//
//                if (click == "") {
//
//                    if (l6.getText() == "") {
//                        l6.setText("X");
//                        l5.setText("O");
//                        click = "o";
//                    }
//
//                } else if (click == "x") {
//
//                    if (l6.getText() == "") {
//                        l6.setText("X");
//                        l5.setText("O");
//                        click = "o";
//                    }
//                } else {
//
//                    if (l6.getText() == "") {
//
//                        l6.setText("O");
//                        l5.setText("X");
//                        click = "x";
//                    }
//                }
//            }
//        });
//      buttons
        b1 = new JButton("Back");
        b1.setBounds(20, 350, 110, 25);
        b1.setBackground(new Color(195, 195, 195, 250));
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setFocusable(false);
        add(b1);

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                SinglePlayer singlePlayer = new SinglePlayer();
                dispose();

            }
        });

        b2 = new JButton("Restart");
        b2.setBounds(155, 350, 110, 25);
        b2.setBackground(new Color(195, 195, 195, 250));
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setFocusable(false);
        add(b2);

        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                PlayerVsComputer PlayerVsComputer = new PlayerVsComputer(name, l3.getText(), l4.getText());
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

    ArrayList check(String clickL1, String clickL2, String clickL3, String clickL4, String clickL5, String clickL6, String clickL7, String clickL8, String clickL9) {

        ArrayList<String> a = new ArrayList<>();

        if (clickL1 == "x" && clickL2 == "x" && clickL3 == "x") {
            a.add("1");
            a.add("2");
            a.add("3");
            a.add("player1");
        }

        if (clickL4 == "x" && clickL5 == "x" && clickL6 == "x") {
            a.add("4");
            a.add("5");
            a.add("6");
            a.add("player1");
        }

        if (clickL7 == "x" && clickL8 == "x" && clickL9 == "x") {
            a.add("7");
            a.add("8");
            a.add("9");
            a.add("player1");
        }

        if (clickL1 == "x" && clickL4 == "x" && clickL7 == "x") {
            a.add("1");
            a.add("4");
            a.add("7");
            a.add("player1");
        }

        if (clickL2 == "x" && clickL5 == "x" && clickL8 == "x") {
            a.add("2");
            a.add("5");
            a.add("8");
            a.add("player1");
        }

        if (clickL3 == "x" && clickL6 == "x" && clickL9 == "x") {
            a.add("3");
            a.add("6");
            a.add("9");
            a.add("player1");
        }

        if (clickL1 == "x" && clickL5 == "x" && clickL9 == "x") {
            a.add("1");
            a.add("5");
            a.add("9");
            a.add("player1");
        }

        if (clickL3 == "x" && clickL5 == "x" && clickL7 == "x") {
            a.add("3");
            a.add("5");
            a.add("7");
            a.add("player1");
        }

        if (clickL1 == "o" && clickL2 == "o" && clickL3 == "o") {
            a.add("1");
            a.add("2");
            a.add("3");
            a.add("player2");
        }

        if (clickL4 == "o" && clickL5 == "o" && clickL6 == "o") {
            a.add("4");
            a.add("5");
            a.add("6");
            a.add("player2");
        }

        if (clickL7 == "o" && clickL8 == "o" && clickL9 == "o") {
            a.add("7");
            a.add("8");
            a.add("9");
            a.add("player2");
        }

        if (clickL1 == "o" && clickL4 == "o" && clickL7 == "o") {
            a.add("1");
            a.add("4");
            a.add("7");
            a.add("player2");
        }
        if (clickL2 == "o" && clickL5 == "o" && clickL8 == "o") {
            a.add("2");
            a.add("5");
            a.add("8");
            a.add("player2");
        }

        if (clickL3 == "o" && clickL6 == "o" && clickL9 == "o") {
            a.add("3");
            a.add("6");
            a.add("9");
            a.add("player2");
        }

        if (clickL1 == "o" && clickL5 == "o" && clickL9 == "o") {
            a.add("1");
            a.add("5");
            a.add("9");
            a.add("player2");
        }
        if (clickL3 == "o" && clickL5 == "o" && clickL7 == "o") {
            a.add("3");
            a.add("5");
            a.add("7");
            a.add("player2");
        }

        if (clickL1 == "x" && clickL2 == "x" && clickL3 == "x"
                || clickL4 == "x" && clickL5 == "x" && clickL6 == "x"
                || clickL7 == "x" && clickL8 == "x" && clickL9 == "x"
                || clickL1 == "x" && clickL4 == "x" && clickL7 == "x"
                || clickL2 == "x" && clickL5 == "x" && clickL8 == "x"
                || clickL3 == "x" && clickL6 == "x" && clickL9 == "x"
                || clickL1 == "x" && clickL5 == "x" && clickL9 == "x"
                || clickL3 == "x" && clickL5 == "x" && clickL7 == "x"
                || clickL1 == "o" && clickL2 == "o" && clickL3 == "o"
                || clickL4 == "o" && clickL5 == "o" && clickL6 == "o"
                || clickL7 == "o" && clickL8 == "o" && clickL9 == "o"
                || clickL1 == "o" && clickL4 == "o" && clickL7 == "o"
                || clickL2 == "o" && clickL5 == "o" && clickL8 == "o"
                || clickL3 == "o" && clickL6 == "o" && clickL9 == "o"
                || clickL1 == "o" && clickL5 == "o" && clickL9 == "o"
                || clickL3 == "o" && clickL5 == "o" && clickL7 == "o") {
        } else {
            a.add("draw");
        }

        return a;

    }

    int random() {

        Random r = new Random();
        int random = (int) ((Math.random() * (10 - 1)) + 1);

        return random;

    }

}
