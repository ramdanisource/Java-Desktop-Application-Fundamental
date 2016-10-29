/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ramdani
 */
public class JavaSwingExample {
    
    
    static JFrame frame;
    
    public static void main(String[] args) {
        
        //instance komponen JFrame
        frame = new JFrame("My Login With Swing Example");
        
        //config
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //instance komponen JPanel
        JPanel panel = new JPanel(); 
        
        //add panel to frame
        frame.add(panel);
        
        //method yang didalam panel terdapat komponen GUI
        KomponenFormLogin(panel);
        
        //set visibility frame
        frame.setVisible(true);       
        
    }

    private static void KomponenFormLogin(JPanel panel) {
        
        //config layout
        panel.setLayout(null);
        
        //instance komponen JLabel
        JLabel userLabel = new JLabel("Username");
        
        //konfigurasi letak label user
        userLabel.setBounds(20,20,80,25);
        
        //masukan kedalam panel
        panel.add(userLabel);
        
        //instance komponent JTextField
        JTextField userText = new JTextField(20);
        
        //konfigurasi letak TextField user
        userText.setBounds(100,20,220,25);
        
        //masukan kedalam panel
        panel.add(userText);
        
        
        /*
        *  Prosesnya sama seperti penambahan user laber dan text label
        */
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20,50,80,25);
        panel.add(passwordLabel);
        
        /*
        * menggunakan komponen JPasswordField, ketika user input, user tidak 
        * dapat melihat karakter yang diinputkan
        */
                
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,220,25);
        panel.add(passwordText);
        
        // instance JButton login
        JButton loginButton = new JButton("login");
        loginButton.setBounds(20, 80, 100, 25);
        
        
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "username = "+userText.getText()
                +"\npassword = "+passwordText.getText());
            }
        });
        
        
        panel.add(loginButton);       
        
        
    }
    
}
