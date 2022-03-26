package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class MenuMovie extends ProcessFinal{
    public void mainMenu(){
        int access = 0;
        boolean repeticions = false;
        while(repeticions == false){
            int user = Integer.parseInt(JOptionPane.showInputDialog("ARE YOU A USER OR ADMINISTRATOR USER --> "+
                    "\n1. USER"+
                    "\n2. USER ADMINISTRATOR"));
            if(user == 1){
                access = 0;
                System.out.println("---MISSION COMPLETED AND PROCESSED---");
                repeticions = true;

            }
            else if(user == 2){
                String password = JOptionPane.showInputDialog("ENTER THE PASSWORD --> ");
                if(password.equals("cococo")){
                    access++;
                    System.out.println("---MISSION COMPLETED AND PROCESSED---");
                    repeticions = true;
                }
                else{
                    System.out.println("WRONG PASSWORD");
                    System.out.println("---TRY AGAIN---");
                }
            }
            else{
                System.out.println("THE NUMBER YOU ENTERED IS THE WRONG");
                System.out.println("TRY AGAIN");
            }
        }
        if (access == 1){
            int index = Integer.parseInt(JOptionPane.showInputDialog("CHOOSE THE OPTION YOU WANT--> "+
                    "\n1. SHOW MOVIES"+
                    "\n2. EDIT MOVIES"+
                    "\n3. SHOW GENDER"+
                    "\n4. EDIT GENRE"+
                    "\n5. SHOW DESCRIPTION"+
                    "\n6. EDIT DESCRIPTION"+
                    "\n7. SHOW MOVIES RANKING"+
                    "\n8. EDIT MOVIES RANKING"+
                    "\n9. SHOW FILMS RELEASE DATE"+
                    "\n10. EDIT THE DATE OF THE RELEASE OF THE FILMS"));
            switch(index){
                case 1 : System.out.println(showMovies());
                    break;
                case 2 : editMovie();
                    System.out.println(showMovies());
                    break;
                case 3 : System.out.println(showGenders());
                    break;
                case 4 : editGender();
                    System.out.println(showGenders());
                    break;
                case 5 : System.out.println(showDescriptions());
                    break;
                case 6 : editDescription();
                    System.out.println(showDescriptions());
                    break;
                case 7 : System.out.println(showRanks());
                    break;
                case 8 : editRanks();
                    System.out.println(showRanks());
                    break;
                case 9 : System.out.println(showPremierDate());
                    break;
                case 10 : editPremierDate();
                    System.out.println(showPremierDate());
                    break;
                default :
                    System.out.println("YOU ENTERED A WRONG NUMBER");
                    System.out.println("----TRY LATER----");
                    System.out.println("*************************************************");
            }
        }

        else if (access == 0){
            int index = Integer.parseInt(JOptionPane.showInputDialog("CHOOSE THE OPTION YOU WANT--> "+
                    "\n1. SHOW MOVIES"+
                    "\n2. SHOW GENRES"+
                    "\n3. SHOW DESCRIPTION"+
                    "\n4. SHOW MOVIE RANKING"+
                    "\n5. SHOW RELEASE DATES OF NEW MOVIES"));
            switch(index){
                case 1 :
                    System.out.println(showMovies());
                    break;
                case 2 :
                    System.out.println(showGenders());
                    break;
                case 3 :
                    System.out.println(showDescriptions());
                    break;
                case 4 :
                    System.out.println(showRanks());
                    break;
                case 5 :
                    System.out.println(showPremierDate());
                    break;
                default :
                    System.out.println("YOU ENTERED A WRONG NUMBER");
                    System.out.println("----TRY LATER----");
                    System.out.println("*************************************************");
            }

        }
    }
}









