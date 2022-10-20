// 실습 8-5
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Practice_8_5 extends JFrame{
    public Practice_8_5(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 4);

        setLayout((grid));

        JButton J0 = new JButton("0");
        J0.setBackground(Color.RED);
        add(J0);

        JButton J1 = new JButton("1");
        add(J1);
        J1.setBackground(ORANGE);

        JButton J2 = new JButton("2");
        add(J2);
        J2.setBackground(YELLOW);

        JButton J3 = new JButton("3");
        add(J3);
        J3.setBackground(GREEN);

        JButton J4 = new JButton("4");
        add(J4);
        J4.setBackground(CYAN);

        JButton J5 = new JButton("5");
        add(J5);
        J5.setBackground(BLUE);

        JButton J6 = new JButton("6");
        add(J6);
        J6.setBackground(MAGENTA);

        JButton J7 = new JButton("7");
        add(J7);
        J7.setBackground(GRAY);

        JButton J8 = new JButton("8");
        add(J8);
        J8.setBackground(PINK);

        JButton J9 = new JButton("9");
        add(J9);
        J9.setBackground(LIGHT_GRAY);

        JButton J10 = new JButton("10");
        add(J10);
        J10.setBackground(WHITE);

        JButton J11 = new JButton("11");
        add(J11);
        J11.setBackground(DARK_GRAY);

        JButton J12 = new JButton("12");
        add(J12);
        J12.setBackground(BLACK);

        JButton J13 = new JButton("13");
        add(J13);
        J13.setBackground(ORANGE);

        JButton J14 = new JButton("14");
        add(J14);
        J14.setBackground(BLUE);

        JButton J15 = new JButton("15");
        add(J15);
        J15.setBackground(MAGENTA);

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Practice_8_5();
    }
}
