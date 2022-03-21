import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<Booking> bookings;
    public int completedChallenges;
    public int prizes;
    String[] medals;

    public Customer(String name, String email, String phone, Account account){
        super(name, email, phone, account);
        this.completedChallenges = 0;
        this.prizes = 0;
        this.medals = new String[10];
        bookings = new ArrayList<Booking>();
    }
    private ArrayList<Movie> movieHistory;

    public String putAvatars(String nick){
        return "";
    }
    public Comment createComments(Comment comment, Movie movie){
        return null;
    }
    public int putRank(int rank){
        return 0;
    }

    public void watchMovie(Movie movie){

    }

}
