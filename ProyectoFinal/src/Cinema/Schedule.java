package Cinema;

public class Schedule {
    private String hour;
    private String date;
    private String day;
    private Movie movie;
    private CinemaRoom room;

    public Schedule(String date, String hour, String day, Movie movie, CinemaRoom room){
        this.date = date;
        this.hour = hour;
        this.day = day;
        this.movie = movie;
        this.room = room;
    }
    public String getHour() {
        return hour;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaRoom getRoom() {
        return room;
    }

    public void setRoom(CinemaRoom room) {
        this.room = room;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("********************************************");
        sb.append("\n" + movie.getName() + " " + movie.getType() + " " + movie.getLanguages());
        sb.append("\n------------------------------------------");
        sb.append("\n"+ day + " "  + date);
        sb.append("\nHOUR: ");
        sb.append(hour);
        sb.append("\nRoom: ");
        sb.append(room.getIdRoom());
        sb.append("\n******************************************");
        return sb.toString();
    }
}
