package miniCalc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends Frame implements ActionListener {
    //declaring objects
    Frame f = new Frame("   mini AWT calculator ");
    Label l1 = new Label(" enter first number");
    Label l11 = new Label(" choose operation ");
    Label l2 = new Label(" enter second number");
    Label l3 = new Label(" result is");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b1 = new Button(" + ");
    Button b2 = new Button(" - ");
    Button b3 = new Button(" * ");
    Button b4 = new Button(" / ");
    Button b5 = new Button(" EXIT ");


    Calculator() {
        // coordinates of the objects

        l1.setBounds(50, 100, 160, 20);
        l11.setBounds(50, 180, 160, 20);
        l2.setBounds(50, 140, 160, 20);
        l3.setBounds(50, 280, 100, 20);
        t1.setBounds(230, 100, 100, 20);
        t2.setBounds(230, 140, 100, 20);
        t3.setBounds(230, 280, 100, 20);
        b1.setBounds(260, 180, 50, 20);
        b2.setBounds(260, 200, 50, 20);
        b3.setBounds(260, 220, 50, 20);
        b4.setBounds(260, 240, 50, 20);
        b5.setBounds(260, 320, 50, 20);

        //  adding the components
        f.add(l1);
        f.add(l11);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        t1.setBackground(Color.lightGray);
        t2.setBackground(Color.lightGray);
        l3.setBackground(Color.pink);
        b1.setBackground(Color.PINK);
        b1.addActionListener(this);
        b2.setBackground(Color.PINK);
        b2.addActionListener(this);
        b3.setBackground(Color.PINK);
        b3.addActionListener(this);
        b4.setBackground(Color.PINK);
        b4.addActionListener(this);
        b5.setBackground(Color.YELLOW);
        b5.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 400);
    }

    // the execution of operations
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            t3.setText(String.valueOf(a + b));
        }
        if (e.getSource() == b2) {
            t3.setText(String.valueOf(a - b));
        }
        if (e.getSource() == b3) {
            t3.setText(String.valueOf(a * b));
        }
        if (e.getSource() == b4) {
            if (b == 0) {
                t3.setText(" ERROR ");
            } else {
                t3.setText(String.valueOf((double) a / b));
            }

        }
        if (e.getSource() == b5) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
