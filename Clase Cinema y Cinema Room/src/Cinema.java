import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name ;
    private String country;
    private  String city;
    private String address;
    private int phoneNumber;
    private String cinemaRoom;
    private List<CinemaRoom> rooms = new ArrayList<CinemaRoom>();
    private CinemaRoom room;
    private  List<Movie> movies = new ArrayList<Movie>();
    private Movie movie;

    public Cinema (String name,String country,String city, String address,int phoneNumber){
        this.name = name;
        this.country = country;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
    public void addRoom(int idRoom, int maxCapacity){
        room = new CinemaRoom(idRoom, maxCapacity);
        rooms.add(room);
    }

    public void printAllRoom(){
        for(CinemaRoom room : rooms){
            System.out.println(room);
        }
    }

    public void printOneRoom(int roomNumber){
        for (CinemaRoom room: rooms){
            if (room.getIdRoom()== roomNumber){
                System.out.println(room);
            }
        }
    }

    public List<CinemaRoom> getAllRoom(){
        return rooms;
    }

    public CinemaRoom getOneRoom(int idRoom){
        CinemaRoom roomResult = null;
        for (CinemaRoom room: rooms){
            if(room.getIdRoom() == idRoom){
                roomResult = room;
            }
        }
        return roomResult;
    }

    public void deleteRoom(int roomNumber){
        int idx = -1;
        for(CinemaRoom room: rooms){
            if (room.getIdRoom()== roomNumber){
                idx = rooms.indexOf(room);
            }
        }

        if(idx > -1){
            rooms.remove(idx);
        }
    }

    public void editRoom(int idRoom, int maxCapacity){
        room.setIdRoom(idRoom);
        room.setMaxCapacity(maxCapacity);
    }

    public void addMovie(String name, String category, String classification, String language,String type, int lengthMinutes, String premiereDate){
        movie= new Movie(name, category, classification, language, type, lengthMinutes, premiereDate);
        movies.add(movie);
    }

    public void printAllMovies(){
        for (Movie movie: movies){
            System.out.println(movie);
        }
    }

    public List<Movie> getAllMovies(){
        return movies;
    }

    public void printOneMovie(String movieName){
        for (Movie oneMovie: movies){
            if(oneMovie.getName()== movieName){
                System.out.println(oneMovie);
            }
        }
    }

    public Movie getOneMovie(String movieName){
        Movie movieResult = null;
        for (Movie oneMovie: movies){
            if(oneMovie.getName()== movieName){
               movieResult = oneMovie;
            }
        }
        return movieResult;
    }

    public void deleteMovie(String movieName){
        int idx2=-1;
        for (Movie oneMovieDelete: movies){
            if( oneMovieDelete.getName() == movieName){
                idx2 = movies.indexOf(oneMovieDelete);
            }
        }
        if(idx2 > -1){
            movies.remove(idx2);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
