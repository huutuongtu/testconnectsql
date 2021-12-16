package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class testbuttonchangeframe {
    JFrame f;

    testbuttonchangeframe() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setSize(500,300);
        f = new JFrame();


        JButton bu = new JButton("123");
        bu.setSize(20,20);
        f.add(bu);

        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                JFrame jf = new JFrame();
                JButton but = new JButton();
                but.setSize(20,30);
                jf.add(but);
                but.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jf.setVisible(false);
                        f.setVisible(true);
                    }
                });
                jf.setVisible(true);
                jf.setSize(200,300);
            }
        });


        f.setSize(500, 300);
        f.setVisible(true);
        p.add(f);
    }

    public static void main(String[] args) {
        new testbuttonchangeframe();
    }
}