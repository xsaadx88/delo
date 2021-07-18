package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUp extends UserInfo{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton resetButton;
    private JButton loginButton;
    private JPanel panel1;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton showUsersButton;
    public  static UserInfo u;

    public SignUp(){
        ButtonGroup group = new ButtonGroup();
        group.add(femaleRadioButton);
        group.add(maleRadioButton);
        add(panel1);
        setSize(300,400);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==saveButton) {
                   String name = textField1.getText();
                   String email = textField2.getText();
                   int age = Integer.valueOf(textField3.getText());
                   String pass = passwordField1.getText();
                   String statue= (String) comboBox1.getSelectedItem();
                   String sex = "unknown";
                   if (maleRadioButton.isSelected()){
                       sex=maleRadioButton.getText().toString();
                   }else if (femaleRadioButton.isSelected()){
                       sex =femaleRadioButton.getText().toString();
                   }
                   u =new UserInfo(name,email,pass,age,sex,statue);
                   users.add(u);
                    users.get(users.indexOf(u)).setName(name);

                }}});
                showUsersButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource()==showUsersButton){
                            System.out.println(users);
                        }
                    }
                });



        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==loginButton){
                    Home mypage = new Home();
                    mypage.setVisible(true);

                }
            }});

    }

}
