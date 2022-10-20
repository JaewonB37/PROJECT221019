import javax.swing.*;

import java.awt.*;



class F3 extends JFrame

{

    F3()

    {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("BorderLayout Practice");



        GridLayout grid = new GridLayout(1,10);

        setLayout(grid);

        add(new JButton("0"));

        add(new JButton("1"));

        add(new JButton("2"));

        add(new JButton("3"));

        add(new JButton("4"));

        add(new JButton("5"));

        add(new JButton("6"));

        add(new JButton("7"));

        add(new JButton("8"));

        add(new JButton("9"));

        setSize(600,200);

        setVisible(true);

    }

}



public class M3

{

    public static void main(String[] args)

    {

        F3 A = new F3();

    }

}