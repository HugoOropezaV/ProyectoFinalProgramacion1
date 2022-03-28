package Users;

import Cinema.CinemaMenu;
import Cinema.*;
import ChallengesScan.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Page {

    LoginPage loginPage;
    ArrayList<Customer> users;
    CinemaMenu cinemaMenu;
    Admin admin;

    public Page(){
        loginPage = new LoginPage();
        users = IPersonManager.users;
        cinemaMenu = new CinemaMenu();
        admin = new Admin("admin", "admin@admin.com", "77777766", new Account("caca"));
        loginPage.addAccount(admin.getAccount().getId(),admin.getAccount().getPassword());
        System.out.println(admin.getAccount().toStirng());
    }

    public void getLoginFunctions(){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Welcome to the login page :D\n==========================\nWhat do you want to do?");
            System.out.println();
            System.out.println("Pick an option: \n1. Login to you account\n2. Create an account\n3. Exit");
            int option = input.nextInt();
            if(option > 0 && option < 4){
                switch(option){
                    case 1:
                        int id = 0;
                        String password;
                        boolean res = true;
                        while(res){
                            try{
                                System.out.print("Input your private ID: ");
                                String empty = input.nextLine();
                                id = input.nextInt() ;
                                System.out.print("\nProvide your private password: ");
                                res = false;
                            }catch (InputMismatchException e){
                                System.out.println("Ingrese los caracteres validos. Solo numeros para ID ");
                                res = true;
                            }
                        }

                        password = input.next();
                        System.out.println("Validating information... ");
                        System.out.println("login: " + loginPage.login(id, password));

                        while(!loginPage.login(id, password)){
                            System.out.println("Invalid password. Try again");
                            System.out.print("Input your private ID: ");
                            id = input.nextInt();
                            System.out.print("\nProvide your private password: ");
                            password = input.next();
                        }
                        System.out.println("\n==========================\n");
                        if(id == 1000){
                            getAdminFunctions();
                        }else{
                            getUserFunctions(id);
                        }
                        break;

                    case 2:

                        System.out.println("Input your name: ");
                        String name = input.next();

                        System.out.println("Email: ");
                        String email = input.next();

                        while(loginPage.isEmailRepeated(email) || !Utils.emailValidator(email)){
                            if(loginPage.isEmailRepeated(email)){
                                System.out.println("There is an account associated to this email. Provide other email");
                                System.out.println("Email: ");
                                email = input.nextLine();
                            }
                            if(!Utils.emailValidator(email)){
                                System.out.println("Input a invalid email: xxx@email.com ");
                                System.out.println("Email: ");
                                email = input.nextLine();
                            }
                        }

                        System.out.println("Phone: ");
                        String phone = input.next();
                        while(loginPage.isPhoneRepeated(phone) || !Utils.isValidPhone(phone)){
                            if(loginPage.isPhoneRepeated(phone)){
                                System.out.println("There is a phone associated to another account, please provide other phone number ");
                                System.out.println("Phone: ");
                                phone = input.next();
                            }
                            if(!Utils.isValidPhone(phone)){
                                System.out.println("Please provide a valid phone number: ");
                                System.out.println("Phone: ");
                                phone = input.next();
                            }
                        }

                        System.out.println("Secure password: ");
                        String newPassword = input.next();
                        while(!Utils.isValidPassword(newPassword)){
                            System.out.println("Your password is insecure, please provide a secure password");
                            newPassword = input.next();
                        }

                        System.out.print("Age: ");
                        int age = input.nextInt();
                        while(!(age < 100 && age > 12)){
                            System.out.println("Provide a valid age: ");
                            age = input.nextInt();
                        }
                        this.users.add(loginPage.createAccount(name,email,phone, newPassword, age));
                        System.out.println("\n==========================\n");
                        break;
                    case 3:

                        run = false;
                        System.out.println("See you later :) ");
                        System.out.println("\n==========================\n");
                        break;
                    default:
                        break;
                }
            }
        }while(run);
    }

    public void getAdminFunctions() {
        System.out.println("Welcome superuser. What would you like to do?");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Pick an option: \n1. User management functions\n2. Cinema Management Function\n3. Ranking Management Functions\n4. Log out");
            int option = input.nextInt();
            if(option > 0 && option < 5){
                switch(option){
                    case 1:
                        admin.getUserAdminFunctions();
                        break;
                    case 2:
                        getCinemaAdminFunctions();
                        break;
                    case 3:
                        getRankingAdminFunctions();
                        break;
                    case 4:
                        run = false;
                        System.out.println("See you later SuperUser :3");
                        System.out.println("\n==========================\n");
                        break;
                }
            }
        }while(run);
    }

    private void getCinemaAdminFunctions()  {
        System.out.println("Welcome Super user");
        cinemaMenu.printCinemaOptions();
    }

    private void getRankingAdminFunctions() {
        System.out.println("Welcome Super user");
        addsScan.challengeControlAd();
    }

    private void getUserFunctions(int id){
        loginPage.getPersonByID(id).getFunctions(cinemaMenu.getCinema());
    }
    /*
    opcion
     */
}
