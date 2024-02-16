import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JTextField txt1;
    private JPanel pa1;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    private JButton bn4;
    private JButton bn5;
    private JButton bn6;
    private JButton bn7;
    private JButton bn8;
    private JButton bn9;
    private JButton bn10;
    private JButton bn11;
    private JButton bn12;
    private JButton bn13;
    private JButton bn14;
    private JButton bn15;
    private JButton bn16;

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        txt1 = new JTextField();
        pa1 = new JPanel();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        
        fr.setLayout(new BorderLayout());
        fr.add(txt1, BorderLayout.NORTH);
        pa1.setLayout(new GridLayout(4,4));
        
        pa1.add(bn1);
        pa1.add(bn2);
        pa1.add(bn3);
        pa1.add(bn4);
        
        pa1.add(bn5);
        pa1.add(bn6);
        pa1.add(bn7);
        pa1.add(bn8);
                
        pa1.add(bn9);
        pa1.add(bn10);
        pa1.add(bn11);
        pa1.add(bn12);
        
        pa1.add(bn13);
        pa1.add(bn14);
        pa1.add(bn15);
        pa1.add(bn16);
        
        fr.add(pa1);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
}    