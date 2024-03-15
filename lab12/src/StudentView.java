
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;


public class StudentView implements ActionListener, WindowListener {

    private JFrame fr;
    private JPanel pn, pn2;
    private JLabel lb1, lb2, lb3;
    private JTextField tx1, tx2, tx3;
    private JButton btn1, btn2;
    private File file;
    private Student peo;

    public StudentView() {
        peo = new Student();
        fr = new JFrame();
        pn = new JPanel();

        lb1 = new JLabel(" ID :");
        lb2 = new JLabel(" Name :");
        lb3 = new JLabel(" Money :");
        tx1 = new JTextField();
        tx2 = new JTextField();
        tx3 = new JTextField(String.valueOf(peo.getMoney()));

        tx3.setEditable(false);

        pn.setLayout(new GridLayout(3, 2));

        pn.add(lb1);
        pn.add(tx1);
        pn.add(lb2);
        pn.add(tx2);
        pn.add(lb3);
        pn.add(tx3);

        fr.add(pn, BorderLayout.NORTH);

        pn2 = new JPanel();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");

        pn2.setLayout(new FlowLayout());
        pn2.add(btn1);
        pn2.add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        fr.add(pn2, BorderLayout.CENTER);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

        //File
        file = new File("StudentM.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fr.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            peo.setMoney(peo.getMoney() + 100);
            tx3.setText(String.valueOf(peo.getMoney()));
        } else if (e.getSource().equals(btn2)) {
            if (peo.getMoney() <= 0) {
                peo.setMoney(0);
            } else if (peo.getMoney() >= 100) {
                peo.setMoney(peo.getMoney() - 100);
                tx3.setText(String.valueOf(peo.getMoney()));
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fi = new FileInputStream(file); ObjectInputStream oip = new ObjectInputStream(fi);) {
            peo = (Student) oip.readObject();
            if (peo == null) {
                peo = new Student();
                peo.setID(-1);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        if (peo.getID() == -1) {
            tx1.setText("");
        } else {
            tx1.setText(String.valueOf(peo.getID()));
        }
        tx2.setText(peo.getName());
        tx3.setText(String.valueOf(peo.getMoney()));
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (tx1.getText().equals("")) {
            peo.setID(-1);
        } else {
            peo.setID(Integer.parseInt(tx1.getText()));
        }
        peo.setName(tx2.getText());
        peo.setMoney(Integer.parseInt(tx3.getText()));
        try (FileOutputStream fo = new FileOutputStream(file); ObjectOutputStream oout = new ObjectOutputStream(fo);) {
            oout.writeObject(peo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }
}