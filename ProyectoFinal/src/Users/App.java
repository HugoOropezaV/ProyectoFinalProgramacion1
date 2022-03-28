package  Users;
import Cinema.CinemaMenu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Page page = new Page();
        page.getLoginFunctions();

        /*CinemaMenu cinemaMenu = new CinemaMenu();
        cinemaMenu.printCinemaOptions();
*/
        /*Admin admin = new Admin("admin", "admin@admin.com", "77777766", new Account("caca"));
        LoginPage loginPage = new LoginPage();
        loginPage.addAccount(admin.getAccount().getId(), admin.getAccount().getPassword());
        for(int i = 0; i < 10; i++){
            Customer person = new Customer(String.valueOf(i), i+"@gmail.com", "7777044554"+i, new Account("password"), 18);
            loginPage.createAccount(person);
            System.out.println(person.showData());
            System.out.println("=================");
        }
        for(int i = 0; i < 10; i++){
            System.out.println(loginPage.login(admin.getUsers().get(i).getAccount()));
        }
        //System.out.println(loginPage.login(1010, "password"));*/
    }
    
}
