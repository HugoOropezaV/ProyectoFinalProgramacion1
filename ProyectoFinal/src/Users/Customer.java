package  Users;

import ChallengesScan.Challenge;
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
    public ArrayList<Movie> watchedMovies;
    int age;
    boolean isBlocked;
    private ArrayList<Challenge> challenges;
    private ArrayList<Challenge> challengesCompleted;
    int totalMovies;
    public ArrayList<String> tickets;
    public int[] numberOfComments = new int[100];
    public int[] numberOfMovies = new int[100];
    public int[] numberOfRanks = new int[100];

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


    public void createComments(String comment, Movie movie) {
        movie.addComment(getName(), comment);

        for(int i = 0; i < addsScan.commentChallenge.length; i++){
            if (addsScan.commentChallenge[i] != null){
                numberOfComments[i]++;
                addsScan.commentChallenge[i].Status = numberOfComments[i];
            }

        }

    }

    public void putRank(double rank, Movie movie){
        movie.addRank(rank);

        for(int i = 0; i < addsScan.rankChallenge.length; i++){
            if (addsScan.rankChallenge[i] != null){
                numberOfRanks[i]++;
                addsScan.rankChallenge[i].Status = numberOfRanks[i];
            }

        }
    }


    public void watchMovie(Movie movie) {
        boolean aux = false;
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getMovie().equals(movie)) {
                aux = true;
            }
        }
        if (aux) {
            this.watchedMovies.add(movie);
        }

        for(int i = 0; i < addsScan.watchChallenge.length; i++){
            if (addsScan.watchChallenge[i] != null){
                numberOfMovies[i]++;
                if(addsScan.watchChallenge[i].moviesToWatchCheck == true) {
                    for (int j = 0; j < addsScan.watchChallenge.length; j++) {
                        if (movie.equals(addsScan.watchChallenge[j])) {
                            numberOfMovies[i]++;
                            addsScan.watchChallenge[i].Status = numberOfMovies[i];
                        }
                    }
                }else
                    {
                    addsScan.watchChallenge[i].Status = numberOfMovies[i];
                }
            }

        }
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

    public String showTickets(){
        String res = "";
        for(String str : tickets){
            res += str + "\n";
        }
        return res;
    }

}
