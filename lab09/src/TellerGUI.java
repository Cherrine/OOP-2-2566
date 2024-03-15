
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener {
    
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JPanel pn4;
    private TextField tx1;
    private TextField tx2;
    private JLabel la1;
    private JLabel la2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    
    private Account ac;


    public TellerGUI() {
        this.ac = new Account(0, "BNKT");
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4, 0));

        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(1, 1));

        tx1 = new TextField(String.valueOf(ac.getBalance()));
        tx2 = new TextField();
        la1 = new JLabel("Balance");
        la2 = new JLabel("Amount");

        tx1.setEditable(false);
        pn1.add(la1);
        pn1.add(tx1);

        fr.add(pn1);

        pn2 = new JPanel();
        pn2.setLayout(new GridLayout(1, 1));

        pn2.add(la2);
        pn2.add(tx2);

        fr.add(pn2);

        pn3 = new JPanel();
        pn3.setLayout(new FlowLayout());

        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        pn3.add(btn1);
        pn3.add(btn2);
        pn3.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        fr.add(pn3);

        pn4 = new JPanel();

        fr.add(pn4);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sc = e.getSource();
        if (sc.equals(btn1)) {
            if (Double.parseDouble(tx2.getText()) > 0) {
                ac.setBalance(ac.getBalance() + Double.parseDouble(tx2.getText()));
                tx1.setText(String.valueOf(ac.getBalance()));
                tx2.setText("");
            }
        } else if (sc.equals(btn2)) {
            if (ac.getBalance() - Double.parseDouble(tx2.getText()) < 0) {
                return;
            } else if (Double.parseDouble(tx2.getText()) > 0) {
                ac.setBalance(ac.getBalance() - Double.parseDouble(tx2.getText()));
                tx1.setText(String.valueOf(ac.getBalance()));
            }
            tx2.setText("");
        } else if (sc.equals(btn3)) {
            fr.dispose();
        }
    }

}