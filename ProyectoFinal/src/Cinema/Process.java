package Cinema;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Process {
    String emptyFill;

    Scanner entrada = new Scanner(System.in);

    String nameTextGender = "Gender.txt";
    String nameTextDescription = "Description.txt";
    String nameTextPremierDate = "PremierDate.txt";
    String nameTextComments = "Comment.txt";
    String nameTextRanks = "Rank.txt";
    String nameTextMovies = "Movie.txt";
    ArrayList<String> Gender = new ArrayList<String>();
    ArrayList<String> Descriptions = new ArrayList<String>();
    ArrayList<String> PremierDate  = new ArrayList<String>();
    ArrayList<String> Comments  = new ArrayList<String>();
    ArrayList<String> Ranks  = new ArrayList<String>();
    ArrayList<String> Movies  = new ArrayList<String>();
    //default categories are : ACTION / ADVENTURES / SCIENCE FICTION / COMEDY / DOCUMENTARY / DRAMA / FANTASY / MUSICAL / SUSPENSE / HORROR
    public Process(){
        InitializeGender();
        InitializeDescriptions();
        InitializePremierDate();
        InitializeComments();
        InitializeRanks();
        InitializeMovie();

    }
    public String nameAdmin(){
        emptyFill = entrada.nextLine();
        System.out.println("WHAT IS THE ADMINISTRATOR'S NAME?");
        String nameAdmin = entrada.nextLine();
        return nameAdmin;
    }
    /* DEFAULT DESCRIPTIONS
    String note0 = "High doses of adrenaline prevail in this genre with a good load of movement, escapes, acrobatics, fights, wars, chases and a fight against evil.";
    String note1 = "Similar to the action ones, new experiences and situations predominate.";
    String note2 = "Based on imaginary phenomena, aliens, invented societies, other planets are common in science fiction…";
    String note3 = "Specifically designed to elicit laughter or delight from viewers.";
    String note4 = "This genre analyzes a fact or real situation without fictionalizing it.";
    String note5 = "Dramas focus on developing the problem or problems between the different protagonists. This is perhaps one of the genres " +
            "\nwidest cinematographic on the list. Adventures or action are not predominant, although they may appear occasionally Generally " +
            "\nthey are based on developing human characters and interaction.";
    String note6 = "They include unreal or totally invented characters, non-existent in our reality. We can also know this genre of cinema as "fantastic". " +
            "\nIt is not based on ideas that may come to fruition.";
    String note7 = "Movies that break their natural flow with musical fragments are protagonists of this genre.";
    String note8 = "Also known as intrigue, these movies move quickly, with all of their elements revolving around the same intriguing element.";
    String note9 = "Its main purpose is to cause fear, horror, discomfort, or concern.";
    */
    //GENDER
    public void saveGender(String Information){
        File myObj = new File(nameTextGender);
        try {
            FileWriter myWriter = new FileWriter(nameTextGender);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showInformation(String Information){
        File myObj = new File(nameTextGender);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializeGender(){
        File myObj = new File(nameTextGender);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxGender = myReader.nextLine().split(" ");
                if(auxGender.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxGender.length ;i++){
                        aux += auxGender[i] + " ";
                    }
                    Gender.add(aux);
                }
                else{
                    Gender.add(auxGender[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void wrongNumber(){
        System.out.println("THE NUMBER ENTERED IS THE WRONG");
        errorMessage();
    }
    public void errorMessage(){
        System.out.println("RETURNING TO THE MENU");
        System.out.println("*****");
    }
    public void successMessage(){
        System.out.println("SUCCESSFULLY ADDED");
        errorMessage();
    }
    public void UpdateGender(String name){
        Gender.add(name);
        successMessage();
    }
    public void RemoveGender(int number){
        number--;
        Gender.remove(number);
        System.out.println("ACTION PERFORMED SUCCESSFULLY");
        System.out.println("*****");
    }
    public int newNumberOffice(){
        System.out.println("DO YOU WANT TO TRY AGAIN?"+
                "\n1. YES"+
                "\n2. NO");
        int number = entrada.nextInt();
        return number;
    }
    public int GenderOffice(){
        System.out.println("ARE YOU SURE YOU WANT TO ADD THIS GENRE?"+
                "\n1. YES"+
                "\n2. NO");
        int number = entrada.nextInt();
        return number;
    }
    public String textOffice(){
        emptyFill = entrada.nextLine();
        System.out.println("ENTER THE NAME TO BE ADDED TO THE LIST OF GENRES?: ");
        String add = entrada.nextLine();
        return add;
    }
    public String text2Office(){
        emptyFill = entrada.nextLine();
        System.out.println("ADD GENRE NAME: ");
        String add = entrada.nextLine();
        return add;
    }
    public void end(){
        String add = "PROCESS TERMINATED USER "+ nameAdmin().toUpperCase() +"\n*****";
        System.out.println(add);
    }
    public String text3Office(){
        String add = "THE NUMBER ENTERED IS THE WRONG";
        return add;
    }
    public String acountGender(){
        String resultFinal = "";
        for(int i = 0;i< Gender.size(); i++){
            resultFinal += i+1+". "+Gender.get(i)+"\n";
        }
        saveGender(resultFinal);
        return resultFinal;
    }
    //DESCRIPTION
    public void saveDescription(String Information){
        File myObj = new File(nameTextDescription);
        try {
            FileWriter myWriter = new FileWriter(nameTextDescription);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showIDescription(String Information){
        File myObj = new File(nameTextDescription);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializeDescriptions(){
        File myObj = new File(nameTextDescription);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxDescription = myReader.nextLine().split(" ");
                if(auxDescription.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxDescription.length ;i++){
                        aux += auxDescription[i] + " ";
                    }
                    Descriptions.add(aux);
                }
                else{
                    Descriptions.add(auxDescription[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String showDescriptions(){
        String resultFinal = "";
        System.out.println("THERE IS A TOTAL OF --> "+Descriptions.size()+" DESCRIPTIONS");
        for(int i = 0;i< Descriptions.size(); i++){
            resultFinal += i+1+". "+Descriptions.get(i)+"\n";
        }
        saveDescription(resultFinal);
        end();
        return resultFinal;
    }
    public void errorCode(){
        System.out.println("YOU DID AN INCORRECT NUMBER");
        System.out.println("TRY AGAIN");
        System.out.println("*****");
    }
    public int confirmationCode(){
        System.out.println("ARE YOU SURE YOU WANT TO ADD THIS DESCRIPTION INSTEAD OF THE ABOVE" +
                "\n1. YES"+
                "\n2. NO");
        int number = entrada.nextInt();
        return number;
    }
    public int ask2Description(){
        System.out.println("YOU WANT TO ADD ANOTHER DESCRIPTION: " +
                "\n1. YES"+
                "\n2. NO");
        int number = entrada.nextInt();
        return number;
    }
    public void printList(){
        String result = "";
        for(int i=0 ; i < Descriptions.size(); i++){
            if(i == Descriptions.size()-1){
                result += i+1+". "+ Descriptions.get(i);
            }
            else{
                result += i+1+". "+ Descriptions.get(i) +"\n";
            }
        }
        System.out.println(result);
    }
    public String printList2(){
        String result = "";
        for(int i=0 ; i < Descriptions.size(); i++){
            result += i+1+". "+ Descriptions.get(i) +"\n";
            if(i == Descriptions.size()-1){
                result += i+1+". "+ Descriptions.get(i);
            }
        }
        saveDescription(result);
        return result;
    }
    public int askNumber(){
        System.out.println("ENTER THE NUMBER OF THE GENRE YOU WANT TO EDIT: ");
        int number = entrada.nextInt();
        return number;
    }
    public String writeDescription(){
        emptyFill = entrada.nextLine();
        System.out.println("WRITE THE DESCRIPTION YOU WANT TO ADD");
        String message = entrada.nextLine();
        return message;
    }
    public void printDates(String message, int number){
        System.out.println("THE DESCRIPTION TO ADD IS THIS -->"+"\n"+" "+message.toUpperCase());
        System.out.println("THE DESCRIPTION THAT WILL CHANGE IS THIS -->"+"\n"+Descriptions.get(number-1));
    }
    public void beginCode(){
        System.out.println("RETURNING TO THE START");
        System.out.println("*****");
    }
    public void addDescription(){
        System.out.println("AADDING ANOTHER DESCRIPTION");
        System.out.println("----EN PROCESO----");
        System.out.println("*****");
    }
    public void exitCode(){
        System.out.println("EXIT TO MENU");
        System.out.println("*****");

    }
    //MENU
    public int optionsMenu(){
        System.out.println("ENTER THE OPTION YOU WANT "+
                "\n1. ADD GENRE "+
                "\n2. REMOVE GENRE" +
                "\n3. EXIT");
        int option = entrada.nextInt();
        return option;
    }
    public int confirmationMenu(){
        System.out.println("ARE YOU SURE YOU WANT TO ADD THIS GENRE: "+
                "\n1. YES"+
                "\n2. NO");
        int option = entrada.nextInt();
        return option;
    }

    public void mostrarlist(){
        String result2 = "";
        for(int i=0 ; i < Gender.size(); i++){
            if(i == Gender.size()-1){
                result2 += i+1+".  "+ Gender.get(i);
            }
            else{
                result2 += i+1+".  "+ Gender.get(i) +" / ";
            }
        }
        System.out.println("THIS IS THE LIST OF GENRES:");
        System.out.println(result2);
        end();
    }
    //PREMIER DATE
    public void savePremierDate(String Information){
        File myObj = new File(nameTextPremierDate);
        try {
            FileWriter myWriter = new FileWriter(nameTextPremierDate);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showPremierDate(String Information){
        File myObj = new File(nameTextPremierDate);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializePremierDate(){
        File myObj = new File(nameTextPremierDate);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxPremierDate = myReader.nextLine().split(" ");
                if(auxPremierDate.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxPremierDate.length ;i++){
                        aux += auxPremierDate[i] + " ";
                    }
                    PremierDate.add(aux);
                }
                else{
                    PremierDate.add(auxPremierDate[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public int amountPremierDate(){
        System.out.println("CHOW MANY RELEASE DATES WILL YOU ADD");
        int number = entrada.nextInt();
        return number;
    }
    public String nameNewMovie(){
        emptyFill = entrada.nextLine();
        System.out.println("WRITE THE NAME OF THE MOVIE PREMIERED");
        String name = entrada.nextLine();
        return name;
    }
    ArrayList<Integer> daysMonths = new ArrayList<Integer>();
    ArrayList<String> premierDate  = new ArrayList<String>();
    public void daysEachMonth(){
        int january = 31;
        int february = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        int december = 31;
        daysMonths.add(january);
        daysMonths.add(february);
        daysMonths.add(march);
        daysMonths.add(april);
        daysMonths.add(may);
        daysMonths.add(june);
        daysMonths.add(july);
        daysMonths.add(august);
        daysMonths.add(september);
        daysMonths.add(october);
        daysMonths.add(november);
        daysMonths.add(december);
    }
    public int processYear(){
        int year;
        System.out.println("WHAT YEAR ARE WE IN");
        int yearActually = entrada.nextInt();
        year = 0;
        while((yearActually+10) < year || yearActually > year){//YOU CAN ONLY START THE PREMIERE IF THE FILM DOES NOT EXCEED 10 YEARS FROM THE CURRENT DATE
            System.out.println("WRITE THE YEAR OF THE PREMIERE");
            year = entrada.nextInt();
            if((yearActually+10) < year || yearActually > year){
                errorYear();
            }
        }
        return year;
    }
    public int processMonth(){
        int month;
        month = 0;
        while(month > 12 || month < 1){
            System.out.println("ENTER THE NUMBER OF THE MONTH OF THE PREMIERE" +
                    "\n1. JANUARY / 2. FEBRUARY / 3. MARCH / 4. APRIL"+
                    "\n5. MAY / 6. JUNE / 7. JULY / 8. AUGUST"+
                    "\n9. SEPTEMBER / 10. OCTOBER / 11. NOVEMBER / 12. DECEMBER");
            month = entrada.nextInt();
            if(month > 12 || month < 1){
                errorMonth();
            }
        }
        return month;
    }
    public int processDay(int month){
        daysEachMonth();
        int day;
        day = 0;
        while(day < 1 || day > daysMonths.get(month-1)){
            System.out.println("WRITE THE DAY OF THE PREMIERE");
            day = entrada.nextInt();
            if(day < 1 || day > daysMonths.get(month-1)){
                errorDay();
            }
        }
        return day;
    }
    public void errorYear(){
        System.out.println("THE PREMIERE DOES NOT HAVE TO PASS 10 YEARS FROM THE CURRENT DATE");
        System.out.println("TRY AGAIN");
        System.out.println("******");
    }
    public void errorMonth(){
        System.out.println("I ENTERED A WRONG NUMBER");
        System.out.println("TRY AGAIN");
        System.out.println("******");
    }
    public void errorDay(){
        System.out.println("IN THAT MONTH THERE IS NO THAT DAY");
        System.out.println("TRY AGAIN");
        System.out.println("******");
    }
    public void result(String name, int day, int month, int year){
        String result = "";
        result +="THE MOVIE IS PREMIERE "+name+" THE DATE --> "+day+"/"+month+"/"+year;
        premierDate.add(result);
    }
    public String resultFinal(){
        String resultFinal = "";
        for(int i=0; i<premierDate.size(); i++){
            resultFinal += premierDate.get(i)+"\n";
        }
        return resultFinal;
    }
    public String acountPremierDate(){
        String resultFinal = "";
        for(int i = 0;i< PremierDate.size(); i++){
            resultFinal += i+1+". "+PremierDate.get(i)+"\n";
        }
        savePremierDate(resultFinal);
        return resultFinal;
    }



    //COMMENTS
    public void saveComments(String Information){
        File myObj = new File(nameTextComments);
        try {
            FileWriter myWriter = new FileWriter(nameTextComments);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showComments(String Information){
        File myObj = new File(nameTextComments);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializeComments(){
        File myObj = new File(nameTextComments);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxComments = myReader.nextLine().split(" ");
                if(auxComments.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxComments.length ;i++){
                        aux += auxComments[i] + " ";
                    }
                    Comments.add(aux);
                }
                else{
                    Comments.add(auxComments[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void endComments(){
        String result = "EXECUTION TERMINATED";
        System.out.println("******");
    }
    public void godComments(){
        String result = "COMMENT SUCCESSFULLY ADDED";
    }
    public void badComments(){
        String result = "RETURNING TO THE MENU";
    }
    public int additionNewComment(){
        int option = 0;
        while (option < 1 || option > 2) {
            System.out.println("DO YOU WANT TO ADD A NEW COMMENT:?" +
                    "\n1. SI" +
                    "\n2. NO");
            option = entrada.nextInt();
        }
        return option;
    }
    public void additionOtherComment(){
        int option = 0;
        emptyFill = entrada.nextLine();
        do{
            System.out.println("WRITE THE COMMENT");
            String add = entrada.nextLine();
            Comments.add(" "+add.toUpperCase());
            System.out.println("YOU WANT TO ADD ANOTHER COMMENT:" +
                    "\n1. SI" +
                    "\n2. NO");
            option = entrada.nextInt();
        } while(option == 1);
    }
    public String accountComments(){
        String resultFinal = "";
        for(int i = 0;i< Comments.size(); i++){
            resultFinal += i+1+"ª "+Comments.get(i)+"\n";
        }
        saveGender(resultFinal);
        return resultFinal;
    }
    //RANKS
    public void saveRanks(String Information){
        File myObj = new File(nameTextRanks);
        try {
            FileWriter myWriter = new FileWriter(nameTextRanks);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showRanks(String Information){
        File myObj = new File(nameTextRanks);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializeRanks(){
        File myObj = new File(nameTextRanks);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxRanks = myReader.nextLine().split(" ");
                if(auxRanks.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxRanks.length ;i++){
                        aux += auxRanks[i] + " ";
                    }
                    Ranks.add(aux);
                }
                else{
                    Ranks.add(auxRanks[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    ArrayList<String> ranks  = new ArrayList<String>();
    public void addCategoriesranks(){
        ranks.add("TODAY'S BEST MOVIE IS --> ");
        ranks.add("THE BEST MODERN CLASSIC MOVIE IS --> ");
        ranks.add("THE BEST CLASSIC MOVIE IS --> ");
        ranks.add("THE BEST ANIMATED MOVIE IS --> ");
        ranks.add("THE BEST ACTION MOVIE IS --> ");
        ranks.add("THE BEST ADVENTURE MOVIE IS --> ");
        ranks.add("THE BEST SCIENCE FICTION MOVIE IS --> ");
        ranks.add("THE BEST COMEDY MOVIE IS --> ");
        ranks.add("THE BEST DOCUMENTARY IS --> ");
        ranks.add("THE BEST DRAMA MOVIE IS --> ");
        ranks.add("THE BEST FANTASY MOVIE IS --> ");
        ranks.add("THE BEST MUSICAL MOVIE IS --> ");
        ranks.add("THE BEST THRILLER IS --> ");
        ranks.add("THE BEST HORROR MOVIE IS --> ");
    }
    public void printRanks(){
        for(int i=0; i<Ranks.size(); i++){
            System.out.println((i+1)+"ª "+Ranks.get(i));
        }
    }
    public int chooseOptions(){
        System.out.println("ENTER THE NUMBER OF THE OPTION YOU WANT:" +
                "\n1. CHANGE A MOVIE RANKING" +
                "\n2. REMOVE A MOVIE FROM THE RANKING" +
                "\n3. EXIT");
        int option = entrada.nextInt();
        return option;
    }
    public int chooseCategory(){
        System.out.println("ENTER THE NUMBER OF THE CATEGORY YOU WANT TO CHANGE");
        int number = entrada.nextInt();
        return number;
    }
    public int deletedCategory(){
        System.out.println("ENTER THE NUMBER OF THE CATEGORY WHERE YOU WANT TO REMOVE THE FILM");
        int number = entrada.nextInt();
        return number;
    }
    public String nameMovieChoose(){
        emptyFill = entrada.nextLine();
        System.out.println("WHAT IS THE NAME OF THE MOVIE YOU WANT TO CHANGE");
        String name = entrada.nextLine();
        return name;
    }
    public void sucessful(){
        System.out.println("*****");
        System.out.println("---ACTION COMPLETED SUCCESSFULLY---");
        System.out.println("*****");
    }
    public void comeHome(){
        System.out.println("*****");
        System.out.println("---RETURNING TO THE MENU---");
        System.out.println("*****");
    }
    public void wrongCode(){
        System.out.println("*****");
        System.out.println("---ERROR WHEN PLACING THE NUMBER---");
        System.out.println("---BETTER LUCK NEXT---");
        System.out.println("*****");
    }
    public String accountRanks(){
        String resultFinal = "";
        for(int i = 0;i< Ranks.size(); i++){
            resultFinal += i+1+"ª "+ Ranks.get(i)+"\n";
        }
        saveRanks(resultFinal);
        return resultFinal;
    }
    //MOVIE
    public void saveMovie(String Information){
        File myObj = new File(nameTextMovies);
        try {
            FileWriter myWriter = new FileWriter(nameTextMovies);
            myWriter.write(Information);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void showMovie(String Information){
        File myObj = new File(nameTextMovies);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void InitializeMovie(){
        File myObj = new File(nameTextMovies);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] auxMovies = myReader.nextLine().split(" ");
                if(auxMovies.length > 2){
                    String aux = "";
                    for(int i=1 ;i<auxMovies.length ;i++){
                        aux += auxMovies[i] + " ";
                    }
                    Movies.add(aux);
                }
                else{
                    Movies.add(auxMovies[1]);
                }
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void comments(int number){
        if(number == 1){
            System.out.println(printComments());
        }
        else{
            System.out.println("----TRY LATER----");
        }
    }
    public String printComments(){
        String resultFinal = "";
        for(int i = 0;i< Comments.size(); i++){
            resultFinal += i+1+"ª "+"COMMENTARY --> "+Comments.get(i)+"\n";
        }
        return resultFinal;
    }
    public String getGender(){
        String result = "";
        for(int i=0 ; i < Gender.size(); i++){
            if(i == Gender.size()-1){
                result += i+1+". "+ Gender.get(i);
            }
            else{
                result += i+1+". "+ Gender.get(i) +"\n";
            }
        }
        System.out.println(result);
        emptyFill = entrada.nextLine();
        System.out.println("WRITE THE NAME OF THE GENRE:");
        String Gender = entrada.nextLine();
        return Gender;
    }
    public String getName(){
        String result = "";
        ArrayList<String> Names = new ArrayList<String>();
        //int number = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE NOMBRES PELICULAS QUE QUIERES AGREGAR"));
        int number = 1;
        String[] movies = new String[number];
        emptyFill = entrada.nextLine();
        for(int i=0 ; i<movies.length; i++){
            System.out.println("THE NAME OF THE FILM IS:");
            movies[i] = entrada.nextLine();
        }
        for(int i=0; i<movies.length; i++){
            Names.add(movies[i].toUpperCase());
        }
        for(int i=0; i<Names.size(); i++){
            if(i == Names.size()-1){
                result += Names.get(i);
            }
            else{
                result += Names.get(i)+" , ";
            }
        }
        return result;
    }
    public String getDuration(){
        String resultFinal = "";
        ArrayList<String> Duration = new ArrayList<String>();
        //int addition = Integer.parseInt(JOptionPane.showInputDialog("CUANTAS HORAS QUIERE AÑADIR (ENTRE UNO Y UN MAXIMO DE 10 HORAS)"));
        int addition = 1;
        if (addition > 0 && addition < 11){
            System.out.println("MOVIE TIME WANTS: "+
                    "\n1. ADD IT"+
                    "\n2. ADD IT RANDOMLY");
            int add = entrada.nextInt();
            if(add == 1){
                for(int i=0; i<addition ; i++){
                    String result = "";
                    System.out.println("ENTER THE NUMBER OF HOURS (1 or 2 HOURS IS ACCEPTED)");
                    int userHours = entrada.nextInt();
                    if (userHours == 1){
                        System.out.println("ENTER THE AMOUNT OF MINUTES\n" +
                                "(IT IS ACCEPTED BETWEEN 30 TO 60 MINUTES)");
                        int userMinuts = entrada.nextInt();
                        System.out.println("ENTER THE NUMBER OF SECONDS \n(IT IS ACCEPTED BETWEEN 0 TO 60 SECONDS)");
                        int userSeconds = entrada.nextInt();
                        if(userMinuts == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOUR, "+userMinuts+" MINUTE Y "+userSeconds+" SECONDS";
                        }
                        else if(userSeconds == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOUR, "+userMinuts+" MINUTES Y "+userSeconds+" SECOND";
                        }
                        else{
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOUR, "+userMinuts+" MINUTES Y "+userSeconds+" SECONDS";
                        }
                    }
                    else if(userHours == 2){
                        System.out.println("ENTER THE AMOUNT OF MINUTES OR MINUTE\n" +
                                "(ONLY ACCEPTED BETWEEN 0 TO 30 MINUTES)");
                        int userMinuts = entrada.nextInt();
                        System.out.println("ENTER THE NUMBER OF SECONDS\n" +
                                "(ONLY ACCEPTED BETWEEN 0 TO 60 SECONDS)");
                        int userSeconds = entrada.nextInt();
                        if(userMinuts == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOURS, "+userMinuts+" MINUTE Y "+userSeconds+" SECONDS";
                        }
                        else if(userSeconds == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOURS, "+userMinuts+" MINUTES Y "+userSeconds+" SECOND";
                        }
                        else{
                            result = "THE MOVIE LASTS A NUMBER OF "+userHours+" HOURS, "+userMinuts+" MINUTES Y "+userSeconds+" SECONDS";
                        }
                    }
                    else{
                        System.out.println("IYOU ENTERED THE WRONG NUMBER YOU WANT TO TRY AGAIN: "+
                                "\n1. YES"+
                                "\n2. NO");
                        int end = entrada.nextInt();
                        if(end == 1){
                            System.out.println("DIGITE LA CANTIDAD DE HORAS (SE ACEPTA 1 o 2 HORAS)");
                            int userHours2 = entrada.nextInt();
                            if(userHours2 == 1){
                                System.out.println("ENTER THE AMOUNT OF MINUTES \n(IT IS ACCEPTED BETWEEN 30 TO 60 MINUTES)");
                                int userMinuts2 = entrada.nextInt();
                                System.out.println("ENTER THE NUMBER OF SECONDS \n(IT IS ACCEPTED BETWEEN 0 AND 60 SECONDS)");
                                int userSeconds2 = entrada.nextInt();
                                if(userMinuts2 == 1){
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOUR, "+userMinuts2+" MINUTE Y "+userSeconds2+" SECONDS";
                                }
                                else if(userSeconds2 == 1){
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOUR, "+userMinuts2+" MINUTES Y "+userSeconds2+" SECOND";
                                }
                                else{
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOUR, "+userMinuts2+" MINUTES Y "+userSeconds2+" SECONDS";
                                }
                            }
                            else if(userHours2 == 2){
                                System.out.println("DIGITE LA CANTIDAD DE MiNUTOS O MINUTO \n(SOLO SE ACEPTA ENTRE 0 A 30 MINUTOS)");
                                int userMinuts2 = entrada.nextInt();
                                System.out.println("DIGITE LA CANTIDAD DE SEGUNDOS \n(SOLO SE ACEPTA ENTRE 0 A 60 SEGUNDOS)");
                                int userSeconds2 = entrada.nextInt();
                                if(userMinuts2 == 1){
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOURS, "+userMinuts2+" MINUTE Y "+userSeconds2+" SECONDS";
                                }
                                else if(userSeconds2 == 1){
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOURS, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SECOND";
                                }
                                else{
                                    result = "THE MOVIE LASTS A NUMBER OF "+userHours2+" HOURS, "+userMinuts2+" MINUTOS Y "+userSeconds2+" SECONDS";
                                }
                            }
                            else{
                                System.out.println("PLEASE ENTER A CORRECT NUMBER NEXT TIME");
                                System.out.println("--RETURNING TO THE MENU--");
                            }
                            if(end == 2){
                                System.out.println("YOU CHOSE THE NO OPTION");
                                System.out.println("--RETURNING TO THE MENU--");
                            }
                            else{
                                System.out.println("PLEASE ENTER A CORRECT NUMBER NEXT TIME");
                                System.out.println("--RETURNING TO THE MENU--");
                            }

                        }
                    }
                    Duration.add(result);
                }
            }
            else if(add == 2){
                for(int i=0; i<addition ; i++){
                    int dur = 0;
                    String result = "";
                    while(dur < 5400 || dur > 9000){
                        dur = (int)(Math.random()*9001);      //dur = Segundos que equivalen de 1 hora y media a 2 horas
                    }
                    int hours, minuts, seconds;
                    hours = dur / 3600;
                    dur -= (3600*hours);
                    minuts = dur / 60;
                    dur -= (60*minuts);
                    seconds =  dur;
                    if(hours == 1){
                        if(seconds == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOUR, "+minuts+" MINUTES Y "+seconds+" SECOND";
                        }
                        else {
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOUR, "+minuts+" MINUTES Y "+seconds+" SECONDS";
                        }
                    }
                    else if(hours == 2 && minuts == 0 && seconds == 0){
                        result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOURS";
                    }
                    else if(hours == 2){
                        if(seconds == 1 && minuts == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOURS, "+minuts+" MINUTE Y "+seconds+" SECOND";
                        }
                        else if(minuts == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOURS, "+minuts+" MINUTE Y "+seconds+" SECONDS";
                        }
                        else if(seconds == 1){
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOURS, "+minuts+" MINUTES Y "+seconds+" SECOND";
                            System.out.println();            }
                        else {
                            result = "THE MOVIE LASTS A NUMBER OF "+hours+" HOURS, "+minuts+" MINUTES Y "+seconds+" SECONDS";
                        }
                    }
                    Duration.add(result);
                }
            }
            else{
                System.out.println("PLEASE ENTER A CORRECT NUMBER NEXT TIME");
                System.out.println("--RETURNING TO THE MENU--");
            }
        }
        else{
            System.out.println("PLEASE ENTER A CORRECT NUMBER NEXT TIME");
            System.out.println("--RETURNING TO THE MENU--");
        }
        for(int i=0; i<Duration.size(); i++){
            resultFinal += "THE DURATION OF THE FILM IS--> "+Duration.get(i) + ("\n");
        }
        System.out.println(resultFinal);
        return resultFinal;
    }


}