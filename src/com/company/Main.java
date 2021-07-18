package com.company;
import javax.swing.*;
import java.util.ArrayList;

public class Main extends JFrame{
    public static ArrayList<UserInfo> users = new ArrayList<UserInfo>();
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        Home home = new Home();
        home.setVisible(true);

    }
}
