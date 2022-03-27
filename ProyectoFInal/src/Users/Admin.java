package  Users;

import Cinema.*;
import java.util.ArrayList;

public class Admin extends Person implements IPersonManager, IChallengeManager{
    private String name;
    private String email;
    private String phone;
    private Account account;

    Admin(String name, String email, String phone, Account account){
        super(name, email, phone, account);
    }

    public Movie createMovie(Movie movie){
        return movie;
    }

    @Override
    public ArrayList<Person> getUsers() {
        return IPersonManager.users;
    }

    @Override
    public IDandPasswords getiDandPasswords() {
        return IPersonManager.iDandPasswords;
    }

    @Override
    public void addUser(Person person) {
        getUsers().add(person);
        //getiDandPasswords().add(person.getAccount());
        getiDandPasswords().add(person.getAccount().getId(), person.getAccount().getPassword());
    }


    @Override
    public void createMedal() {

    }

    @Override
    public void checkMedal() {

    }

    @Override
    public void createChallenge() {

    }

    @Override
    public void checkChallenge() {

    }

    @Override
    public void deleteChallenge() {

    }

    @Override
    public void rewriteChallenge() {

    }

    @Override
    public void restoreChallenge() {

    }
}
