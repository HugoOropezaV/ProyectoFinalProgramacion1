package  Users;

import Cinema.Schedule;

import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<Schedule> bookings;
    public int completedChallenges;
    public int prizes;
    String[] medals;

    public Customer(String name, String email, String phone, Account account){
        super(name, email, phone, account);
        this.completedChallenges = 0;
        this.prizes = 0;
        this.medals = new String[10];
        bookings = new ArrayList<Schedule>();
    }


}
