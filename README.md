# Java Desktop Development Fundamental

## **Perkenalan Java**

Java adalah salah satu bahasa pemrograman dan sebuah platform komputasi yang dikembangkan oleh Sun Microsystem dan diciptakan oleh James Gosling yang direlease pada tahun 1995.
Menurut statistik pada situs jejaring social coding yaitu github, java bahasa pemrograman populer kedua saat ini setelah JavaScript, statistik dapat dilihat situs [githut.info](http://githut.info/).
Java menggunakan bahasa pemrograman yang bersifat ``Hight Level`` , ``Robust``, ``Secure`` dan menggunakan paradigma pemrograman berorientasi obyek atau yang sering kita sebut OOP. Komponen inti dari Java sendiri yaitu Java Platform atau ``J2SE``.

Java memiliki berbagai jenis implementasi pada aplikasi java itu sendiri yaitu :
- **J2SE ( Java Standar Edition )**

    Java Standar Edition digunakan untuk implementasi pada aplikasi dekstop.

-  **J2EE ( Java Enterprise Edition )**

    Java Enterprise Edition ini digunakan untuk implementasi pada aplikasi bersekala Enterprise berbasis Web Application.

- **J2ME ( Java Micro Edition)**

    Java Micro Edition ini biasa digunakan untuk implementasi pada perangkat portable seperti feature phone, smartphone, wireless device, dan sebagainya.

## **Memulai Pengembangan Java Aplikasi Desktop**

Untuk memulai pembuatan aplikasi berbasis desktop menggunakan Java Standar Edition atau J2SE. 
Dimana pada **J2SE** ini dapat memanfaatkan komponen-komponen GUI (Graphical User Interface) yang terdapat
pada library **Java Development Kit** atau JDK.

pada pembuatan aplikasi berbasis GUI terdapat 2 jenis komponen yang dapat digunakan yaitu

- **Java AWT (Abstract Windowing Toolkit)**
- **Java Swing**

## **Java AWT (Abstract Windowing Toolkit)**

Java AWT atau Abstract Widowing Toolkit merupakan API (Aplication Programming Interface) untuk membuat aplikasi berbasis GUI pada java. 
Komponen Java AWT merupakan platform independen yang artinya komponen GUI yang akan ditampilkan berdasarkan Sistem Operasi yang digunakan,
tentunya masing-masing Sistem Operasi mempunyai komponen GUI yang berbeda-beda seperti pada sistem operasi windows , linux ataupun mac os.
Komponen Java AWT Sendiri cukup berat karena menggunakan resource pada sistem operasi yang digunakan.

Adapun susunan komponen yang digunakan pada Java AWT, seperti berikut:
<img width="600" src="https://github.com/ramdanisource/TugasPBO/blob/master/solving%201/screenshot/contoh_gist.png" alt="Screenshot">

Contoh full code Java AWT :

```java
/*
* author Rizki ramdani
* email ramdani.rizki19@gmail.com
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

```

## **Java Swing**
Contoh full code Java AWT :

```java
/*
* author Rizki ramdani
* email ramdani.rizki19@gmail.com
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

```





## **Referensi**
- https://www.tutorialspoint.com/java/java_overview.htm
- http://www.javatpoint.com/java-tutorial
- https://en.wikipedia.org/wiki/Graphical_user_interface
- http://www.javatpoint.com/java-awt
- http://www.javatpoint.com/java-swing