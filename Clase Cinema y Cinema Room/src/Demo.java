import java.util.ArrayList;
import java.util.List;

public class Demo {
    private Cinema demoCinema;
    private List<Movie> movies= new ArrayList<Movie>();
    private List<CinemaRoom> rooms= new ArrayList<CinemaRoom>();
    public Demo(){
        demoCinema = new Cinema("MultiCine", "Bolivia", "Sucre", "Av. Montenegro Nro. 4695", "591-79756842");
        demoCinema.addRoom(1,40);
        demoCinema.addRoom(2,45);
        demoCinema.addRoom(3,50);
        demoCinema.addRoom(4,30);
        rooms =demoCinema.getAllRooms();

        demoCinema.addMovie("¡QUE DESPADRE!", "Comedy", "All Public", "Spanish/English","2D", 110, "2022-03-14");
        demoCinema.addMovie("AMBULANCIA", "Action/Suspense", "14+", "Spanish/English","2D", 150, "2022-03-12");
        demoCinema.addMovie("EL GRAN MOVIMIENTO", "Drama", "All Public", "Spanish","2D", 95, "2022-03-15");
        demoCinema.addMovie("KARNAWAL", "Drama", "All Public", "Spanish","2D", 110, "2022-3-2");
        demoCinema.addMovie("SPIDERMAN", "Fantastic/Action", "All Public", "English","3D", 170, "2022-03-2");
        demoCinema.addMovie("SPIDERMAN", "Fantastic/Action", "All Public", "English","2D", 170, "2022-03-2");
        demoCinema.addMovie("THE BATMAN", "Action/Suspense", "14+", "Spanish/English","2D", 190, "2022-03-3");
        movies =demoCinema.getMovies();

        //agregar schedules para el dia 28 y la semana hasta el 2 de abril
        //cada sala con porlomenos una peli
        //una sala full

        //LUNES
        demoCinema.addSchedule("2022-03-28", "12:10","Monday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-28", "16:20","Monday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-28", "18:30","Monday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-28", "22:30","Monday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "19:10","Monday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-28", "16:00","Monday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "21:40","Monday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-28", "15:00","Monday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-28", "19:00","Monday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-28", "12:00","Monday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-28", "14:20","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "18:40","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "12:30","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "22:30","Monday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-28", "19:30","Monday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-28", "19:00","Monday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-28", "22:30","Monday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-28", "12:30","Monday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-28", "13:20","Monday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-28", "14:30","Monday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-28", "16:30","Monday", movies.get(6), rooms.get(0));

        // MARTES
        demoCinema.addSchedule("2022-03-29", "12:10","Tuesday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-29", "16:20","Tuesday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-29", "18:30","Tuesday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-29", "22:30","Tuesday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "19:10","Tuesday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-29", "16:00","Tuesday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "21:40","Tuesday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-29", "15:00","Tuesday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-29", "19:00","Tuesday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-29", "12:00","Tuesday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-29", "14:20","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "18:40","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "12:30","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "22:30","Tuesday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-29", "19:30","Tuesday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-29", "19:00","Tuesday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-29", "22:30","Tuesday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-29", "12:30","Tuesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-29", "13:20","Tuesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-29", "14:30","Tuesday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-29", "16:30","Tuesday", movies.get(6), rooms.get(0));

        // MIERCOLES
        demoCinema.addSchedule("2022-03-30", "12:10","Wednesday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-30", "16:20","Wednesday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-30", "18:30","Wednesday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-30", "22:30","Wednesday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "19:10","Wednesday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-30", "16:00","Wednesday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "21:40","Wednesday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-30", "15:00","Wednesday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-30", "19:00","Wednesday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-30", "12:00","Wednesday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-30", "14:20","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "18:40","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "12:30","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "22:30","Wednesday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-30", "19:30","Wednesday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-30", "19:00","Wednesday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-30", "22:30","Wednesday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-30", "12:30","Wednesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-30", "13:20","Wednesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-30", "14:30","Wednesday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-30", "16:30","Wednesday", movies.get(6), rooms.get(0));

        // Jueves

        demoCinema.addSchedule("2022-03-31", "12:10","Thursday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-31", "16:20","Thursday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-31", "18:30","Thursday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-31", "22:30","Thursday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "19:10","Thursday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-31", "16:00","Thursday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "21:40","Thursday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-31", "15:00","Thursday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-31", "19:00","Thursday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-31", "12:00","Thursday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-31", "14:20","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "18:40","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "12:30","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "22:30","Thursday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-31", "19:30","Thursday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-31", "19:00","Thursday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-31", "22:30","Thursday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-31", "12:30","Thursday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-31", "13:20","Thursday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-31", "14:30","Thursday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-31", "16:30","Thursday", movies.get(6), rooms.get(0));

        // VIERNES
        demoCinema.addSchedule("2022-04-01", "12:10","Friday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-04-01", "16:20","Friday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-04-01", "18:30","Friday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-04-01", "22:30","Friday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "19:10","Friday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-04-01", "16:00","Friday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "21:40","Friday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-04-01", "15:00","Friday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-04-01", "19:00","Friday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-04-01", "12:00","Friday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-04-01", "14:20","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "18:40","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "12:30","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "22:30","Friday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-04-01", "19:30","Friday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-04-01", "19:00","Friday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-04-01", "22:30","Friday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-04-01", "12:30","Friday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-01", "13:20","Friday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-01", "14:30","Friday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-04-01", "16:30","Friday", movies.get(6), rooms.get(0));

        //SABADO

        demoCinema.addSchedule("2022-04-02", "12:10","Saturday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-04-02", "16:20","Saturday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-04-02", "18:30","Saturday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-04-02", "22:30","Saturday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "19:10","Saturday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-04-02", "16:00","Saturday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "21:40","Saturday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-04-02", "15:00","Saturday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-04-02", "19:00","Saturday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-04-02", "12:00","Saturday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-04-02", "14:20","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "18:40","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "12:30","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "22:30","Saturday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-04-02", "19:30","Saturday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-04-02", "19:00","Saturday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-04-02", "22:30","Saturday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-04-02", "12:30","Saturday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-02", "13:20","Saturday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-02", "14:30","Saturday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-04-02", "16:30","Saturday", movies.get(6), rooms.get(0));

        //DOMINGO
        demoCinema.addSchedule("2022-04-03", "12:10","Sunday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-04-03", "16:20","Sunday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-04-03", "18:30","Sunday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-04-03", "22:30","Sunday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "19:10","Sunday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-04-03", "16:00","Sunday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "21:40","Sunday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-04-03", "15:00","Sunday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-04-03", "19:00","Sunday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-04-03", "12:00","Sunday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-04-03", "14:20","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "18:40","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "12:30","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "22:30","Sunday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-04-03", "19:30","Sunday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-04-03", "19:00","Sunday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-04-03", "22:30","Sunday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-04-03", "12:30","Sunday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-03", "13:20","Sunday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-04-03", "14:30","Sunday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-04-03", "16:30","Sunday", movies.get(6), rooms.get(0));


        //LUNES
        demoCinema.addSchedule("2022-03-21", "12:10","Monday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-21", "16:20","Monday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-21", "18:30","Monday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-21", "22:30","Monday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "19:10","Monday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-21", "16:00","Monday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "21:40","Monday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-21", "15:00","Monday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-21", "19:00","Monday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-21", "12:00","Monday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-21", "14:20","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "18:40","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "12:30","Monday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "22:30","Monday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-21", "19:30","Monday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-21", "19:00","Monday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-21", "22:30","Monday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-21", "12:30","Monday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-21", "13:20","Monday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-21", "14:30","Monday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-21", "16:30","Monday", movies.get(6), rooms.get(0));

        // MARTES
        demoCinema.addSchedule("2022-03-22", "12:10","Tuesday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-22", "16:20","Tuesday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-22", "18:30","Tuesday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-22", "22:30","Tuesday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "19:10","Tuesday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-22", "16:00","Tuesday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "21:40","Tuesday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-22", "15:00","Tuesday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-22", "19:00","Tuesday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-22", "12:00","Tuesday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-22", "14:20","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "18:40","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "12:30","Tuesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "22:30","Tuesday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-22", "19:30","Tuesday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-22", "19:00","Tuesday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-22", "22:30","Tuesday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-22", "12:30","Tuesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-22", "13:20","Tuesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-22", "14:30","Tuesday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-22", "16:30","Tuesday", movies.get(6), rooms.get(0));

        // MIERCOLES
        demoCinema.addSchedule("2022-03-23", "12:10","Wednesday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-23", "16:20","Wednesday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-23", "18:30","Wednesday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-23", "22:30","Wednesday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "19:10","Wednesday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-23", "16:00","Wednesday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "21:40","Wednesday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-23", "15:00","Wednesday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-23", "19:00","Wednesday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-23", "12:00","Wednesday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-23", "14:20","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "18:40","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "12:30","Wednesday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "22:30","Wednesday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-23", "19:30","Wednesday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-23", "19:00","Wednesday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-23", "22:30","Wednesday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-23", "12:30","Wednesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-23", "13:20","Wednesday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-23", "14:30","Wednesday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-23", "16:30","Wednesday", movies.get(6), rooms.get(0));

        // Jueves

        demoCinema.addSchedule("2022-03-24", "12:10","Thursday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-24", "16:20","Thursday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-24", "18:30","Thursday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-24", "22:30","Thursday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "19:10","Thursday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-24", "16:00","Thursday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "21:40","Thursday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-24", "15:00","Thursday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-24", "19:00","Thursday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-24", "12:00","Thursday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-24", "14:20","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "18:40","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "12:30","Thursday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "22:30","Thursday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-24", "19:30","Thursday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-24", "19:00","Thursday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-24", "22:30","Thursday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-24", "12:30","Thursday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-24", "13:20","Thursday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-24", "14:30","Thursday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-24", "16:30","Thursday", movies.get(6), rooms.get(0));

        // VIERNES
        demoCinema.addSchedule("2022-03-25", "12:10","Friday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-25", "16:20","Friday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-25", "18:30","Friday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-25", "22:30","Friday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "19:10","Friday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-25", "16:00","Friday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "21:40","Friday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-25", "15:00","Friday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-25", "19:00","Friday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-25", "12:00","Friday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-25", "14:20","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "18:40","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "12:30","Friday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "22:30","Friday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-25", "19:30","Friday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-25", "19:00","Friday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-25", "22:30","Friday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-25", "12:30","Friday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-25", "13:20","Friday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-25", "14:30","Friday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-25", "16:30","Friday", movies.get(6), rooms.get(0));

        //SABADO

        demoCinema.addSchedule("2022-03-26", "12:10","Saturday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-26", "16:20","Saturday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-26", "18:30","Saturday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-26", "22:30","Saturday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "19:10","Saturday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-26", "16:00","Saturday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "21:40","Saturday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-26", "15:00","Saturday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-26", "19:00","Saturday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-26", "12:00","Saturday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-26", "14:20","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "18:40","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "12:30","Saturday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "22:30","Saturday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-26", "19:30","Saturday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-26", "19:00","Saturday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-26", "22:30","Saturday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-26", "12:30","Saturday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-26", "13:20","Saturday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-26", "14:30","Saturday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-26", "16:30","Saturday", movies.get(6), rooms.get(0));

        //DOMINGO
        demoCinema.addSchedule("2022-03-27", "12:10","Sunday", movies.get(0), rooms.get(0));
        demoCinema.addSchedule("2022-03-27", "16:20","Sunday", movies.get(0), rooms.get(1));
        demoCinema.addSchedule("2022-03-27", "18:30","Sunday", movies.get(0), rooms.get(2));
        demoCinema.addSchedule("2022-03-27", "22:30","Sunday", movies.get(0), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "19:10","Sunday", movies.get(1), rooms.get(0));
        demoCinema.addSchedule("2022-03-27", "16:00","Sunday", movies.get(1), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "21:40","Sunday", movies.get(1), rooms.get(2));
        demoCinema.addSchedule("2022-03-27", "15:00","Sunday", movies.get(2), rooms.get(0));
        demoCinema.addSchedule("2022-03-27", "19:00","Sunday", movies.get(2), rooms.get(1));
        demoCinema.addSchedule("2022-03-27", "12:00","Sunday", movies.get(3), rooms.get(1));
        demoCinema.addSchedule("2022-03-27", "14:20","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "18:40","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "12:30","Sunday", movies.get(3), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "22:30","Sunday", movies.get(4), rooms.get(1));
        demoCinema.addSchedule("2022-03-27", "19:30","Sunday", movies.get(4), rooms.get(2));
        demoCinema.addSchedule("2022-03-27", "19:00","Sunday", movies.get(5), rooms.get(3));
        demoCinema.addSchedule("2022-03-27", "22:30","Sunday", movies.get(5), rooms.get(0));
        demoCinema.addSchedule("2022-03-27", "12:30","Sunday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-27", "13:20","Sunday", movies.get(6), rooms.get(2));
        demoCinema.addSchedule("2022-03-27", "14:30","Sunday", movies.get(6), rooms.get(1));
        demoCinema.addSchedule("2022-03-27", "16:30","Sunday", movies.get(6), rooms.get(0));

    }
    public Cinema getDemoCinema(){

        return demoCinema;
    }
}
