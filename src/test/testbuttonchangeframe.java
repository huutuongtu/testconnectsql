package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class testbuttonchangeframe {


    testbuttonchangeframe() {
        JPanel f;
        JFrame fr = new JFrame();
        fr.setUndecorated(true);
        fr.setSize(600,700);
        f = new JPanel();
        f.setSize(500, 300);
        JButton bu = new JButton("123");
        bu.setSize(20,20);
        f.add(bu);
        fr.add(f);
        fr.setVisible(true);

        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel jp = new JPanel();
                jp.setLayout(new FlowLayout());
                jp.setSize(100,20);
                JPanel jp2 = new JPanel();
                jp2.setSize(100,20);
                jp2.setLayout(new FlowLayout());
                JFrame jf = new JFrame();
                jf.setExtendedState(jf.MAXIMIZED_BOTH);
                jf.setLayout(new FlowLayout());
                JButton but = new JButton("123");
                JButton butt = new JButton("345");
                JButton buttt = new JButton("567");
                butt.setSize(20,20);
                but.setSize(20,20);
                jf.setSize(200,100);
                jp.add(but);
                jp.add(butt);
                jp2.add(buttt);
                jf.add(jp2);
                jf.add(jp);
                fr.setVisible(false);
                jf.setVisible(true);
                butt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null,"ấn làm j");
                    }
                });
                but.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jf.setVisible(false);
                        fr.setVisible(true);
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        new testbuttonchangeframe(); 
    }
}