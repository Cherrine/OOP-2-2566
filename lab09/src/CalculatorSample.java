
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private TextField tx1;
    private JPanel pa1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;

    private String oper;
    private double numfirst;
    private double numlast;
    private double sumnum;
    private boolean havesum = false;
    private String tmpoper;
    private boolean tmphaveoper = false;

    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        tx1 = new TextField();
        pa1 = new JPanel();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("+");
        btn12 = new JButton("-");
        btn13 = new JButton("x");
        btn14 = new JButton("/");
        btn15 = new JButton("c");
        btn16 = new JButton("=");

        fr.setLayout(new BorderLayout());

        fr.add(tx1, BorderLayout.NORTH);

        pa1.setLayout(new GridLayout(4, 4));

        pa1.add(btn7);
        pa1.add(btn8);
        pa1.add(btn9);
        pa1.add(btn11);

        pa1.add(btn4);
        pa1.add(btn5);
        pa1.add(btn6);
        pa1.add(btn12);

        pa1.add(btn1);
        pa1.add(btn2);
        pa1.add(btn3);
        pa1.add(btn13);

        pa1.add(btn10);
        pa1.add(btn15);
        pa1.add(btn16);
        pa1.add(btn14);

        fr.add(pa1);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dis = tx1.getText();
        dis = (dis != null ? dis : "");
        switch (e.getActionCommand()) {
            case "1" ->
                tx1.setText(dis + "1");
            case "2" ->
                tx1.setText(dis + "2");
            case "3" ->
                tx1.setText(dis + "3");
            case "4" ->
                tx1.setText(dis + "4");
            case "5" ->
                tx1.setText(dis + "5");
            case "6" ->
                tx1.setText(dis + "6");
            case "7" ->
                tx1.setText(dis + "7");
            case "8" ->
                tx1.setText(dis + "8");
            case "9" ->
                tx1.setText(dis + "9");
            case "0" ->
                tx1.setText(dis + "0");
        }
        Object sc = e.getSource();
        if (sc.equals(btn11)) { //+
            if (tmphaveoper == true) {
                switch (tmpoper) {
                    case "+":
                        numfirst = Double.parseDouble(tx1.getText()) + numfirst;
                        break;
                    case "x":
                        numfirst = Double.parseDouble(tx1.getText()) * numfirst;
                        break;
                    case "-":
                        numfirst = numfirst - Double.parseDouble(tx1.getText());
                        break;
                    case "/":
                        numfirst = numfirst / Double.parseDouble(tx1.getText());
                        break;
                }
            } else {
                numfirst = Double.parseDouble(tx1.getText());
            }
            oper = "+";
            tx1.setText("");
            tmpoper = "+";
            tmphaveoper = true;
        } else if (sc.equals(btn12)) {//-
            if (tmphaveoper == true) {
                switch (tmpoper) {
                    case "+":
                        numfirst = Double.parseDouble(tx1.getText()) + numfirst;
                        break;
                    case "x":
                        numfirst = Double.parseDouble(tx1.getText()) * numfirst;
                        break;
                    case "-":
                        numfirst = numfirst - Double.parseDouble(tx1.getText());
                        break;
                    case "/":
                        numfirst = numfirst / Double.parseDouble(tx1.getText());
                        break;
                }
            } else {
                numfirst = Double.parseDouble(tx1.getText());
            }
            oper = "-";
            tx1.setText("");
            tmpoper = "-";
            tmphaveoper = true;
        } else if (sc.equals(btn13)) {//*
            if (tmphaveoper == true) {
                switch (tmpoper) {
                    case "+":
                        numfirst = Double.parseDouble(tx1.getText()) + numfirst;
                        break;
                    case "x":
                        numfirst = Double.parseDouble(tx1.getText()) * numfirst;
                        break;
                    case "-":
                        numfirst = numfirst - Double.parseDouble(tx1.getText());
                        break;
                    case "/":
                        numfirst = numfirst / Double.parseDouble(tx1.getText());
                        break;
                }
            } else {
                numfirst = Double.parseDouble(tx1.getText());
            }
            oper = "x";
            tx1.setText("");
            tmpoper = "x";
            tmphaveoper = true;
        } else if (sc.equals(btn14)) {///
            if (tmphaveoper == true) {
                switch (tmpoper) {
                    case "+":
                        numfirst = Double.parseDouble(tx1.getText()) + numfirst;
                        break;
                    case "x":
                        numfirst = Double.parseDouble(tx1.getText()) * numfirst;
                        break;
                    case "-":
                        numfirst = numfirst - Double.parseDouble(tx1.getText());
                        break;
                    case "/":
                        numfirst = numfirst / Double.parseDouble(tx1.getText());
                        break;
                }
            } else {
                numfirst = Double.parseDouble(tx1.getText());
            }
            oper = "/";
            tx1.setText("");
            tmpoper = "/";
            tmphaveoper = true;
        } else if (sc.equals(btn15)) {//c
            numfirst = 0;
            numlast = 0;
            oper = "";
            tx1.setText("");
            havesum = false;
            sumnum = 0;
            tmpoper = "";
            tmphaveoper = false;

        } else if (sc.equals(btn16)) {//=
            numlast = Double.parseDouble(tx1.getText());
            switch (oper) {
                case "+" -> {
                    if (havesum == true) {
                        sumnum = sumnum + numlast;
                    } else {
                        sumnum = numfirst + numlast;
                        havesum = true;
                    }
                    if (Double.isNaN(sumnum)) {
                        tx1.setText("Error : have 0/0");
                    } else {
                        tx1.setText(String.valueOf(sumnum));
                    }
                }
                case "-" -> {
                    if (havesum == true) {
                        sumnum = sumnum - numlast;
                    } else {
                        sumnum = numfirst - numlast;
                        havesum = true;
                    }
                    if (Double.isNaN(sumnum)) {
                        tx1.setText("Error : have 0/0");
                    } else {
                        tx1.setText(String.valueOf(sumnum));
                    }
                }

                case "x" -> {
                    if (havesum == true) {
                        sumnum = sumnum * numlast;
                    } else {
                        sumnum = numfirst * numlast;
                        havesum = true;
                    }
                    if (Double.isNaN(sumnum)) {
                        tx1.setText("Error : have 0/0");
                    } else {
                        tx1.setText(String.valueOf(sumnum));
                    }
                }

                case "/" -> {
                    if (numfirst == 0 && numlast == 0 && sumnum == 0) {
                        tx1.setText("Error : cannot 0/0");
                    } else {
                        if (havesum == true) {
                            sumnum = sumnum / numlast;
                        } else {
                            sumnum = numfirst / numlast;
                            havesum = true;
                        }
                        if (Double.isNaN(sumnum)) {
                            tx1.setText("Error : have 0/0");
                        } else {
                            tx1.setText(String.valueOf(sumnum));
                        }
                    }
                }
            }
        }
    }
}