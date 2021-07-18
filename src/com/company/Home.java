package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Home extends UserInfo {

    private JPanel rootpanel;
    private JButton enterButton;
    private JButton signUpButton;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public Home(){

        add(rootpanel);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==signUpButton){
                    SignUp sp = new SignUp();
                    sp.setVisible(true);
                }
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean found = true;
                int j = 0;
                if (e.getSource()==enterButton){
                    String name = textField1.getText();
                    String pass = passwordField1.getText();
                    for (UserInfo user : users) {
                        if (user.getName().equals(name)) {
                            System.out.println("success");
                            break;
                        }else {
                            j++;
                        }
                    }

                        if (j==users.size() || users.isEmpty()){
                            if (textField1.getText().equals("") || passwordField1.getText().equals("")){
                                System.out.println("fill all the blankets !");
                            }else{
                            System.out.println("user not found!");}
                        }



                }
            }
        });
    }
}
