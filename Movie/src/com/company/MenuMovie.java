package com.company;
public class MenuMovie extends ProcessFinal{
    public void mainMenu(){
        int access = 0;
        boolean repeticions = false;
        while(repeticions == false){
            System.out.println("ARE YOU A USER OR ADMINISTRATOR USER --> "+
                    "\n1. USER"+
                    "\n2. USER ADMINISTRATOR");
            int user = entrada.nextInt();
            if(user == 1){
                access = 0;
                System.out.println("---MISSION COMPLETED AND PROCESSED---");
                repeticions = true;
            }
            else if(user == 2){
                System.out.println("ENTER THE PASSWORD --> ");
                String empty = entrada.nextLine();
                String password = entrada.nextLine();
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
            System.out.println("CHOOSE THE OPTION YOU WANT--> "+
                    "\n1. SHOW MOVIES"+
                    "\n2. EDIT MOVIES"+
                    "\n3. SHOW GENDER"+
                    "\n4. EDIT GENRE"+
                    "\n5. SHOW DESCRIPTION"+
                    "\n6. EDIT DESCRIPTION"+
                    "\n7. SHOW MOVIES RANKING"+
                    "\n8. EDIT MOVIES RANKING"+
                    "\n9. SHOW FILMS RELEASE DATE"+
                    "\n10. SHOW COMMENTS"+
                    "\n11. EDIT THE DATE OF THE RELEASE OF THE FILMS");
            int index = entrada.nextInt();
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
                    System.out.println(showDescription());
                    break;
                case 7 : System.out.println(showRanks());
                    break;
                case 8 : editRanks();
                    System.out.println(showRanks());
                    break;
                case 9 : System.out.println(showPremierDate());
                    break;
                case 10 :
                    System.out.println(showComments());
                    break;
                case 11 : editPremierDate();
                    System.out.println(showPremierDate());
                    break;
                default :
                    System.out.println("YOU ENTERED A WRONG NUMBER");
                    System.out.println("----TRY LATER----");
                    System.out.println("*************************************************");
            }
        }

        else if (access == 0){
            System.out.println("CHOOSE THE OPTION YOU WANT--> "+
                    "\n1. SHOW MOVIES"+
                    "\n2. SHOW GENRES"+
                    "\n3. SHOW DESCRIPTION"+
                    "\n4. SHOW MOVIE RANKING"+
                    "\n5. SHOW RELEASE DATES OF NEW MOVIES");
            int index = entrada.nextInt();
            switch(index){
                case 1 :
                    System.out.println(showMovies());
                    break;
                case 2 :
                    System.out.println(showGenders());
                    break;
                case 3 :
                    System.out.println(showDescription());
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









