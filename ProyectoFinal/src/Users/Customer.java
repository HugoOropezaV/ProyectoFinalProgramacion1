package  Users;

import ChallengesScan.Challenge;
import ChallengesScan.Medal;
import Cinema.Cinema;
import Cinema.Movie;
import Cinema.Schedule;
import ChallengesScan.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person{

    ArrayList<Schedule> bookings;
    public int completedChallenges;
    public int prizes;
    ArrayList<Medal> medails ;
    public ArrayList<Movie> watchedMovies;
    int age;
    boolean isBlocked;
    private ArrayList<Challenge> challenges;
    private ArrayList<Challenge> challengesCompleted;
    int totalMovies;
    public ArrayList<String> tickets;

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

    public void putRank(double rank, Movie movie){
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

    public String getPerWatchMovies(){
        if(bookings.isEmpty()){
            return null;
        }else{
            String res = "";
            for(int i =0; i < bookings.size(); i++){
                res += (i+1) + ".  " + bookings.get(i).getMovie().getName();
            }
            return res;
        }
    }

    public String getWatchedMovies(){
        if(watchedMovies.isEmpty()){
            return null;
        }else{
            String res = "";
            for(int i =0; i < bookings.size(); i++){
                res += (i+1) + ".  " + watchedMovies.get(i).getName();
            }
            return res;
        }
    }

}
