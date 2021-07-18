package com.company;

public class UserInfo extends Main {
    private String Name = "Unkown";
    private String Email = "Unkown";
    private String Password = "Unkown";
    private int Age = 0;
    private String Sex = "Unkown";
    private String Statue = "Unkown";
    public UserInfo(String Name,String Email,String Password,int Age,String Sex,String Statue) {
        this.Name = Name;
        this.Email=Email;
        this.Password=Password;
        this.Age=Age;
        this.Sex=Sex;
        this.Statue=Statue;
    }

    public UserInfo() {
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getStatue() {
        return Statue;
    }

    public void setStatue(String statue) {
        Statue = statue;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Age=" + Age +
                ", Sex='" + Sex + '\'' +
                ", Statue='" + Statue + '\'' +
                '}'+'\n';
    }
}
