import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CinemaMenu {
    Scanner scan = new Scanner(System.in);
    boolean exit = false;
    //boolean exitSubmenu = false;
    int option;

    Cinema cinema;
    String name;
    String country;
    String city;
    String address;
    String phoneNumber;
    String emptyFill;
    boolean isCinemaCreated = false;
    int idRoom;
    int maxCapacity;
    int i;
    String movieName;
    String category;
    String classification;
    String languages;
    String type;
    int lengthMinutes;
    String premierDate;

    String date;
    String hour;
    String day;
    List<Movie> movies = new ArrayList <Movie>();
    Movie selectedMovie;
    List<CinemaRoom> rooms = new ArrayList <CinemaRoom>();
    CinemaRoom selectedCinemaRoom;
    List<Schedule> schedules =new ArrayList<Schedule>();
    Schedule selectedSchedule;
    Demo demo;

    public void printCinemaOptions(){
        // cargar datos de Demo.
        demo = new Demo();


        for (Movie m: movies) {
            System.out.println("Movie: " + m.getName());

        }

        for (CinemaRoom r: rooms) {
            System.out.println("Room: " + r.getIdRoom());
        }

        while (!exit){

            System.out.println("****************** Cinema Menu ****************** ");
            // System.out.println("                <Select an Option> : ");
            if (isCinemaCreated){
                System.out.println("   <1> Create Cinema  <DONE>" );
            }else{
                System.out.println("   <1> Create Cinema");
            }

            System.out.println("   <2> Configure Cinema");
            System.out.println("   <3> Edit Cinema");
            System.out.println("   <4> Delete Cinema");
            System.out.println("   <5> View Cinema Options");
            System.out.println("   <6> View Today Cinema Billboard");
            System.out.println("   <7> View Weekly Cinema Billboard");
            System.out.println("   <8> Exit");
            System.out.println("*************************************************\n ");

            try {System.out.print("   <Select an Option> : ");
                option = scan.nextInt();
                switch (option){
                    case 1:
                        name = "";
                        country = "";
                        city = "";
                        address = "";
                        phoneNumber = "";
                        System.out.println("\n****************** Adding Cinema ******************");
                        emptyFill = scan.nextLine();
                        while (name.isBlank()){
                            System.out.print("\ntype the Cinema's Name:  ");
                            name = scan.nextLine();
                        }
                        while (country.isBlank()){
                            System.out.print("\ntype the Cinema's Country:  ");
                            country = scan.nextLine();
                        }
                        while (city.isBlank()){
                            System.out.print("\ntype the Cinema's City:  ");
                            city = scan.nextLine();
                        }
                        while (address.isBlank()){
                            System.out.print("\ntype the Cinema's Address:  ");
                            address = scan.nextLine();
                        }
                        while (phoneNumber.isBlank()){
                            System.out.print("\ntype the Cinema's Phone Number:  ");
                            phoneNumber = scan.nextLine();
                        }
                        cinema = new Cinema(name, country, city, address, phoneNumber);
                        cinema.setMovies(demo.getDemoCinema().getMovies());
                        cinema.setRooms(demo.getDemoCinema().getAllRooms());
                        cinema.setSchedules(schedules = demo.getDemoCinema().getSchedules());
                        isCinemaCreated = true;
                        break;

                    case 2:
                        if(isCinemaCreated){
                            int idRoom = 0;
                            int maxCapacity = 0;
                            movieName = "";
                            category = "";
                            classification = "";
                            languages = "";
                            type = "";
                            lengthMinutes = 0;
                            premierDate = "";
                            int flag = 1;
                            emptyFill = scan.nextLine();
                            System.out.println("getting option <2>\n");
                            while(flag == 1){
                                System.out.println("\n****************** Configuring Cinema ******************");
                                System.out.println("\n***************** Adding Cinema Rooms ******************");
                                System.out.print("\ntype the Cinema's Room ID_Number:  ");
                                idRoom = scan.nextInt();
                                System.out.print("\ntype the Cinema's Max Capacity:  ");
                                maxCapacity = scan.nextInt();
                                emptyFill = scan.nextLine();
                                System.out.println("\n Do You want to add a new Cinema Room? \n <1> yes - <2> No");
                                flag = scan.nextInt();

                                cinema.addRoom(idRoom, maxCapacity);
                            }
                            flag = 1;

                            while (flag == 1){
                                emptyFill = scan.nextLine();
                                System.out.println("\n****************** Configuring Cinema ******************");
                                System.out.println("\n***************** Adding Cinema Movies ******************");
                                //(String name, String category, String classification, String languages, String type, int lengthMinutes,String premierDate)
                                System.out.print("\ntype the Movie's Name:  ");
                                movieName = scan.nextLine();
                                System.out.print("\ntype the Movie's Category:  ");
                                category = scan.nextLine();
                                System.out.print("\ntype the Movie's Classification:  ");
                                classification = scan.nextLine();
                                System.out.print("\ntype the Movie's Language:  ");
                                languages = scan.nextLine();
                                System.out.print("\ntype the Movie's Type (2D-3D):  ");
                                type = scan.nextLine();
                                System.out.print("\ntype the Movie's Time:  ");
                                lengthMinutes = scan.nextInt();
                                emptyFill = scan.nextLine();
                                System.out.print("\ntype the Movie's Premier Date (YYYY-MM-DD):  ");
                                premierDate = scan.nextLine();
                                System.out.println("\n Do You want to add a new Movie? \n <1> yes - <2> No");
                                flag = scan.nextInt();

                                cinema.addMovie(movieName, category, classification, languages, type, lengthMinutes, premierDate);
                            }

                            flag = 1;
                            while (flag == 1){
                                emptyFill = scan.nextLine();
                                System.out.println("\n****************** Configuring Cinema ******************");
                                System.out.println("\n***************** Adding Movie's Schedule to Rooms ******************");
                                //(String date, String hour, String day, Movie movie, CinemaRoom room)

                                System.out.print("\nSelect a Movie:  ");
                                movies = cinema.getMovies();
                                for (Movie mov: movies) {
                                    i = (int) movies.indexOf(mov) + 1;
                                    System.out.println("\n   <" + i +"> " + mov.getName() + " - " + mov.getLanguages() + " - " + mov.getType());
                                }
                                i = scan.nextInt();

                                if(i >0 && i<=movies.size()){
                                    selectedMovie = movies.get(i-1);
                                    emptyFill = scan.nextLine();
                                    i = 0;
                                    System.out.print("\nSelect a Room:  ");
                                    rooms = cinema.getAllRooms();
                                    for (CinemaRoom ro: rooms) {
                                        i = rooms.indexOf(ro) + 1;
                                        System.out.println("\n   <" + i +"> Room ID : " + ro.getIdRoom() + " - " + ro.getMaxCapacity());
                                    }
                                    i = scan.nextInt();
                                    if(i >0 && i<= rooms.size()){
                                        selectedCinemaRoom = rooms.get(i-1);
                                        emptyFill = scan.nextLine();
                                        System.out.print("\ntype the Schedule's Day:  ");
                                        day = scan.nextLine();
                                        System.out.print("\ntype the Schedule's Date (YYYY-MM-DD):  ");
                                        date = scan.nextLine();
                                        System.out.print("\ntype the Schedule's Hour (hh:mm):  ");
                                        hour = scan.nextLine();

                                        cinema.addSchedule(date, hour, day, selectedMovie, selectedCinemaRoom);
                                        System.out.println("\n Do You want to add a new movie Schedule to some Room? \n <1> yes - <2> No");
                                        flag = scan.nextInt();
                                    }
                                }
                            }
                        }else{
                            System.out.print("\nPlease firstly Add a Cinema to access another Option\n");
                        }
                        break;
                    case 3:
                        if(isCinemaCreated){
                            emptyFill = scan.nextLine();
                            System.out.print("\n****************** Editing Cinema ******************");
                            System.out.print("\nPlease type new Values for: <empty for maintain them>");
                            System.out.print("\nCinema's Name: " + cinema.getName() + " new Name is: ");
                            name = scan.nextLine();
                            if (!name.isBlank()){
                                cinema.setName(name);
                            }
                            System.out.print("\nCinema's Country: " + cinema.getCountry() + " new Country is: ");
                            country = scan.nextLine();
                            if (!country.isBlank()){
                                cinema.setCountry(country);
                            }
                            System.out.print("\nCinema's City: " + cinema.getCity() + " new City is: ");
                            city = scan.nextLine();
                            if (!city.isBlank()){
                                cinema.setCity(city);
                            }
                            System.out.print("\nCinema's Address: " + cinema.getAddress() + " new Address is: ");
                            address = scan.nextLine();
                            if (!address.isBlank()){
                                cinema.setAddress(address);
                            }
                            System.out.print("\nCinema's Phone Number: " + cinema.getPhoneNumber() + " new Phone Number is: ");
                            phoneNumber = scan.nextLine();
                            if (!phoneNumber.isBlank()){
                                cinema.setPhoneNumber(phoneNumber);
                            }
                            System.out.println("updated to: " + cinema.getName() + " " + cinema.getCountry() + " " + cinema.getCity() + " " + cinema.getAddress() + " " + cinema.getPhoneNumber());
                        }else{
                            System.out.print("\nPlease firstly Add a Cinema to access another Option\n");
                        }
                        break;
                    case 4:
                        System.out.println("getting option <4>\n");
                        break;
                    case 5: // VIEW CINEMA OPTIONS
                        if(isCinemaCreated) {
                            System.out.print("\n****************** Cinema Options ******************");
                            System.out.print("\n <1> Add new Room");
                            System.out.print("\n <2> Edit a Room");
                            System.out.print("\n <3> Delete a Room");
                            System.out.print("\n <4> Add new Movie");
                            System.out.print("\n <5> Edit a Movie");
                            System.out.print("\n <6> Delete a Movie");
                            System.out.print("\n <7> Add new Schedule");
                            System.out.print("\n <8> Edit a Schedule");
                            System.out.print("\n <9> Delete a Schedule");
                            System.out.println("\n***************************************************\n ");
                            emptyFill = scan.nextLine();
                            option = scan.nextInt();

                            switch (option){
                                case 1: // ADD Room
                                    emptyFill = scan.nextLine();
                                    int flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Adding Cinema Rooms ******************");
                                        System.out.print("\ntype the Cinema's Room ID_Number:  ");
                                        idRoom = scan.nextInt();
                                        System.out.print("\ntype the Cinema's Max Capacity:  ");
                                        maxCapacity = scan.nextInt();
                                        System.out.println("\n Do You want to Add a new Cinema Room? \n <1> yes - <2> No");
                                        flag = scan.nextInt();
                                        cinema.addRoom(idRoom, maxCapacity);
                                    }

                                    break;
                                case 2: // Edit Room
                                    emptyFill = scan.nextLine();
                                    flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Editing Cinema Rooms ******************");
                                        i = 0;
                                        System.out.print("\nSelect a Room:  ");
                                        rooms = cinema.getAllRooms();
                                        for (CinemaRoom ro: rooms) {
                                            i = rooms.indexOf(ro) + 1;
                                            System.out.println("\n   <" + i +"> Room ID : " + ro.getIdRoom() + " - " + ro.getMaxCapacity());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<= rooms.size()){
                                            selectedCinemaRoom = rooms.get(i-1);
                                            System.out.print("\ntype the New Cinema's Room ID_Number:  ");
                                            idRoom = scan.nextInt();
                                            System.out.print("\ntype the New Cinema's Max Capacity:  ");
                                            maxCapacity = scan.nextInt();
                                            cinema.editRoom(selectedCinemaRoom,idRoom, maxCapacity);
                                            System.out.println("\n Do You want to Edit a new Cinema Room? \n <1> yes - <2> No");
                                            flag = scan.nextInt();
                                        }
                                    }
                                    break;
                                case 3: // Delete Room
                                    emptyFill = scan.nextLine();
                                    flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Deleting Cinema Room ******************");
                                        i = 0;
                                        System.out.print("\nSelect a Room to be deleted:  ");
                                        rooms = cinema.getAllRooms();
                                        for (CinemaRoom ro: rooms) {
                                            i = rooms.indexOf(ro) + 1;
                                            System.out.println("\n   <" + i +"> Room ID : " + ro.getIdRoom() + " - " + ro.getMaxCapacity());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<= rooms.size()){
                                            selectedCinemaRoom = rooms.get(i-1);
                                            cinema.deleteRoom(selectedCinemaRoom.getIdRoom());
                                            System.out.println("\n Do You want to Delete a new Cinema Room? \n <1> yes - <2> No");
                                            flag = scan.nextInt();
                                        }
                                    }
                                    break;
                                case 4: // Add Movie
                                    emptyFill = scan.nextLine();
                                    flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Adding Movie ******************");
                                        System.out.print("\ntype the Movie's Name:  ");
                                        movieName = scan.nextLine();
                                        System.out.print("\ntype the Movie's Category:  ");
                                        category = scan.nextLine();
                                        System.out.print("\ntype the Movie's Classification:  ");
                                        classification = scan.nextLine();
                                        System.out.print("\ntype the Movie's Language:  ");
                                        languages = scan.nextLine();
                                        System.out.print("\ntype the Movie's Type (2D-3D):  ");
                                        type = scan.nextLine();
                                        System.out.print("\ntype the Movie's Time:  ");
                                        lengthMinutes = scan.nextInt();
                                        emptyFill = scan.nextLine();
                                        System.out.print("\ntype the Movie's Premier Date (YYYY-MM-DD):  ");
                                        premierDate = scan.nextLine();
                                        System.out.println("\n Do You want to add a new Movie? \n <1> yes - <2> No");
                                        flag = scan.nextInt();
                                        cinema.addMovie(movieName, category, classification, languages, type, lengthMinutes, premierDate);
                                    }
                                    break;
                                case 5: // Edit Movie
                                    emptyFill = scan.nextLine();
                                    flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Editing Movie ******************");
                                        i = 0;
                                        System.out.print("\nSelect a Movie:  ");
                                        movies = cinema.getMovies();
                                        for (Movie mo: movies) {
                                            i = movies.indexOf(mo) + 1;
                                            System.out.println("\n   <" + i +"> Movie : " + mo.getName() + " type: " + mo.getType() + " Language: " + mo.getLanguages());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<= movies.size()){
                                            selectedMovie = movies.get(i-1);
                                            emptyFill = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Name:  ");
                                            movieName = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Category:  ");
                                            category = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Classification:  ");
                                            classification = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Language:  ");
                                            languages = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Type (2D-3D):  ");
                                            type = scan.nextLine();
                                            System.out.print("\ntype the New Movie's Time:  ");
                                            lengthMinutes = scan.nextInt();
                                            emptyFill = scan.nextLine();
                                            System.out.print("\ntype the Movie's New Premier Date (YYYY-MM-DD):  ");
                                            premierDate = scan.nextLine();
                                            System.out.println("\n Do You want to Edit another Movie? \n <1> yes - <2> No");
                                            flag = scan.nextInt();
                                            cinema.editMovie(selectedMovie, movieName, category, classification, languages, type, lengthMinutes, premierDate);
                                        }
                                    }
                                    break;
                                case 6: // Delete Movie
                                    emptyFill = scan.nextLine();
                                    flag = 1;
                                    while(flag == 1){
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n***************** Deleting Movie ******************");
                                        i = 0;
                                        System.out.print("\nSelect a Movie:  ");
                                        movies = cinema.getMovies();
                                        for (Movie mo: movies) {
                                            i = movies.indexOf(mo) + 1;
                                            System.out.println("\n   <" + i +"> Movie : " + mo.getName() + " type: " + mo.getType() + " Language: " + mo.getLanguages());
                                        }
                                        i = scan.nextInt();

                                        if(i >0 && i <= movies.size()){
                                            selectedMovie = movies.get(i-1);
                                            emptyFill = scan.nextLine();
                                            cinema.deleteMovie(selectedMovie.getName(), selectedMovie.getLanguages(), selectedMovie.getType());
                                            System.out.println("\n Do You want to Delete a Movie? \n <1> yes - <2> No");
                                            flag = scan.nextInt();
                                        }


                                    }
                                    break;
                                case 7: // Add Schedule
                                    flag = 1;
                                    while (flag == 1){
                                        emptyFill = scan.nextLine();
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n****** Adding Movie's Schedule to Rooms ************");
                                        //(String date, String hour, String day, Movie movie, CinemaRoom room)

                                        System.out.print("\nSelect a Movie:  ");
                                        movies = cinema.getMovies();
                                        for (Movie mov: movies) {
                                            i = (int) movies.indexOf(mov) + 1;
                                            System.out.println("\n   <" + i +"> " + mov.getName() + " - " + mov.getLanguages() + " - " + mov.getType());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<= movies.size()){
                                            selectedMovie = movies.get(i-1);
                                            emptyFill = scan.nextLine();
                                            i = 0;
                                            System.out.print("\nSelect a Room:  ");
                                            rooms = cinema.getAllRooms();
                                            for (CinemaRoom ro: rooms) {
                                                i = rooms.indexOf(ro) + 1;
                                                System.out.println("\n   <" + i +"> Room ID : " + ro.getIdRoom() + " - " + ro.getMaxCapacity());
                                            }
                                            i = scan.nextInt();

                                            if(i>0 && i<=rooms.size()){
                                                selectedCinemaRoom = rooms.get(i-1);
                                                emptyFill = scan.nextLine();
                                                System.out.print("\ntype the Schedule's Day:  ");
                                                day = scan.nextLine();
                                                System.out.print("\ntype the Schedule's Date (YYYY-MM-DD):  ");
                                                date = scan.nextLine();
                                                System.out.print("\ntype the Schedule's Hour (hh:mm):  ");
                                                hour = scan.nextLine();

                                                cinema.addSchedule(date, hour, day, selectedMovie, selectedCinemaRoom);
                                                System.out.println("\n Do You want to add a new movie Schedule to some Room? \n <1> yes - <2> No");
                                                flag = scan.nextInt();
                                            }
                                        }
                                    }
                                    break;
                                case 8: // Edit Schedule
                                    flag = 1;
                                    while (flag == 1){
                                        emptyFill = scan.nextLine();
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n************** Editing Movie's Schedule ************");
                                        //(String date, String hour, String day, Movie movie, CinemaRoom room)
                                        schedules = cinema.getSchedules();
                                        System.out.print("\nSelect an Schedule:  ");
                                        for (Schedule sc: schedules) {
                                            i = (int) schedules.indexOf(sc) + 1;
                                            //String date, String hour, String day, Movie movie, CinemaRoom room
                                            System.out.println("\n   <" + i +">  Time: " + sc.getHour() + " Movie: " + sc.getMovie().getName() + " Room: " + sc.getRoom().getIdRoom());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<=schedules.size()){
                                            selectedSchedule = schedules.get(i-1);
                                            emptyFill = scan.nextLine();
                                            System.out.print("\nSelect a Movie:  ");
                                            movies = cinema.getMovies();
                                            for (Movie mov: movies) {
                                                i = (int) movies.indexOf(mov) + 1;
                                                System.out.println("\n   <" + i +"> " + mov.getName() + " - " + mov.getLanguages() + " - " + mov.getType());
                                            }
                                            i = scan.nextInt();
                                            if(i>0 && i<=movies.size()){
                                                //parametro Movie para addSchedule
                                                selectedMovie = movies.get(i-1);
                                                emptyFill = scan.nextLine();
                                                i = 0;
                                                System.out.print("\nSelect a Room:  ");
                                                rooms = cinema.getAllRooms();
                                                for (CinemaRoom ro: rooms) {
                                                    i = rooms.indexOf(ro) + 1;
                                                    System.out.println("\n   <" + i +"> Room ID : " + ro.getIdRoom() + " - " + ro.getMaxCapacity());
                                                }
                                                i = scan.nextInt();

                                                if(i>0 && i<=rooms.size()){
                                                    selectedCinemaRoom = rooms.get(i-1);
                                                    emptyFill = scan.nextLine();
                                                    System.out.print("\ntype the Schedule's Day:  ");
                                                    day = scan.nextLine();
                                                    System.out.print("\ntype the Schedule's Date (YYYY-MM-DD):  ");
                                                    date = scan.nextLine();
                                                    System.out.print("\ntype the Schedule's Hour (hh:mm):  ");
                                                    hour = scan.nextLine();
                                                    cinema.editSchedule(selectedSchedule, date, hour, day, selectedMovie, selectedCinemaRoom);
                                                    //cinema.addSchedule(date, hour, day, selectedMovie, selectedCinemaRoom);
                                                    System.out.println("\n Do You want to Edit a movie Schedule to some Room? \n <1> yes - <2> No");
                                                    flag = scan.nextInt();
                                                }

                                            }

                                        }

                                    }
                                    break;
                                case 9: // Delete Schedule
                                    flag = 1;
                                    while (flag == 1){
                                        emptyFill = scan.nextLine();
                                        System.out.println("\n****************** Cinema Options ******************");
                                        System.out.println("\n************** Deleting Movie's Schedule ************");
                                        schedules = cinema.getSchedules();
                                        System.out.print("\nSelect an Schedule:  ");
                                        for (Schedule sc: schedules) {
                                            i = (int) schedules.indexOf(sc) + 1;
                                            System.out.println("\n   <" + i +">  Time: " + sc.getHour() + " Movie: " + sc.getMovie().getName() + " Room: " + sc.getRoom().getIdRoom());
                                        }
                                        i = scan.nextInt();
                                        if(i>0 && i<= schedules.size()){
                                            selectedSchedule = schedules.get(i-1);
                                            emptyFill = scan.nextLine();
                                            cinema.deleteSchedule(selectedSchedule.getDate(), selectedSchedule.getHour(),selectedSchedule.getDay(), selectedSchedule.getMovie(), selectedSchedule.getRoom());
                                            System.out.println("\n Do You want to Delete another movie Schedule? \n <1> yes - <2> No");
                                            flag = scan.nextInt();
                                        }

                                    }
                                    break;
                                default:
                                    System.out.println("Please type an option between 1 and 9");
                                    break;
                            }

                        }else {
                            System.out.print("\nPlease firstly Add a Cinema to access another Option\n");
                        }

                        break;
                    case 6: // Today Billboard
                        System.out.println("\n****************** Welcome to " + cinema.getName() + " ******************");
                        System.out.println("\n************** Today Billboard "+ cinema.getCity() + " ************");
                        cinema.printScheduleToday();
                        break;
                    case 7: // Weekly Billboard
                        System.out.println("\n****************** Welcome to " + cinema.getName() + " ******************");
                        System.out.println("\n************** Weekly Billboard "+ cinema.getCity() + " ************");
                        cinema.printScheduleWeek();
                        break;
                    case 8:
                        System.out.println("getting option <Exit>\n");
                        exit = true;
                        break;
                    default:
                        System.out.println("Please type an option between 1 and 6");
                }

            }catch(InputMismatchException e){
                System.out.println("\n Please type a number as valid input");
                scan.next();
            }

        }


    }

}
