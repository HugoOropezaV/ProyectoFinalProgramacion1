package Users;

import Cinema.CinemaMenu;
import Cinema.*;
import ChallengesScan.*;

import java.util.*;

public class Page {

    LoginPage loginPage;
    ArrayList<Customer> users;
    CinemaMenu cinemaMenu;
    Admin admin;
    Challenge[] challenges;

    public Page(){
        loginPage = new LoginPage();
        users = IPersonManager.users;
        cinemaMenu = new CinemaMenu();
        admin = new Admin("admin", "admin@admin.com", "77777766", new Account("root"));
        loginPage.addAccount(admin.getAccount().getId(),admin.getAccount().getPassword());
        System.out.println(admin.getAccount().toStirng());
        loginPage.createAccount("Isaias", "is@email.com", "67606890", "pocoyo", 19);
        loginPage.createAccount("Deidamia", "is@email.com", "67606890", "pocoyo", 19);
        challenges = new Challenge[300];
    }

    public void getLoginFunctions(){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Welcome to the login page :D\n==========================\nWhat do you want to do?");
            System.out.println();
            System.out.println("Pick an option: \n1. Login to you account\n2. Create an account\n3. Exit");
            int option = input.nextInt();
            if(option > 0 && option < 4){
                switch(option){
                    case 1:
                        int id = 0;
                        String password;
                        boolean res = true;
                        while(res){
                            try{
                                System.out.print("Input your private ID: ");
                                String empty = input.nextLine();
                                id = input.nextInt() ;
                                res = false;
                            }catch (InputMismatchException e){
                                System.out.println("Ingrese los caracteres validos. Solo numeros para ID ");
                                res = true;
                            }
                        }

                        System.out.print("\nProvide your private password: ");
                        password = input.next();
                        System.out.println("Validating information... ");
                        System.out.println("login: " + loginPage.login(id, password));

                        while(!loginPage.login(id, password)){
                            System.out.println("Invalid password. Try again");
                            System.out.print("Input your private ID: ");
                            id = input.nextInt();
                            System.out.print("\nProvide your private password: ");
                            password = input.next();
                        }
                        System.out.println("\n==========================\n");
                        if(id == 1000){
                            getAdminFunctions();
                        }else{
                            getUserFunctions(id);
                        }
                        break;

                    case 2:

                        System.out.println("Input your name: ");
                        String name = input.next();

                        System.out.println("Email: ");
                        String email = input.next();

                        while(loginPage.isEmailRepeated(email) || !Utils.emailValidator(email)){
                            if(loginPage.isEmailRepeated(email)){
                                System.out.println("There is an account associated to this email. Provide other email");
                                System.out.println("Email: ");
                                email = input.nextLine();
                            }
                            if(!Utils.emailValidator(email)){
                                System.out.println("Input a invalid email: xxx@email.com ");
                                System.out.println("Email: ");
                                email = input.nextLine();
                            }
                        }

                        System.out.println("Phone: ");
                        String phone = input.next();
                        while(loginPage.isPhoneRepeated(phone) || !Utils.isValidPhone(phone)){
                            if(loginPage.isPhoneRepeated(phone)){
                                System.out.println("There is a phone associated to another account, please provide other phone number ");
                                System.out.println("Phone: ");
                                phone = input.next();
                            }
                            if(!Utils.isValidPhone(phone)){
                                System.out.println("Please provide a valid phone number: ");
                                System.out.println("Phone: ");
                                phone = input.next();
                            }
                        }

                        System.out.println("Secure password: ");
                        String newPassword = input.next();
                        while(!Utils.isValidPassword(newPassword)){
                            System.out.println("Your password is insecure, please provide a secure password");
                            newPassword = input.next();
                        }

                        System.out.print("Age: ");
                        int age = input.nextInt();
                        while(!(age < 100 && age > 12)){
                            System.out.println("Provide a valid age: ");
                            age = input.nextInt();
                        }
                        this.users.add(loginPage.createAccount(name,email,phone, newPassword, age));
                        System.out.println("\n==========================\n");
                        break;
                    case 3:

                        run = false;
                        System.out.println("See you later :) ");
                        System.out.println("\n==========================\n");
                        break;
                    default:
                        break;
                }
            }
        }while(run);
    }

    public void getAdminFunctions() {
        System.out.println("Welcome superuser. What would you like to do?");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Pick an option: \n1. User management functions\n2. Cinema Management Function\n3. Ranking Management Functions\n4. Log out");
            int option = input.nextInt();
            if(option > 0 && option < 5){
                switch(option){
                    case 1:
                        admin.getUserAdminFunctions();
                        break;
                    case 2:
                        getCinemaAdminFunctions();
                        break;
                    case 3:
                        getRankingAdminFunctions();
                        break;
                    case 4:
                        run = false;
                        System.out.println("See you later SuperUser :3");
                        System.out.println("\n==========================\n");
                        break;
                }
            }
        }while(run);
    }

    private void getCinemaAdminFunctions()  {
        System.out.println("Welcome Super user");
        cinemaMenu.printCinemaOptions();
    }

    private void getRankingAdminFunctions() {
        System.out.println("Welcome Super user");
        addsScan.challengeControlAd();
        //crar chhalenge u ese clonarlo a todos
    }

    private void getUserFunctions(int id){
        getFunctions(cinemaMenu.getCinema(), id, challenges, loginPage.getPersonByID(id));
    }
    /*
    opcion
     */
    public void getFunctions(Cinema cinema, int id, Challenge[] challenges, Customer customer){
        System.out.println("Welcome " + loginPage.getPersonByID(id).getName()+ " What would you like to do?");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        if(customer.isBlocked){
            System.out.println("You are blocked");
        }else{
            do{

                System.out.println("Pick an option: \n1. Watch Billboard\n2. Make a booking\n3. Challenge control us\n4. Watch a movie" +
                        "\n5. Put comment\n6. Rank a movie\n7. show tickets\n8. Shows comments\n9. Log out ");
                int option = input.nextInt();
                if(option > 0 && option < 10){
                    switch(option){
                        case 1:
                            System.out.println("Billboard");
                            cinema.printAllMovies();
                            break;
                        case 2:
                            System.out.println("Making a booking for... select a movie");
                            if(cinema.movies.isEmpty()){
                                System.out.println("There no movies by the way there are no Schedule prgrammed");
                            }else{
                                System.out.println("Select a movie...");
                                System.out.println(cinema.getAllMovies(cinema.getMovies()));
                                int optionMovie = input.nextInt();
                                while(!(optionMovie > 0 && optionMovie < cinema.movies.size())){
                                    System.out.println("Your input was invalid, please try again...");
                                    System.out.println("Select a movie...");
                                    System.out.println(cinema.getAllMovies(cinema.getMovies()));
                                    optionMovie = input.nextInt();
                                }
                                System.out.println("Select a function (Schedule)");
                                if(cinema.getAllShowsByMovie(cinema.movies.get(optionMovie-1), cinema.getSchedules()).isEmpty()){
                                    System.out.println("Ohhh! There are no functions available in this show");
                                }else{
                                    List<Schedule> shows = cinema.getAllShowsByMovie(cinema.movies.get(optionMovie-1), cinema.getSchedules());
                                    System.out.println(cinema.getAllShows(shows));
                                    int optionShow = input.nextInt();
                                    System.out.println("How many seats do you want ? You can reserve 10 seats max a as user");
                                    int seats = input.nextInt();
                                    while(!(seats > 0 && seats < 10)){
                                        System.out.println("You input a incorrect number of seats, try again");
                                        seats = input.nextInt();
                                    }
                                    while(true) {
                                        if (cinema.makeBooking(shows.get(optionShow - 1), seats)) {
                                            customer.tickets.add(cinema.getTicket(shows.get(optionShow - 1)));
                                            customer.bookings.add(shows.get(optionShow-1));
                                            break;
                                        } else {
                                            System.out.println("The show doesnt have the amount you want to reseerve, try again");
                                            System.out.println("How many seats do you want ? You can reserve 10 seats max a as user");
                                            seats = input.nextInt();
                                            while(!(seats > 0 && seats < 10)){
                                                System.out.println("You input a incorrect number of seats, try again");
                                                seats = input.nextInt();
                                            }

                                        }
                                    }

                                }
                            }
                            break;
                        case 3:

                            addsScan.challengeControlus();
                            /*
                            System.out.println("Display total challenges");
                            System.out.println(addsScan.getAllChallenge(challenges));
                            System.out.println("Select an option for view more information");
                            int challengeOption = input.nextInt();
                            while ((challengeOption > 0 && challengeOption <= addsScan.challengeCounter)){
                                System.out.println("Please provide an input between "+ 1+ " and " + addsScan.challengeCounter);
                                challengeOption = input.nextInt();
                            }
                            System.out.println(challenges[challengeOption].toString());*/
                            break;
                        case 4:
                            System.out.println("what movie do you want to watch");
                            System.out.println(customer.getPerWatchMovies());
                            if(customer.getPerWatchMovies()== null){
                                System.out.println("you dont have tickets, please make a booking first");
                            }else{
                                System.out.println("Select an option to watch: \n" + customer.getPerWatchMovies());
                                int perWatch = input.nextInt();
                                while (!(perWatch > 0 && perWatch <= customer.bookings.size())){
                                    System.out.println("You've selected an invalid option, please try again");
                                    perWatch = input.nextInt();
                                }
                                customer.totalMovies += 1;
                                customer.watchMovie(customer.bookings.get(perWatch-1).getMovie());
                                System.out.println("COntratulation... You've watched a " + customer.bookings.get(perWatch-1).getMovie().getName());
                            }
                            break;
                        case 5:
                            System.out.println("What movie do you want to comment");
                            System.out.println("You just can comment watched movies...");
                            if(customer.getWatchedMovies() == null ){
                                System.out.println("You dindn't watch a movie yet");
                            }else{
                                System.out.println("Select an option: \n" + customer.getWatchedMovies());
                                int perComment = input.nextInt();
                                while (!(perComment > 0 && perComment <= customer.watchedMovies.size())){
                                    System.out.println("You've selected an invalid option, please try again");
                                    perComment = input.nextInt();
                                }
                                System.out.println("You ve selected " + customer.watchedMovies.get(perComment-1).getName());
                                System.out.println("Put you comment ");
                                String comment = input.nextLine();
                                customer.createComments(comment, customer.watchedMovies.get(perComment-1));
                            }

                            break;
                        case 6:
                            System.out.println("What movie do you want to rank");
                            System.out.println("You just can rank watched movies...");
                            if(customer.getWatchedMovies() == null){
                                System.out.println("You dindn't watch a movie yet");
                            }else{
                                System.out.println("Select an option: \n" + customer.getWatchedMovies());
                                int perRank = input.nextInt();
                                while (!(perRank > 0 && perRank <= customer.watchedMovies.size())){
                                    System.out.println("You've selected an invalid option, please try again");
                                    perRank = input.nextInt();
                                }
                                System.out.println("You ve selected " + customer.watchedMovies.get(perRank-1).getName());
                                System.out.println("Put your rank between 0 and 10");
                                double rank = input.nextDouble();
                                if(!(rank >= 0&& rank <= 10)){
                                    System.out.println("You just can rank between rank 0 and rank 10");
                                    System.out.println("Try again");
                                    System.out.println("Put your rank between 0 and 10");
                                    rank = input.nextDouble();
                                }
                                customer.putRank(rank, customer.watchedMovies.get(perRank-1));
                            }

                            break;
                        case 7:
                            if(customer.tickets.isEmpty()){
                                System.out.println("There are no tickets");
                            }else{
                                customer.showTickets();
                            }
                            break;
                        case 8:
                            System.out.println("select a movie to watch comments");
                            System.out.println("Select a movie...");
                            System.out.println(cinema.getAllMovies(cinema.getMovies()));
                            int optionMovie = input.nextInt();
                            while(!(optionMovie > 0 && optionMovie < cinema.movies.size())){
                                System.out.println("Your input was invalid, please try again...");
                                System.out.println("Select a movie...");
                                System.out.println(cinema.getAllMovies(cinema.getMovies()));
                                optionMovie = input.nextInt();
                            }
                            if(cinema.getMovie(optionMovie, cinema.getMovies()).comments.isEmpty()){
                                System.out.println("This movie doesnt have comments");
                            }else{
                                System.out.println(cinema.getMovie(optionMovie, cinema.getMovies()).getAllComments());
                            }
                            break;
                        case 9:
                            run = false;
                            System.out.println("See you later " + customer.getName() + " :3");
                            System.out.println("\n==========================\n");
                            break;
                    }
                }
            }while(run);
        }

    }

    public void movieComments(Movie movie){
        System.out.println("Welcome ");
        Scanner input = new Scanner(System.in);
        boolean run = true;
        do{
            System.out.println("Pick an option: \n1. Comments\n2. \n2. Exit");
            int option = input.nextInt();
            if(option > 0&& option< 5){
                switch(option){
                    case 1:
                        System.out.println("Watch comments");
                        if(movie.getComments().isEmpty()){
                            System.out.println("There are no comments yet");
                        }else{
                            System.out.println(movie.getAllComments());
                        }
                    case 2:
                        run = false;
                        System.out.println("\n==========================\n");
                        break;
                }
            }else{
                System.out.println("You input and invalid option, try again");
            }
        }while(run);
    }
}
