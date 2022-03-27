package  Users;

import ChallengesScan.Challenge;
import ChallengesScan.Medal;
import Cinema.Cinema;
import Cinema.Movie;
import Cinema.Schedule;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person{
    private ArrayList<Schedule> bookings;
    public int completedChallenges;
    public int prizes;
    ArrayList<Medal> medails ;
    private ArrayList<Movie> watchedMovies;
    int age;
    boolean isBlocked;
    private ArrayList<Challenge> challenges;
    private ArrayList<Challenge> challengesCompleted;
    int totalMovies;
    private ArrayList<String> tickets;

    public Customer(String name, String email, String phone, Account account, int age){
        super(name, email, phone, account);
        this.completedChallenges = 0;
        this.prizes = 0;
        bookings = new ArrayList<Schedule>();
        nick = null;
        this.watchedMovies = new ArrayList<Movie>();
        this.age = age;
        isBlocked = false;
        this.totalMovies = 0;
        medails = new ArrayList<Medal>();
        tickets = new ArrayList<String>();
    }

    public String getNick(){
        return nick;
    }

    public boolean changePassword(String password, String newPassword){
        if(password.equals(getAccount().getPassword())){
            getAccount().resetPassword(newPassword);
            return true;
        }
        return false;
    }

    public boolean isBlocked(){
        return isBlocked;
    }

    public void setBlocked(boolean bloc){
        this.isBlocked = bloc;
    }


    public void createComments(String comment, Movie movie){
        movie.addComment(getName(), comment);
    }

    public void putRank(int rank, Movie movie){
        movie.addRank(rank);
    }

    public String showMedails() {
        return medails.toString();
    }

    public void watchMovie(Movie movie){
        boolean aux = false;
        for(int i = 0; i < bookings.size();i++){
            if(bookings.get(i).getMovie().equals(movie)){
                aux = true;
            }
        }
        if(aux){
            this.watchedMovies.add(movie);
        }
    }


    public void makeBooking(Schedule schedule){
        bookings.add(schedule);
    }

    public void showTickets(){
        tickets.toString();
    }

    public void getFunctions(Cinema cinema){
        System.out.println("Welcome " + getName()+ " What would you like to do?");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Pick an option: \n1. Watch Billboard\n2. Make a booking\n3. Watch active challenges\n4. Watch a movie" +
                    "\n5. Put comment\n6. Rank a movie\n7. Change password\n8. Log out ");
            int option = input.nextInt();
            if(option > 0 && option < 9){
                switch(option){
                    case 1:
                        System.out.println("Billboard");
                        cinema.printAllMovies();
                        break;
                    case 2:
                        System.out.println("Making a booking for ");
                        break;
                    case 3:
                        System.out.println("Display total challenges");
                        break;
                    case 4:
                        System.out.println("FOr what movie do you want to watch");

                        run = false;
                        System.out.println("See you later SuperUser :3");
                        System.out.println("\n==========================\n");
                        break;
                    case 5:
                        System.out.println("What movie do you want to comment");

                        break;
                    case 6:
                        System.out.println("What movie do you want to rank");
                        break;
                    case 7:
                        System.out.println("Change password option");
                        break;
                    case 8:
                        run = false;
                        System.out.println("See you later " + getName() + " :3");
                        System.out.println("\n==========================\n");
                        break;
                }
            }
        }while(run);
    }




}
