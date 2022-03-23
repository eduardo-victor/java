package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculador extends JFrame implements ActionListener {

    public Calculador(){
        super("Calculadora");


        Container c = new JPanel();
        c.setLayout(new GridLayout(4,4, 4, 4));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("/"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("*"));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("-"));
        c.add(new JButton("C"));
        c.add(new JButton("0"));
        c.add(new JButton("="));
        c.add(new JButton("+"));


        Container n = getContentPane();
        n.add(BorderLayout.NORTH, new JTextField());
        n.add(BorderLayout.CENTER, c);

        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Calculador();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
