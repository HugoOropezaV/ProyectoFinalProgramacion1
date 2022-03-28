package  Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginPage {

    HashMap<Integer, String> loginInfo;
    IDandPasswords iDandPasswords;
    LoginPage(){
        this.loginInfo = new HashMap<Integer, String>();
        iDandPasswords = new IDandPasswords();
    }

    LoginPage(HashMap<Integer, String> loginInfo){
        this.loginInfo = loginInfo;
    }

    public boolean login(int ID, String password){
        if(loginInfo.containsKey(ID)){
            if(loginInfo.get(ID).equals(password)){
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean login(Account account){
        if(loginInfo.containsKey(account.getId())){
            if(loginInfo.get(account.getId()).equals(account.getPassword())){
                account.isLogged(true);
                return true;
            }
            return false;
        }
        return false;
    }
    private Customer createAccount(Customer person){
        IPersonManager.users.add(person);
        //iDandPasswords.add(person.getAccount().getId(), person.getAccount().getPassword());
        this.addAccount(person.getAccount().getId(),person.getAccount().getPassword());
        System.out.println("your private id is : " + person.getAccount().getId());
        return person;
    }
    public Customer createAccount(String name, String email, String phone, String password, int age){
        Customer customer = new Customer(name, email, phone, new Account(password), age);
        IPersonManager.users.add(customer);
        System.out.println("Your registrations was succesfull.\n Please login to your new account :)");
        System.out.println("Your unique private ID is :" + customer.getAccount().getId());
        this.addAccount(customer.getAccount().getId(),customer.getAccount().getPassword());
        return customer;
    }

    public boolean isEmailRepeated(String email){
        String aux = "";
        for(int i = 0; i < IPersonManager.users.size(); i++){
            if(email.equals(IPersonManager.users.get(i).getEmail())){
                return true;
            }
        }
        return false;
    }

    public boolean isNickRepeated(String nick) {
        for (int i = 0; i < IPersonManager.users.size(); i++) {
            if (nick.equals(IPersonManager.users.get(i).getNick())) {
                return true;
            }
        }
        return false;
    }
    public Customer getPersonByID(int id){
        for(Customer person : IPersonManager.users){
            if(id == person.getAccount().getId()){
                return person;
            }
        }
        return null;
    }



    public boolean isPhoneRepeated(String phone) {
        for(int i = 0; i< IPersonManager.users.size(); i++){
            if(phone.equals(IPersonManager.users.get(i).getPhone())){
                return true;
            }
        }
        return false;
    }

    public void addAccount(int id, String password){
        this.iDandPasswords.add(id, password);
    }

}
