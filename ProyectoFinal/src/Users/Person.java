package  Users;
import java.util.HashMap;

public abstract class Person {
    private String name;
    private String email;
    private String phone;
    private Account account;
    private boolean loggedIn;
    String nick;

    public Person(String name, String email, String phone, Account account){
        this.name= name;
        this.email = email;
        this.phone = phone;
        this.account = account;
        this.loggedIn = false;
        this.nick = null;
    }
    public String showData(){
        return "Name: "+ name + "\n" + "Email: " + email + "\nPhone: " + phone + "\n" +this.account.toStirng();
    }
    public Account getAccount(){
        return this.account;
    }

    public String getNick(){
        return nick;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

}