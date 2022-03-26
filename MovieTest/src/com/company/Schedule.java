package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Schedule {
    public void Schedule(){
        Date date = new Date();
        System.out.println("Date: " + date);
        DateFormat df = new SimpleDateFormat("hh:'00' a");
        String hour = df.format(date);
        System.out.println("Hour: " + hour);
    }

}
