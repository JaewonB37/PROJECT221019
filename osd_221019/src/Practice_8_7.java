//// 실습 8-7
//
//import javax.swing.*;
//import java.awt.*;
//
//class NorthPanel extends JPanel {
//    public NorthPanel() {
//        setBackground((Color.LIGHT_GRAY));
//        setLayout(new FlowLayout());
//        add(new JLabel("수식 입력"));
//        add(new JTextField("                                                               "));
//    }
//}
//
//class CenterPanel extends JPanel {
//    public CenterPanel() {
//        setLayout(new GridLayout(4, 4));
//
//        JButton J1 = new JButton("0");
//        add(J1);
//
//        JButton J2 = new JButton("1");
//        add(J2);
//
//        JButton J3 = new JButton("2");
//        add(J3);
//
//        JButton J4 = new JButton("3");
//        add(J4);
//
//        JButton J5 = new JButton("4");
//        add(J5);
//
//        JButton J6 = new JButton("5");
//        add(J6);
//
//        JButton J7 = new JButton("6");
//        add(J7);
//
//        JButton J8 = new JButton("7");
//        add(J8);
//
//        JButton J9 = new JButton("8");
//        add(J9);
//
//        JButton J10 = new JButton("9");
//        add(J10);
//
//        JButton J11 = new JButton("CE");
//        add(J11);
//
//        JButton J12 = new JButton("계산");
//        add(J12);
//
//        JButton J13 = new JButton("+");
//        J13.setBackground(Color.CYAN);
//        add(J13);
//
//        JButton J14 = new JButton("-");
//        J14.setBackground(Color.CYAN);
//        add(J14);
//
//        JButton J15 = new JButton("x");
//        J15.setBackground(Color.CYAN);
//        add(J15);
//
//        JButton J16 = new JButton("/");
//        J16.setBackground(Color.CYAN);
//        add(J16);
//    }
//}
//
//class SouthPanel extends JPanel {
//    public SouthPanel() {
//        setBackground((Color.YELLOW));
//        setLayout(new FlowLayout());
//        add(new JLabel("계산 결과"));
//        add(new JTextField("                                                               "));
//    }
//}
//
//
//
//public class Practice_8_7 extends JFrame {
//    public Practice_8_7() {
//        setTitle("계산기 프레임");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        add(new NorthPanel(), BorderLayout.NORTH);
//        add(new CenterPanel(), BorderLayout.CENTER);
//        add(new SouthPanel(), BorderLayout.SOUTH);
//
//        setSize(300, 300);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Practice_8_7();
//    }
//}
