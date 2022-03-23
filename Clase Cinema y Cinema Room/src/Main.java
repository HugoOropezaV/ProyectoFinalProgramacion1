import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CinemaRoom> rooms = new ArrayList<CinemaRoom>();
        CinemaRoom room1 = new CinemaRoom(1,50);
        CinemaRoom room2 = new CinemaRoom(2,20);
        CinemaRoom room3 = new CinemaRoom(3,35);
        CinemaRoom room4 = new CinemaRoom(4,20);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        List<Movie> movies = new ArrayList<Movie>();
        Movie movie1 = new Movie("¡QUE DESPADRE!", "Comedy", "All Public", "Spanish/English","2D", 110, "2022-03-14");
        Movie movie2 = new Movie("AMBULANCIA", "Action/Suspense", "14+", "Spanish/English","2D", 150, "2022-03-12");
        Movie movie3 = new Movie("EL GRAN MOVIMIENTO", "Drama", "All Public", "Spanish","2D", 95, "2022-03-15");
        Movie movie4 = new Movie("KARNAWAL", "Drama", "All Public", "Spanish","2D", 110, "2022-3-2");
        Movie movie5 = new Movie("SPIDERMAN", "Fantastic/Action", "All Public", "English","3D", 170, "2022-03-2");
        Movie movie6 = new Movie("SPIDERMAN", "Fantastic/Action", "All Public", "English","2D", 170, "2022-03-2");
        Movie movie7 = new Movie("THE BATMAN", "Action/Suspense", "14+", "Spanish/English","2D", 190, "2022-03-3");


        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        // Add Schedule
        List<Schedule> schedules = new ArrayList<Schedule>();
        Schedule schedule1 = new Schedule("2022-03-21", "12:30","Monday", movie7, room1);
        Schedule schedule2 = new Schedule("2022-03-21", "13:20","Monday", movie7, room2);
        Schedule schedule3 = new Schedule("2022-03-21", "14:30","Monday", movie7, room3);
        Schedule schedule4 = new Schedule("2022-03-21", "16:30","Monday", movie7, room4);
        Schedule schedule5 = new Schedule("2022-03-21", "16:30","Monday", movie1, room1);
        Schedule schedule6 = new Schedule("2022-03-21", "16:10","Monday", movie1, room2);
        Schedule schedule7 = new Schedule("2022-03-21", "12:30","Monday", movie1, room3);
        Schedule schedule8 = new Schedule("2022-03-21", "19:30","Monday", movie2, room4);
        Schedule schedule9 = new Schedule("2022-03-21", "21:30","Monday", movie3, room1);
        Schedule schedule10 = new Schedule("2022-03-21", "12:30","Monday", movie4, room4);
        Schedule schedule11 = new Schedule("2022-03-22", "12:30","Tuesday", movie4, room4);
        Schedule schedule12 = new Schedule("2022-03-22", "12:30","Tuesday", movie7, room1);
        Schedule schedule13 = new Schedule("2022-03-22", "13:20","Tuesday", movie7, room2);
        Schedule schedule14 = new Schedule("2022-03-22", "14:30","Tuesday", movie7, room3);
        Schedule schedule15 = new Schedule("2022-03-22", "16:30","Tuesday", movie7, room4);
        Schedule schedule16 = new Schedule("2022-03-23", "12:30","Wednesday", movie7, room1);
        Schedule schedule17 = new Schedule("2022-03-23", "13:20","Wednesday", movie7, room2);
        Schedule schedule18 = new Schedule("2022-03-23", "14:30","Wednesday", movie7, room3);
        Schedule schedule19 = new Schedule("2022-03-23", "16:30","Wednesday", movie7, room4);

        schedules.add(schedule1);
        schedules.add(schedule2);
        schedules.add(schedule3);
        schedules.add(schedule4);
        schedules.add(schedule5);
        schedules.add(schedule6);
        schedules.add(schedule7);
        schedules.add(schedule8);
        schedules.add(schedule9);
        schedules.add(schedule10);
        schedules.add(schedule11);
        schedules.add(schedule12);
        schedules.add(schedule13);
        schedules.add(schedule14);
        schedules.add(schedule15);
        schedules.add(schedule16);
        schedules.add(schedule17);
        schedules.add(schedule18);
        schedules.add(schedule19);
        //schedules.add(schedule10);

       //mostrar pelis y horarios por semana.
        String Mo;
        String Tu;
        String We;
        String Th;
        String Fr;
        String Sa;
        String Su;
        LocalDate mDate = LocalDate.now();
        Su = String.valueOf(mDate.with(DayOfWeek.SUNDAY));
        Mo = String.valueOf(mDate.with(DayOfWeek.MONDAY));
        Tu = String.valueOf(mDate.with(DayOfWeek.TUESDAY));
        We = String.valueOf(mDate.with(DayOfWeek.WEDNESDAY));
        Th = String.valueOf(mDate.with(DayOfWeek.THURSDAY));
        Fr = String.valueOf(mDate.with(DayOfWeek.FRIDAY));
        Sa = String.valueOf(mDate.with(DayOfWeek.SATURDAY));

        boolean printW;
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

                   // scheduleToPrint += schedule.getHour() + " ";
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


        //mostrar/imprimir pelis y horarios de hoy
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
}