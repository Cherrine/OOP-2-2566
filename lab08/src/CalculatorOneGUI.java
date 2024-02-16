import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JPanel pn1;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    private JButton bn4;
    

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        pn1 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        bn1 = new JButton("Plus");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multiply");
        bn4 = new JButton("Subtract");

        fr.setLayout(new GridLayout(4, 0));

        // Create JTextAreas for the first and second row
        fr.add(txt1);
        fr.add(txt2);

        // Create a panel with FlowLayout for the third row
        pn1.setLayout(new FlowLayout());
        pn1.add(bn1);
        pn1.add(bn2);
        pn1.add(bn3);
        pn1.add(bn4);

        fr.add(pn1);
        fr.add(txt3);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 165);
        fr.setVisible(true);
    }
}    