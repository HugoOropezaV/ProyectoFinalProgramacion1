package  Users;

import Cinema.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person implements IPersonManager{

    private String name;
    private String email;
    private String phone;
    private Account account;

    Admin(String name, String email, String phone, Account account){
        super(name, email, phone, account);
    }

    public void getUserAdminFunctions() {
        System.out.println("Welcome superuser. What would you like to do?");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Pick an option: \n1. Get All User List\n2. Block an User\n3. Unblock an User\n4. Exit");
            int option = input.nextInt();
            if(option > 0 && option < 5){
                switch(option) {
                    case 1:
                        System.out.println(getAllUsers());
                        break;
                    case 2:
                        if(IPersonManager.users.size() == 0){
                            System.out.println("There are no users at the moment");
                        }else{
                            System.out.println("Select an user to  block");
                            System.out.println(getAllUsers()+ "\n");
                            int blockUserOption = input.nextInt();
                            while(!(blockUserOption > 0 && blockUserOption <= users.size())){
                                System.out.println("You input an invalid option. ");
                                System.out.println("Select an option between  1 and " + IPersonManager.users.size());
                                System.out.println(getAllUsers()+ "\n");
                                blockUserOption = input.nextInt();
                            }
                            System.out.println("\n==========================\n");
                            System.out.println("You've blocked a " + IPersonManager.users.get(blockUserOption-1).getName());
                            blockUser(blockUserOption - 1, true);
                        }
                        break;
                    case 3:
                        if(IPersonManager.users.size() == 0){
                            System.out.println("There are no users at the moment");
                        }else{
                            System.out.println("Select an user to  unblock");
                            System.out.println(getAllUsers()+ "\n");
                            int unBlockUserOption = input.nextInt();
                            while(!(unBlockUserOption > 0 && unBlockUserOption <= IPersonManager.users.size())){
                                System.out.println("You input an invalid option. ");
                                System.out.println("Select an option between  1 and " + IPersonManager.users.size());
                                System.out.println(getAllUsers()+ "\n");
                                unBlockUserOption = input.nextInt();
                            }
                            System.out.println("\n==========================\n");
                            System.out.println("You've unblocked a " + IPersonManager.users.get(unBlockUserOption-1).getName());
                            blockUser(unBlockUserOption - 1, false);
                        }
                        break;
                    case 4:
                        System.out.println("Redirecting...");
                        System.out.println("\n==========================\n");
                        run = false;
                        break;
                }
            }
        }while(run);

    }

    /*@Override
    public void createMovie(String name, String category, String description, String classification, String languaje, String premiereDate, int duration) {
        Users.IMovieManager.movies.add(new Movie(name, category, description, classification, languaje, premiereDate, duration));
    }

    @Override
    public void deleteMovie(int i) {
        Users.IMovieManager.movies.remove(i);
    }

    @Override
    public void createShow(String start, String end, CinemaRoom room, Movie movie) {
        movie.addShow(new Show(start, end, room, movie));
    }

    @Override
    public void removeShow(Movie movie, int option) {
        movie.shows.remove(option);
    }

    @Override
    public String getAllMovies() {
        String movies = "";
        int counter = 1;
        for(Movie movie : Users.IMovieManager.movies){
            movies += counter + "." + movie.getName();
        }
        return movies;
    }

    @Override
    public String getAllShows(Movie movie){
        String res = "";
        int counter = 1;
        if(movie.totalShows() == 0){
            res = "This movie doesn't has associated shows";
        }else{
            for(int i = 0; i < movie.totalShows(); i++){
                res += counter + ". " + movie.shows.get(i).getName() +"\n";
            }
        }
        return res;
    }*/

    @Override
    public ArrayList<Customer> getUsers() {
        return users;
    }

    @Override
    public String getAllUsers() {
        String users = "";

        if(IPersonManager.users.size() == 0){
            users = "There are no users at the moment";
        }else {
            int counter = 1;
            for (Person person : IPersonManager.users) {
                users += counter + ". " + person.getName() +"\n";
            }
        }
        return users;
    }

    @Override
    public void blockUser(Customer person) {

    }


    public String getAllUsersWithBlockedStatus() {
        String users = "";
        int counter = 1;
        if(IPersonManager.users.size() == 0){
            users = "There are no users at the moment";
        }
        else{
            for(Customer person : IPersonManager.users){
                users += counter + ". " + person.getName() + " ---> " + person.isBlocked() +"\n";
            }
        }
        return users;
    }


    @Override
    public void blockUser(int i, boolean block) {
        Customer customer = IPersonManager.users.get(i);
        customer.setBlocked(true);
    }

}
