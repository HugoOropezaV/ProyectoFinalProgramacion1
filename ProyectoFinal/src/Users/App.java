package  Users;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Page page = new Page();
        page.getLoginFunctions();
        /*LoginPage loginPage = new LoginPage();
        loginPage.getFunctions();

        LoginPage loginPage = new LoginPage(admin.getiDandPasswords().loginInfo);
        loginPage.addUser(admin);
        for(int i = 0; i < 10; i++){
            Person person = new Customer(String.valueOf(i), i+"@gmail.com", "7777044554"+i, new Account("password"), 18);
            admin.addUser(person);
            System.out.println(person.showData());
            System.out.println("=================");
        }
        for(int i = 0; i < 10; i++){
            System.out.println(loginPage.login(admin.getUsers().get(i).getAccount()));
        }
        System.out.println(loginPage.login(1010, "password"));*/
    }
    
}
