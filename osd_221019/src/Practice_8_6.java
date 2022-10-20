// 실습 8-6

import javax.swing.*;
import java.awt.*;

public class Practice_8_6 extends JFrame{
    Practice_8_6() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 300);
        setVisible(true);

        Container c = getContentPane();
        setLayout(null);

        for(int i = 0; i < 20; i++){
            JLabel label = new JLabel("");
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;
            label.setLocation(x, y);
            label.setSize(10, 10);
            label.setOpaque(true);
            label.setBackground(Color.BLUE);
            add(label);
        }

    }

    public static void main(String[] args){
        new Practice_8_6();
    }

}
