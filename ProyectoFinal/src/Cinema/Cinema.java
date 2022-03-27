package Cinema;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String country;
    private String city;
    private String address;
    private String phoneNumber;
    private List<CinemaRoom> rooms = new ArrayList<CinemaRoom>();
    private CinemaRoom room;
    private List<Movie> movies = new ArrayList<Movie>();
    private Movie movie;
    private List<Schedule> schedules = new ArrayList<Schedule>();
    private Schedule schedule;

    public Cinema(String name, String country, String city, String address, String phoneNumber){
        this.name = name;
        this.country = country;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        
    }

    public void addRoom(int idRoom, int maxCapacity){
        if (!thereIsRoom(rooms, idRoom)){
            room = new CinemaRoom(idRoom, maxCapacity);
            rooms.add(room);
        }else {
            System.out.println("The Room: " + idRoom + " is already Added to Cinema.");
        }

    }

    public void editRoom(CinemaRoom room, int idRoom, int maxCapacity){
            room.setIdRoom(idRoom);
            room.setMaxCapacity(maxCapacity);
    }

    public void deleteRoom(int roomId){
        int idx=-1;
        List<Schedule> ix = null;
        for (CinemaRoom room: rooms) {
            if(room.getIdRoom() == roomId){
                idx = rooms.indexOf(room);
            }
        }
        if(idx > -1){
            rooms.remove(idx);
            }
        }

    public void deleteSchedules(List<Schedule> ind){
        for (Schedule i: ind) {
            schedules.remove(i);
        }

    }
    public void printAllRooms(){
        for (CinemaRoom room: rooms) {
            System.out.println(room);
        }
    }

    public void printRoom(int idRoom){
        for (CinemaRoom room: rooms) {
            if(room.getIdRoom() == idRoom){
                System.out.println(room);
            }
        }
    }

    public List<CinemaRoom> getAllRooms(){
        return rooms;
    }

    public CinemaRoom getRoom(int idRoom){
        CinemaRoom roomResult = null;
        for (CinemaRoom room: rooms) {
            if(room.getIdRoom() == idRoom){
                roomResult = room;
            }
        }
        return roomResult;
    }

    public void addMovie(String name, String category, String classification, String languages, String type, int lengthMinutes,String premierDate){
        if(!thereIsMovie(movies, name , languages, type)){
            movie = new Movie(name, category, classification,languages,type,lengthMinutes, premierDate);
            movies.add(movie);
        }else {
            System.out.println("The Movie: " + name + " is already Added to Cinema.");
        }

    }

    public void printAllMovies(){
        for (Movie movie: movies) {
            System.out.println(movie);
        }
    }

    public void  printMovie(String movieName){
        for (Movie movie: movies) {
            if(movie.getName().equals(movieName)){
                System.out.println(movie);
            }
        }
    }
    public void editMovie(Movie movie, String name, String category, String classification, String languages, String type, int lengthMinutes,String premierDate) {
        movie.setName(name);
        movie.setCategory(category);
        movie.setClassification(classification);
        movie.setLanguages(languages);
        movie.setType(type);
        movie.setLengthMinutes(lengthMinutes);
        movie.setPremierDate(premierDate);
    }
    public void deleteMovie(String movieName, String language, String type){
        int idx=-1;
        for (Movie movie: movies) {
            if(movie.getName().equals(movieName) && movie.getLanguages().equals(language) && movie.getType().equals(type)){
                idx = movies.indexOf(movie);
            }
        }
        if(idx > -1){
            movies.remove(idx);
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getMovie(String movieName, String language, String type) {
        Movie movieResult = null;
        for (Movie movie: movies) {
            if(movie.getName().equals(movieName) && movie.getLanguages().equals(language) && movie.getType().equals(type)){
                movieResult = movie;
            }
        }
        return movieResult;
    }
    public void addSchedule(String date, String hour, String day, Movie movie, CinemaRoom room){
        if(!thereIsSchedule(schedules, date, hour, movie, room)){
            Schedule schedule = new Schedule(date, hour, day, movie, room);
            schedules.add(schedule);
        }else{
            System.out.println("The Schedule: " + date + " " + hour  + " " + room.getIdRoom() + " is already Added to Cinema.");
        }

    }

    public void editSchedule(Schedule s, String date, String hour, String day, Movie movie, CinemaRoom room){
        s.setDate(date);
        s.setHour(hour);
        s.setDay(day);
        s.setMovie(movie);
        s.setRoom(room);
    }

    public void deleteSchedule(String date, String hour, String day, Movie movie, CinemaRoom room){
        int idx=-1;
        for (Schedule s: schedules) {
            if(s.getDate().equals(date) && s.getHour().equals(hour) && s.getDay().equals(day) && s.getMovie().equals(movie) && s.getRoom().equals(room)){
                idx = schedules.indexOf(movie);
            }
        }
        if(idx > -1){
            schedules.remove(idx);
        }
    }

    public List<Schedule> getSchedules(){
        return schedules;
    }

    public void printScheduleToday(){
        boolean print;
        String scheduleToPrint;
        LocalDate mDate2 = LocalDate.now();
        String today = String.valueOf(mDate2);
        for(Movie movie: movies){
            print = false;
            scheduleToPrint= "";
            for(Schedule schedule : schedules){
                if(movie.equals(schedule.getMovie()) && schedule.getDate().equals(today)){
                    scheduleToPrint += schedule.getHour() + " ";
                    if(!print){
                        System.out.println("***************************************");
                        System.out.println(movie.getName() + " " + movie.getType());
                        System.out.println("--------------------------------------");
                        System.out.println("Language: " + movie.getLanguages());
                        System.out.println("Classification: " + movie.getClassification());
                        System.out.println("Type: " + movie.getType());
                        System.out.println("Time: " + movie.getLengthMinutes());
                        System.out.println("--------------------------------------");
                        print =true;
                    }
                }
            }
            if(print) {
                System.out.println("SCHEDULE: ");
                System.out.println(scheduleToPrint);
                System.out.println("***************************************");
            }
        }
    }



    public void printScheduleWeek(){
        boolean printW;
        LocalDate mDate = LocalDate.now();
        String Su = String.valueOf(mDate.with(DayOfWeek.SUNDAY));
        String Mo = String.valueOf(mDate.with(DayOfWeek.MONDAY));
        String Tu = String.valueOf(mDate.with(DayOfWeek.TUESDAY));
        String We = String.valueOf(mDate.with(DayOfWeek.WEDNESDAY));
        String Th = String.valueOf(mDate.with(DayOfWeek.THURSDAY));
        String Fr = String.valueOf(mDate.with(DayOfWeek.FRIDAY));
        String Sa = String.valueOf(mDate.with(DayOfWeek.SATURDAY));
        List <String> monday = new ArrayList<String>();
        List <String> tuesday = new ArrayList<String>();
        List <String> wednesday = new ArrayList<String>();
        List <String> thursday = new ArrayList<String>();
        List <String> friday= new ArrayList<String>();
        List <String> saturday = new ArrayList<String>();
        List <String> sunday = new ArrayList<String>();

        for(Movie movie: movies){
            printW = false;
            monday.clear();
            tuesday.clear();
            wednesday.clear();
            thursday.clear();
            friday.clear();
            saturday.clear();
            sunday.clear();
            for(Schedule schedule : schedules){
                if(movie.equals(schedule.getMovie())){
                    if(schedule.getDate().equals(Mo)){
                        monday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(Tu)){
                        tuesday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(We)){
                        wednesday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(Th)){
                        thursday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(Fr)){
                        friday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(Sa)){
                        saturday.add(schedule.getHour()+ " ");
                    }
                    if(schedule.getDate().equals(Su)){
                        sunday.add(schedule.getHour()+ " ");
                    }
                    if(!printW){
                        System.out.println("***************************************");
                        System.out.println(movie.getName() + " " + movie.getType());
                        System.out.println("--------------------------------------");
                        System.out.println("Language: " + movie.getLanguages());
                        System.out.println("Classification: " + movie.getClassification());
                        System.out.println("Type: " + movie.getType());
                        System.out.println("Time: " + movie.getLengthMinutes());
                        System.out.println("--------------------------------------");
                        printW =true;
                    }
                }
            }
            if(printW) {
                System.out.println("SCHEDULE: ");
                //System.out.println(scheduleToPrint);
                if(!monday.isEmpty()){
                    String hours = "";
                    System.out.print("MONDAY: ");
                    for (String day1 : monday){
                        hours += day1;
                    }
                    System.out.println(hours);
                }
                if(!tuesday.isEmpty()){
                    String hours = "";
                    System.out.print("TUESDAY: ");
                    for (String day2 : tuesday){
                        hours += day2;
                    }
                    System.out.println(hours);
                }
                if(!wednesday.isEmpty()){
                    String hours = "";
                    System.out.print("WEDNESDAY: ");
                    for (String day3 : wednesday){
                        hours += day3;
                    }
                    System.out.println(hours);
                }
                if(!thursday.isEmpty()){
                    String hours = "";
                    System.out.print("THURSDAY: ");
                    for (String day4 : thursday){
                        hours += day4;
                    }
                    System.out.println(hours);
                }
                if(!friday.isEmpty()){
                    String hours = "";
                    System.out.print("FRIDAY: ");
                    for (String day5 : friday){
                        hours += day5;
                    }
                    System.out.println(hours);
                }
                if(!saturday.isEmpty()){
                    String hours = "";
                    System.out.print("SATURDAY: ");
                    for (String day2 : saturday){
                        hours += day2;
                    }
                    System.out.println(hours);
                }
                if(!sunday.isEmpty()){
                    String hours = "";
                    System.out.print("SUNDAY: ");
                    for (String day2 : sunday){
                        hours += day2;
                    }
                    System.out.println(hours);
                }
                System.out.println("***************************************");
            }
        }

    }

    public void printTicket(Schedule schedule){
        System.out.println("***************************************");
        System.out.println(schedule.getMovie().getName() + " " + schedule.getMovie(). getType() + " " + schedule.getMovie().getLanguages());
        System.out.println(schedule.getDate());
        System.out.println(schedule.getHour() + " Room: " + schedule.getRoom().getIdRoom());
        System.out.println("***************************************");
    }
    public boolean thereIsRoom(List<CinemaRoom> rooms, int idRoom){
        boolean result = false;
        for (CinemaRoom room: rooms) {
            if (room.getIdRoom() == idRoom) {
                result =true;
            }
        }
        return result;
    }

    public boolean thereIsMovie(List<Movie> movies, String movieName, String language, String type ){
        boolean result = false;
        for (Movie mo: movies) {
            if(mo.getName().equals(movieName) && mo.getLanguages().equals(language) && mo.getType().equals(type)){
                result =true;
            }
        }
        return result;
    }

    public boolean thereIsSchedule(List<Schedule> schedules, String date, String hour, Movie movie, CinemaRoom room){
        boolean result = false;
        for (Schedule sc: schedules) {
            if(sc.getDate().equals(date) && sc.getHour().equals(hour) && sc.getMovie().equals(movie) && sc.getRoom().equals(room)){
                result =true;
            }
        }

        return result;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getCountry (){
        return country;
    }

    public String getCity(){
        return city;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getNumRooms(){
        return rooms.size();
    }

    public String toString(){
        return "";
    }
    
    public void setRooms(List<CinemaRoom> rooms) {
        this.rooms = rooms;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

}
