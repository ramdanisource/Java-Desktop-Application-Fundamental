/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaawt.example;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ramdani
 */
public class JavaAWTComponentExample {
    
    JavaAWTComponentExample(){
        
        Frame a = new Frame();
        
        Button b  = new Button("klik saya");
        b.setBounds(30, 100, 80, 30);
        b.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {               
                System.exit(0);
            }
        });
        
        //setting frame
        a.setTitle("Java AWT Component Example");
        a.setSize(500,300);
        a.setLayout(null);
        a.setVisible(true);
        
        a.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);              
            }
        });
        
        a.add(b);
        
    }
    
    public static void main(String[] args) {
        
        //instance class in main method
        JavaAWTComponentExample javaAWTComponentExample = new JavaAWTComponentExample();
    }
    
    
}
