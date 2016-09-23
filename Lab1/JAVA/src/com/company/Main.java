package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Lab 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Оголошення компонентів
        JButton btn=new JButton("Результат");
        JTextField str = new JTextField();
        JTextField res = new JTextField();
        GridLayout gbl = new GridLayout(3,0);
        frame.setLayout(gbl);
        //Розміщення компонентів у вікнні
        frame.getContentPane().add(str);
        frame.getContentPane().add(btn);
        frame.getContentPane().add(res);
        //Розмір вікна
        frame.setSize(300,150);
        //Дія при натискані на кнопку "Result"
        btn.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      String a,b = "";
                                      int i;
                                      a = str.getText();
                                      for (i = a.length()-1; i>=0; i--)
                                      {
                                          b = b + a.charAt(i);
                                      }
                                      res.setText(b);
                                  }
                              }
        );
    }
}
