package com.example.final_login.DB;

/**
 * Created by locus on 12/18/2016.
 */
public class user {

    private String name;
    private String username;
    private String password;


    public user(String name, String username, String password ) {
        this.name = name;
        this.username = username;
        this.password = password;
}

    public user(){

    }

    public String getNamename() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "QA{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
