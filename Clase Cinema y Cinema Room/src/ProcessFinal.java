import javax.swing.*;
public class ProcessFinal extends Process{
    public void editDescription(){
        System.out.println("<DESCRIPTIONS>"+"\n");
        System.out.println("THE DESCRIPTIONS OF THE GENRES ARE:");
        boolean repeticion = false;
        while(repeticion == false){
            printList();
            int number = askNumber();
            String message = writeDescription();
            printDates(message, number);
            boolean repeticion2 = false;
            while(repeticion2 == false){
                int replace = confirmationCode();
                if(replace == 1){
                    Descriptions.set(number-1, " "+message.toUpperCase());
                    repeticion2 = true;
                }
                else if(replace == 2){
                    beginCode();
                    repeticion2 = true;
                }
                else{
                    errorCode();
                }
            }
            boolean repeticion3 = false;
            while(repeticion3 == false){
                int number2 = ask2Description();
                if(number2 == 1){
                    addDescription();
                    repeticion3 = true;
                }
                else if(number2 == 2){
                    exitCode();
                    repeticion3 = true;
                    repeticion = true;
                }
                else{
                    errorCode();
                }
            }
        }
        printList();
    }
    public String showDescription(){
        System.out.println("THERE IS A TOTAL OF --> "+Descriptions.size()+" DESCRIPTIONS");
        String result = printList2();
        end();
        return result;
    }
    public String showGenders(){
        System.out.println("THERE IS A TOTAL OF --> "+Gender.size()+" GENDERS");
        String result = acountGender();
        end();
        return result;
    }
    public void editGender(){
        int option = optionsMenu();
        if(option == 1){
            String name = text2Office();
            int choice = GenderOffice();
            if(choice == 1){
                Gender.add(name.toUpperCase());
                successMessage();
            }
            else if(choice == 2){
                int again = newNumberOffice();
                if(again == 1){
                    String name2 = text2Office();
                    int choice2 = 0;
                    while( choice2 < 1 || choice2 > 2){
                        choice2 = GenderOffice();
                    }
                    if(choice2 == 1){
                        Gender.add(name2.toUpperCase());
                        successMessage();
                    }
                    else if(choice2 == 2){
                        int again2 = 0;
                        while (again2 < 1 || again2 > 2){
                            again2 = newNumberOffice();
                        }
                        if(again2 == 1){
                            String name3 = textOffice();
                            Gender.add(name3.toUpperCase());
                            successMessage();
                        }
                        else if(again2 != 1 && again2 != 2){
                            errorMessage();
                        }
                    }
                    else if(choice2 != 1 && choice2 != 2){
                        errorMessage();
                    }
                }
                else if(again == 2){
                    int again3 = newNumberOffice();
                    if(again3 == 1){
                        String name2 = text2Office();
                        int choice3 = 0;
                        while( choice3 < 1 || choice3 > 2){
                            choice3 = confirmationMenu();
                        }
                        if(choice3 == 1){
                            Gender.add(name2.toUpperCase());
                            successMessage();
                        }
                        else if(choice3 == 2){
                            int again4 = 0;
                            while (again4 < 1 || again4 > 2){
                                again4 = newNumberOffice();
                            }
                            if(again4 == 1){
                                String name3 = textOffice();
                                UpdateGender(name3);
                            }
                            else if(again4 != 1 && again4 != 2){
                                errorMessage();
                            }
                        }
                        else if(choice3 != 1 && choice3 != 2){
                            errorMessage();
                        }
                    }
                    else if(again3 == 2){
                        errorMessage();
                    }
                    else if(again3 != 1 && again3 != 2){
                        wrongNumber();
                    }
                }
                else if(again != 1 && again != 2){
                    System.out.println(text3Office());
                    int again5 = newNumberOffice();
                    if(again5 == 1){
                        String name2 = text2Office();
                        int choice4 = 0;
                        while( choice4 < 1 || choice4 > 2){
                            choice4 = GenderOffice();
                        }
                        if(choice4 == 1){
                            Gender.add(name2.toUpperCase());
                            successMessage();
                        }
                        else if(choice4 == 2){
                            int again6 = 0;
                            while (again6 < 1 || again6 > 2){
                                again5 = newNumberOffice();
                            }
                            if(again5 == 1){
                                String name3 = textOffice();
                                Gender.add(name3.toUpperCase());
                                successMessage();
                            }
                            else if(again5 != 1 && again5 != 2){
                                errorMessage();
                            }
                        }
                        else if(choice4 != 1 && choice4 != 2){
                            errorMessage();
                        }
                    }
                    else if(again5 == 2){
                        errorMessage();
                    }
                    else if(again5 != 1 && again5 != 2){
                        wrongNumber();
                    }
                }
            }
            else if(choice != 1 && choice != 2){
                System.out.println(text3Office());
                int again = newNumberOffice();
                if(again == 1){
                    String name2 = text2Office();
                    int choice2 = 0;
                    while( choice2 < 1 || choice2 > 2){
                        choice2 = GenderOffice();
                    }
                    if(choice2 == 1){
                        Gender.add(name2.toUpperCase());
                        successMessage();
                    }
                    else if(choice2 == 2){
                        int again2 = 0;
                        while (again2 < 1 || again2 > 2){
                            again2 = newNumberOffice();
                        }
                        if(again2 == 1){
                            String name3 = textOffice();
                            Gender.add(name3.toUpperCase());
                            successMessage();
                        }
                        else if(again2 != 1 && again2 != 2){
                            errorMessage();
                        }
                    }
                    else if(choice2 != 1 && choice2 != 2){
                        errorMessage();
                    }
                }
                else if(again == 2){
                    int again3 = newNumberOffice();
                    if(again3 == 1){
                        String name2 = text2Office();
                        int choice3 = 0;
                        while( choice3 < 1 || choice3 > 2){
                            choice3 = GenderOffice();
                        }
                        if(choice3 == 1){
                            Gender.add(name2.toUpperCase());
                            successMessage();
                        }
                        else if(choice3 == 2){
                            int again4 = 0;
                            while (again4 < 1 || again4 > 2){
                                again4 = newNumberOffice();
                            }
                            if(again4 == 1){
                                String name3 = textOffice();
                                Gender.add(name3.toUpperCase());
                                successMessage();
                            }
                            else if(again4 != 1 && again4 != 2){
                                errorMessage();
                            }
                        }
                        else if(choice3 != 1 && choice3 != 2){
                            errorMessage();
                        }
                    }
                    else if(again3 == 2){
                        errorMessage();
                    }
                    else if(again3 != 1 && again3 != 2){
                        wrongNumber();
                    }
                }
            }
        }
        else if(option == 2){
            for(int i=0 ; i < Gender.size(); i++){
                System.out.println(i+1+".  "+ Gender.get(i));
            }
            int number = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER YOU WANT TO DELETE: "));
            if(number > 0 && number <Gender.size()){
                RemoveGender(number);
            }
            else{
                System.out.println("THE DIGIT ENTERED IS THE WRONG DIGIT PLEASE TRY LATER");
            }
        }
        else if(option == 3){
            System.out.println("---RETURNING TO THE MENU---");
        }
        else{
            System.out.println("---RETURNING TO THE MENU---");
        }
        mostrarlist();
    }
    public String editPremierDate(){
        int number = amountPremierDate();
        for(int i=0; i<number; i++){

            String name = nameNewMovie();
            int year = processYear();
            int month = processMonth();
            int day = processDay(month);
            result(name, day, month, year);
        }
        String resultFinal = resultFinal();
        end();
        return resultFinal;
    }
    public String showPremierDate(){
        System.out.println("THERE IS A TOTAL OF --> "+Gender.size()+" PREMIER DATES");
        String result = acountPremierDate();
        end();
        return result;
    }
    public void addComments(){
        int option = additionNewComment();
        if(option == 1){
            additionOtherComment();
            godComments();
        }
        else if(option == 2){
            badComments();
        }
        endComments();
    }
    public String showComments(){
        System.out.println("THERE IS A TOTAL OF --> "+Gender.size()+" COMMENTS");
        String result = accountComments();
        end();
        return result;
    }
    public void editRanks(){
        addCategoriesranks();
        String resultFinal ="\n"+"---PROCESS FINISHED----"+"\n";
        String aux = "";
        int option = chooseOptions();
        if(option == 1){
            printRanks();
            int number = chooseCategory();
            String name = nameMovieChoose();
            aux += ranks.get(number-1) + name.toUpperCase();
            Ranks.set((number-1), aux);
            sucessful();
        }
        else if(option == 2){
            printRanks();
            int number = deletedCategory();
            Ranks.set((number-1), ranks.get(number-1));
        }
        else if(option == 3){
            comeHome();
        }
        else{
            wrongCode();
        }
    }
    public String showRanks(){
        System.out.println("THERE IS A TOTAL OF --> "+Gender.size()+" RANKS");
        String result = accountRanks();
        end();
        return result;
    }
    public void editMovie(){
        String result = "";
        String name = getName();
        String nameGender = getGender();
        String DurationMovie = getDuration();
        result += name+ " YOUR GENDER IS FROM "+nameGender+ " AND "+DurationMovie;
        Movies.add(result);
        System.out.println(result);
        int number = Integer.parseInt(JOptionPane.showInputDialog("IF YOU WANT TO SEE YOUR COMMENTS PRESS 1"));
        comments(number);
    }
    public String showMovies(){
        String resultFinal = "";
        System.out.println("FILMS OF THE WEEK");
        for(int i = 0;i< Movies.size(); i++){
            resultFinal += i+1+"ª "+Movies.get(i)+"\n";
        }
        saveMovie(resultFinal);
        return resultFinal;
    }
}
