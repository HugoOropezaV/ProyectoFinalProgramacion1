package ChallengesScan;

import Users.Customer;

import java.util.Scanner;

public class addsScan {

    private static int option;
    static Scanner scan = new Scanner(System.in);

    public static int commentChallengeN = 1;
    public static int watchChallengeN = 1;
    public static int rankChallengeN = 1;
    public static Challenge[] commentChallenge = new CommentChallenge[100];
    public static Challenge[] watchChallenge = new WatchMovieChallenge[100];
    public static Challenge[] rankChallenge = new RankChallenge[100];


    static int listNumber = 1;

    static int[] positionChallenge = new int[300];

    static String[] challengeList = new String[300];

    static String[] trueChallenges = new String[300];

    /* public String getAllChallenge()
     *  like
     *   1. Challenge name
     *   2. Challenge nam2
     *
     * public Challenge getChallenge(int i){
     *   return challenge[i];
     * }
     * */
    public static String getAllChallenge(Challenge[] challenges){
        String list_String = "";
        for(int i =0; i < challenges.length; i++){
            if(challenges[i] != null){
                list_String += ((i + 1) + ". " + challenges[i].challengeName + "\n");
            }
        }
        return  list_String;
    }

    public static Challenge getChallenge(int num, Challenge[] challenges){
        return challenges[num];
    }

    public static void challengeControlAd(){
        int i = 0;
        while (i < 1) {
            try{
                System.out.println("""
                    What do you wanna do?
                     1. Create a Challenge
                     2. Delete a Challenge
                     3. Restore a Challenge
                     4. Rewrite a challenge
                     5. Check a challenge
                     6. Check the Challenge list
                     7. exit""");

                option = scan.nextInt();
                System.out.println("-----------------------------------");

                if (option == 1) {
                    addsScan.addChallenges();
                }else if(option == 2){
                    addsScan.lessChallenge();
                }else if (option == 3){
                    addsScan.restoreChallenge();
                }else if(option == 4){
                    addsScan.rewriteChallenge();
                }else if(option == 5){
                    addsScan.checkmChallenge();
                } else if(option == 6){
                    int count = 0;
                    for(int n = 0 ; n < challengeList.length; n++) {

                        if (trueChallenges[n] != null) {
                            count++;
                            System.out.println(count + ".- " + trueChallenges[n]);
                        }
                    }
                    System.out.println("-----------------------------------");
                }else if(option == 7){
                    i = 2;
                } else {
                    System.out.println("Pls, select a valid option"+
                            "\n -----------------------------------");
                }

                int aux2 = 0;
                while (aux2 < 1) {

                    System.out.println("Finished action, do you wanna continue?" +
                            "\n 1. yes" +
                            "\n 2. no");

                    option = scan.nextInt();
                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        i--;
                    }  else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option" +
                                "\n -----------------------------------");
                        aux2--;
                    }
                    aux2++;
                }
            }catch (java.util.InputMismatchException e){
            /*    System.out.println("You've put a not allowed option, pls try again" +
                        "\n -----------------------------------");
                System.out.println("Return to main cinema menu"); */
            }
            i++;
        }
        System.out.println("-----------------------------------");
    }

    public static void challengeControlus(){
        int i = 0;
        while (i < 1) {
            try{
                System.out.println("""
                    What do you wanna do?
                     1. Check my challenge progress
                     2. Check the Challenge list
                     3. Exit""");


                option = scan.nextInt();
                System.out.println("-----------------------------------");

                if (option == 1) {
                    addsScan.checkmyChallenge();
                } else if (option == 2) {
                    int count = 0;
                    for (int n = 0; n < challengeList.length; n++) {
                        if (trueChallenges[n] != null) {
                            count++;
                            System.out.println(count + ".- " + trueChallenges[n]);
                        }
                    }
                    System.out.println("-----------------------------------");
                } else if(option == 3){
                    i = 2;
                } else{
                    System.out.println("Pls, select a valid option" +
                            "\n -----------------------------------");
                }

                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("Finished action, do you wanna continue?" +
                            "\n 1. yes" +
                            "\n 2. no");

                    option = scan.nextInt();
                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        i--;
                    } else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option");
                        aux2--;
                    }
                    aux2++;
                }
                System.out.println("You've put a not allowed option, pls try again");
            } catch (java.util.InputMismatchException e){
                System.out.println("You've put a not allowed option, pls try again");
            }
            i++;
        }
        System.out.println("-----------------------------------");
    }

    public static void addChallenges(){
        String name = null;
        int i = 0;


        while (i < 1){
            System.out.println("What kind of challenge do you wanna create?" +
                    "\n 1. Comment Challenge" +
                    "\n 2. Watch  Movie Challenge" +
                    "\n 3. Rank Challenge");

            option = scan.nextInt();

            System.out.println("-----------------------------------");

            if (option == 1) {
                commentChallenge[commentChallengeN -1] = new CommentChallenge();
                commentChallenge[commentChallengeN -1].createChallenge();
                name = commentChallenge[commentChallengeN -1].challengeName;

                try{
                    for (int d= 0; d < challengeList.length; d++){
                        if (challengeList[d].equals(name)){
                            System.out.println("This challenge name actually exists in the challenge lisTt." +
                                    "\n If you can't see it it has probably been deleted" +
                                    "\n -----------------------------------");
                            d = trueChallenges.length;
                            commentChallengeN--;
                            listNumber--;
                            i--;
                        }
                    }
                } catch (java.lang.NullPointerException e){
                }

                commentChallengeN++;
                listNumber++;
                System.out.println("-----------------------------------");

            } else if (option == 2) {
                watchChallenge[watchChallengeN -1] = new WatchMovieChallenge();
                watchChallenge[watchChallengeN -1].createChallenge();
                name = watchChallenge[watchChallengeN -1].challengeName;

                try{
                    for (int d= 0; d < challengeList.length; d++){
                        if (challengeList[d].equals(name)){
                            System.out.println("This challenge name actually exists in the challenge list." +
                                    "\n If you can't see it it has probably been deleted" +
                                    "\n -----------------------------------");
                            d = trueChallenges.length;
                            watchChallengeN--;
                            listNumber--;
                            i--;
                        }
                    }
                } catch (java.lang.NullPointerException e){}

                watchChallengeN++;
                listNumber++;

            } else if (option == 3) {
                rankChallenge[rankChallengeN -1] = new RankChallenge();
                rankChallenge[rankChallengeN -1].createChallenge();
                name = rankChallenge[rankChallengeN -1].challengeName;

                try{
                    for (int d= 0; d < challengeList.length; d++){
                        if (challengeList[d].equals(name)){
                            System.out.println("This challenge name actually exists in the challenge list." +
                                    "\n If you can't see it it has probably been deleted" +
                                    "\n -----------------------------------");
                            d = trueChallenges.length;
                            rankChallengeN--;
                            listNumber--;
                            i--;
                        }
                    }
                } catch (java.lang.NullPointerException e){}


                rankChallengeN++;
                listNumber++;

            } else {
                System.out.println("Pls, select a valid option" +
                        "\n -----------------------------------");
                i--;
            }

            i++;
        }
        System.out.println("-----------------------------------");
        challengeList[listNumber - 2] = name;

        for (int d= 0; d < trueChallenges.length; d++){
            if (trueChallenges[d] == null){
                trueChallenges[d]= name;
                d = trueChallenges.length;
            }
        }
        positionChallenge[listNumber -2] = option;

        int j = 0;
        String empty = scan.nextLine();
        while (j < 1) {
            System.out.println("Do you wanna create a medal for the challenge?" +
                    "\n 1. Yes" +
                    "\n 2. No");

            option = scan.nextInt();

            System.out.println("-----------------------------------");

            if (option == 1) {
                if (positionChallenge[listNumber - 2] == 1) {
                    commentChallenge[commentChallengeN -2].createMedal();
                } else if (positionChallenge[listNumber - 2] == 2) {
                    watchChallenge[watchChallengeN -2].createMedal();
                } else if (positionChallenge[listNumber - 2] == 3) {
                    rankChallenge[rankChallengeN -2].createMedal();
                }

                System.out.println("-----------------------------------");
            } else if(option != 1 && option != 2){
                System.out.println("Pls, select a valid option" +
                        "\n -----------------------------------");
                j--;
            }
            j++;
        }

    }

    public static void lessChallenge(){

        int count = 0;
        int aux = 0;
        boolean match = false;

        String empty = scan.nextLine();
        while (aux <1){

            System.out.println("Whats the challenges's name you wanna delete?");

            String Moviename = scan.nextLine();

            System.out.println("-----------------------------------");

            for (int i = 0; i < challengeList.length; i++){
                String challengeName = challengeList[i];
                if (Moviename.equals(challengeName)){
                    if (positionChallenge[i] == 1){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 1) {
                                count ++;
                            }
                        }
                        commentChallenge[count].deleteChallenge();

                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(challengeName)){
                                    trueChallenges[d]= null;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){}



                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        watchChallenge[count].deleteChallenge();
                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(challengeName)){
                                    trueChallenges[d]= null;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){}



                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 3) {
                                count ++;
                            }
                        }
                        rankChallenge[count].deleteChallenge();
                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(challengeName)){
                                    trueChallenges[d]= null;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){}

                    }

                    match = true;
                }

            }

            if (match == false){
                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                            "\n 1. yes" +
                            "\n 2. no");
                    option = scan.nextInt();

                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        aux--;
                    } else if (option != 2) {
                        System.out.println("Pls, select a valid option" +
                                "\n -----------------------------------");
                        aux2--;
                    }
                    aux2++;
                }
            }
            aux++;
        }
        System.out.println("-----------------------------------");
    }

    public static void restoreChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;
        String empty = scan.nextLine();

        while (aux <1){
            System.out.println("Whats the challenge's name you wanna restore?");

            String Moviename = scan.nextLine();

            System.out.println("-----------------------------------");

            for (int i = 0; i < challengeList.length; i++){
                String challengeName = challengeList[i];
                if (Moviename.equals(challengeName)){
                    if (positionChallenge[i] == 1){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 1) {
                                count ++;
                            }
                        }
                        commentChallenge[count].restoreChallenge();
                        String name = challengeName;
                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                if (trueChallenges[d] == null){
                                    trueChallenges[d]= name;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){
                            System.out.println("Something gone wrong" +
                                    "\n-----------------------------------");

                        }



                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        watchChallenge[count].restoreChallenge();
                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                if (trueChallenges[d] == null){
                                    trueChallenges[d]= challengeName;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){
                            System.out.println("Something gone wrong" +
                                    "\n -----------------------------------");
                        }

                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 3) {
                                count ++;
                            }
                        }
                        rankChallenge[count].restoreChallenge();
                        try{
                            for (int d= 0; d < trueChallenges.length; d++){
                                if (trueChallenges[d] == null){
                                    trueChallenges[d]= challengeName;
                                    d = trueChallenges.length;
                                }
                            }
                        } catch (java.lang.NullPointerException e){
                            System.out.println("Something gone wrong" +
                                    "\n -----------------------------------");
                        }

                    }

                    match = true;
                }

            }

            if (match == false){
                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                            "\n 1. yes" +
                            "\n 2. no");
                    option = scan.nextInt();

                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        aux--;
                    } else if (option != 2) {
                        System.out.println("Pls, select a valid option" +
                                "\n -----------------------------------");
                        aux2--;
                    }
                    aux2++;
                }
            }
            aux++;
        }
        System.out.println("-----------------------------------");
    }

    public static void checkmChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux < 1){
            System.out.println("Whats the challenge's name you wanna check?");
            String empty = scan.nextLine();
            String Moviename = scan.nextLine();

            System.out.println("-----------------------------------");

            for (int i = 0; i < challengeList.length; i++){
                String challengeName = challengeList[i];
                if (Moviename.equals(challengeName)){
                    if (positionChallenge[i] == 1){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 1) {
                                count ++;
                            }
                        }
                        commentChallenge[count].checkChallenge();
                        System.out.println("-----------------------------------");

                        int aux2 = 0;

                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            System.out.println("-----------------------------------");
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }

                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        watchChallenge[count].checkChallenge();
                        System.out.println("-----------------------------------");

                        int aux2 = 0;

                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();

                            System.out.println("-----------------------------------");

                            if (option == 1) {
                                watchChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }
                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 3) {
                                count ++;
                            }
                        }
                        rankChallenge[count].checkChallenge();
                        System.out.println("-----------------------------------");
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            System.out.println("-----------------------------------");
                            if (option == 1) {
                                rankChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }
                    }

                    match = true;
                }

            }

            if (match == false){
                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                            "\n 1. yes" +
                            "\n 2. no");
                    option = scan.nextInt();
                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        aux--;
                    } else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option" +
                                "\n -----------------------------------");
                        aux2--;
                    }
                    aux2++;
                }
            }

            aux++;
        }
        System.out.println("-----------------------------------");
    }

    public static void checkmyChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;
        String empty = scan.nextLine();
        while (aux <1){

            System.out.println("What's the challenge's name you wanna check?");

            String Moviename = scan.nextLine();
            System.out.println("-----------------------------------");

            for (int i = 0; i < challengeList.length; i++){
                String challengeName = challengeList[i];
                if (Moviename.equals(challengeName)){
                    if (positionChallenge[i] == 1){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 1) {
                                count ++;
                            }
                        }
                        commentChallenge[count].checkMyChallenge();
                        System.out.println("-----------------------------------");
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            System.out.println("-----------------------------------");
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }

                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }


                        watchChallenge[count].checkMyChallenge();
                        System.out.println("-----------------------------------");

                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            System.out.println("-----------------------------------");
                            if (option == 1) {
                                watchChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }
                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 3) {
                                count ++;
                            }
                        }
                        rankChallenge[count].checkMyChallenge();
                        System.out.println("-----------------------------------");
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            System.out.println("-----------------------------------");
                            if (option == 1) {
                                rankChallenge[count].checkMedal();
                                System.out.println("-----------------------------------");
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option" +
                                        "\n -----------------------------------");
                                aux2--;
                            }
                            aux2++;
                        }
                    }

                    match = true;
                }

            }

            if (match == false){
                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                            "\n 1. yes" +
                            "\n 2. no");
                    option = scan.nextInt();
                    System.out.println("-----------------------------------");
                    if (option == 1) {
                        aux--;
                    } else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option" +
                                "\n -----------------------------------");
                        aux2--;
                    }
                    aux2++;
                }
            }
            aux++;
        }
    }

    public static void rewriteChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux <1){

            System.out.println("Whats the challenge's name you wanna rewrite?");
            String empty = scan.nextLine();
            String Moviename = scan.nextLine();
            System.out.println("-----------------------------------");



            System.out.println("What do you wanna rewrite?" +
                    "\n 1. Challenge's name and descriptoin" +
                    "\n 2. Medal");

            option = scan.nextInt();
            System.out.println("-----------------------------------");


            if (option == 1) {

                for (int i = 0; i < challengeList.length; i++) {
                    String challengeName = challengeList[i];
                    if (Moviename.equals(challengeName)) {

                        match = true;

                        if (positionChallenge[i] == 1) {
                            for (int j = 0; j < i; j++) {
                                if (positionChallenge[j] == 1) {
                                    count++;
                                }
                            }
                            commentChallenge[count].rewriteChallenge();
                            challengeList[i] = commentChallenge[count].challengeName;

                            try{
                                for (int d= 0; d < trueChallenges.length; d++){
                                    String name = trueChallenges[d];
                                    if (name == challengeName){
                                        trueChallenges[d]= commentChallenge[count].challengeName;
                                        d = trueChallenges.length;
                                    }
                                }
                            } catch (java.lang.NullPointerException e){}


                        } else if (positionChallenge[i] == 2) {
                            for (int j = 0; j < i; j++) {
                                if (positionChallenge[j] == 2) {
                                    count++;
                                }
                            }
                            watchChallenge[count].rewriteChallenge();
                            challengeList[i] = watchChallenge[count].challengeName;
                            try{
                                for (int d= 0; d < trueChallenges.length; d++){
                                    String name = trueChallenges[d];
                                    if (name == challengeName){
                                        trueChallenges[d]= watchChallenge[count].challengeName;
                                        d = trueChallenges.length;
                                    }
                                }
                            } catch (java.lang.NullPointerException e){}

                        } else if (positionChallenge[i] == 3) {
                            for (int j = 0; j < i; j++) {
                                if (positionChallenge[j] == 3) {
                                    count++;
                                }
                            }
                            rankChallenge[count].rewriteChallenge();
                            challengeList[i] = rankChallenge[count].challengeName;
                            try{
                                for (int d= 0; d < trueChallenges.length; d++){
                                    String name = trueChallenges[d];
                                    if (name == challengeName){
                                        trueChallenges[d]= rankChallenge[count].challengeName;
                                        d = trueChallenges.length;
                                    }
                                }
                            } catch (java.lang.NullPointerException e){}

                        }

                        i = challengeList.length;
                    }

                }

                if (match == false) {
                    int aux2 = 0;
                    while (aux2 < 1) {
                        System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                                "\n 1. yes" +
                                "\n 2. no");
                        option = scan.nextInt();
                        System.out.println("-----------------------------------");
                        if (option == 1) {
                            aux--;
                        } else if (option != 1 && option != 2) {
                            System.out.println("Pls, select a valid option" +
                                    "\n -----------------------------------");
                            aux2--;
                        }
                        aux2++;
                    }
                }

            }else if(option == 2){
                for (int i = 0; i < challengeList.length; i++) {
                    String challengeName = challengeList[i];


                    if (Moviename.equals(challengeName)) {

                        boolean notDeleted = false;
                        match = true;

                        for (int m = 0; m < trueChallenges.length; m++) {
                            if (trueChallenges[m] == challengeName) {
                                notDeleted = true;
                                m = trueChallenges.length;
                            }
                        }

                        if (notDeleted) {

                            if (positionChallenge[i] == 1) {
                                for (int j = 0; j < i; j++) {
                                    if (positionChallenge[j] == 1) {
                                        count++;
                                    }
                                }
                                int aux2 = 0;
                                while (aux2 < 1) {
                                    System.out.println("What action will you do?" +
                                            "\n 1. Change medal information (or create one)" +
                                            "\n 2. Delete medal");

                                    option = scan.nextInt();
                                    System.out.println("-----------------------------------");
                                    if (option == 1) {
                                        commentChallenge[count].createMedal();
                                    } else if (option == 2) {
                                        commentChallenge[count].deleteMedal();
                                    } else {
                                        System.out.println("Pls, select a valid option" +
                                                "\n -----------------------------------");
                                        aux2--;
                                    }
                                    aux2++;
                                }

                            } else if (positionChallenge[i] == 2) {
                                for (int j = 0; j < i; j++) {
                                    if (positionChallenge[j] == 2) {
                                        count++;
                                    }
                                }

                                int aux2 = 0;
                                while (aux2 < 1) {
                                    System.out.println("What action will you do?" +
                                            "\n 1. Change medal information (or create one)" +
                                            "\n 2. Delete medal");

                                    option = scan.nextInt();
                                    System.out.println("-----------------------------------");
                                    if (option == 1) {
                                        watchChallenge[count].createMedal();
                                    } else if (option == 2) {
                                        watchChallenge[count].deleteMedal();
                                    } else {
                                        System.out.println("Pls, select a valid option" +
                                                "\n -----------------------------------");
                                        aux2--;
                                    }
                                    aux2++;
                                }

                            } else if (positionChallenge[i] == 3) {
                                for (int j = 0; j < i; j++) {
                                    if (positionChallenge[j] == 3) {
                                        count++;
                                    }
                                }

                                int aux2 = 0;
                                while (aux2 < 1) {
                                    System.out.println("What action will you do?" +
                                            "\n 1. Change medal information (or create one)" +
                                            "\n 2. Delete medal");

                                    option = scan.nextInt();
                                    System.out.println("-----------------------------------");
                                    if (option == 1) {
                                        rankChallenge[count].createMedal();
                                    } else if (option == 2) {
                                        rankChallenge[count].deleteMedal();
                                    } else {
                                        System.out.println("Pls, select a valid option" +
                                                "\n -----------------------------------");
                                        aux2--;
                                    }
                                    aux2++;
                                }
                            }

                            i = challengeList.length;
                        } else {
                            System.out.println("This challenge has been deleted, pls restore it before you rewrite it" +
                                    "\n -----------------------------------");
                        }
                    }

                }

                if (!match) {
                    int aux2 = 0;
                    while (aux2 < 1) {
                        System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                                "\n 1. yes" +
                                "\n 2. no");

                        option = scan.nextInt();
                        System.out.println("-----------------------------------");
                        if (option == 1) {
                            aux--;
                        } else if (option != 2) {
                            System.out.println("Pls, select a valid option" +
                                    "\n -----------------------------------");
                            aux2--;
                        }
                        aux2++;
                    }
                }
            } else {
                System.out.println("Pls, select a valid option" +
                        "\n -----------------------------------");
                aux--;
            }
            aux++;
        }
        System.out.println("-----------------------------------");
    }
}