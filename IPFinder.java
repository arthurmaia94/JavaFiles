/*
 * IPFinder.java
 * Copyright 2022 Arthur Maia <contato.94tech@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version. 
 */
import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
public class IPFinder extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
    IPFinder(){  
        super("IP Finder - 94 Solucoes em Informatica");  
        l=new JLabel("Enter URL:");  
        l.setBounds(50,70,150,20);;  
        tf=new JTextField();  
        tf.setBounds(50,100,200,20);  
          
        b=new JButton("Find IP");  
        b.setBounds(50,150,80,30);  
        b.addActionListener(this);  
        add(l);  
        add(tf);  
        add(b);  
        setSize(500,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e){  
        String url=tf.getText();  
        try {  
            InetAddress ia=InetAddress.getByName(url);  
            String ip=ia.getHostAddress();  
            JOptionPane.showMessageDialog(this,ip);  
        } catch (UnknownHostException e1) {  
            JOptionPane.showMessageDialog(this,e1.toString());  
        }  
    }  
    public static void main(String[] args) {  
        new IPFinder();  
    }  
}  
