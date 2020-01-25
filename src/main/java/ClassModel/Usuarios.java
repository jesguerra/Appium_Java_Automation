/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2020
description: Model Users class
 */
package ClassModel;

public class Usuarios {
    private String username;
    private String email;
    private String password;
    private String name;

    public Usuarios(String username, String email, String password, String name) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getUsername(){
        return username;
    }
}
