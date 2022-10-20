// 실습 8-8

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground((Color.LIGHT_GRAY));
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);

        for(int i = 0; i < 10; i++) {
            JLabel label = new JLabel("*");
            int x = (int)(Math.random()*280 + 10);
            int y = (int)(Math.random()*150) + 20;
            label.setLocation(x, y);
            label.setSize(10,10);
            label.setForeground(Color.RED);
            label.setOpaque(true);
            add(label);
        }
    }
}

class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground((Color.YELLOW));
        setLayout(new FlowLayout());
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}



public class Practice_8_8 extends JFrame {
    public Practice_8_8() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new NorthPanel(), BorderLayout.NORTH);
        add(new CenterPanel(), BorderLayout.CENTER);
        add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practice_8_8();
    }
}
