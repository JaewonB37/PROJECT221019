// 실습 8-3
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.ORANGE;
import static java.awt.Color.RED;

public class Practice_8_3 extends JFrame{
    public Practice_8_3(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1, 10);

        setLayout((grid));

        for(int i = 0; i <= 9; i++) {
            add(new JButton(String.valueOf(i)));
        }

        setSize(600, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Practice_8_3();
    }
}
