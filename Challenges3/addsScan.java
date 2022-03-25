package ChallengesScan;

import javax.swing.*;
import java.util.Scanner;

public class addsScan {
    private static int option;
    static Scanner scan = new Scanner(System.in);


    static int commentChallengeN = 1;
    static int watchChallengeN = 1;
    static int rankChallengeN = 1;
    static Challenge[] commentChallenge = new CommentChallenge[100];
    static Challenge[] watchChallenge = new WatchMovieChallenge[100];
    static Challenge[] rankChallenge = new RankChallenge[100];

    static int listNumber = 1;

    static int[] positionChallenge = new int[300];

    static String[] challengeList = new String[300];

    static String[] trueChallenges = new String[300];



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
                     6. Check the Challenge list""");

                option = scan.nextInt();

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
                    for(int n = 0 ; n < challengeList.length; n++) {
                        if (trueChallenges[n] != null) {
                            System.out.println(n+1 + ".- " + trueChallenges[n]);
                        }
                    }
                } else {
                    System.out.println("Pls, select a valid option");
                }

                int aux2 = 0;
                while (aux2 < 1) {

                    System.out.println("Finished action, do you wanna continue?" +
                            "\n 1. yes" +
                            "\n 2. no");

                    option = scan.nextInt();
                    if (option == 1) {
                        i--;
                    }  else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option");
                        aux2--;
                    }
                    aux2++;
                }
            }catch (java.util.InputMismatchException e){
                System.out.println("You've put a not allowed option, pls try again");
            }
            i++;
        }
    }

    public static void challengeControlus(){
        int i = 0;
        while (i < 1) {
            try{
                System.out.println("""
                    What do you wanna do?
                     1. Check my challenge progress
                     2. Check the Challenge list""");


                option = scan.nextInt();

                if (option == 1) {
                    addsScan.checkmyChallenge();
                } else if (option == 2) {
                    for (int n = 0; n < challengeList.length; n++) {
                        if (trueChallenges[n] != null) {
                            System.out.println(n + 1 + ".- " + trueChallenges[n]);
                        }
                    }
                } else {
                    System.out.println("Pls, select a valid option");
                }

                int aux2 = 0;
                while (aux2 < 1) {
                    System.out.println("Finished action, do you wanna continue?" +
                            "\n 1. yes" +
                            "\n 2. no");

                    option = scan.nextInt();
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

            if (option == 1) {
                commentChallenge[commentChallengeN -1] = new CommentChallenge();
                commentChallenge[commentChallengeN -1].createChallenge();
                name = commentChallenge[commentChallengeN -1].challengeName;

                commentChallengeN++;
                listNumber++;

            } else if (option == 2) {
                watchChallenge[watchChallengeN -1] = new WatchMovieChallenge();
                watchChallenge[watchChallengeN -1].createChallenge();
                name = watchChallenge[watchChallengeN -1].challengeName;

                watchChallengeN++;
                listNumber++;

            } else if (option == 3) {
                rankChallenge[rankChallengeN -1] = new RankChallenge();
                rankChallenge[rankChallengeN -1].createChallenge();
                name = rankChallenge[rankChallengeN -1].challengeName;

                rankChallengeN++;
                listNumber++;

            } else {
                System.out.println("Pls, select a valid option");
                i--;
            }

            i++;
        }
        challengeList[listNumber - 2] = name;

        for (int d= 0; d < trueChallenges.length; d++){
            if (trueChallenges[d] == null){
                trueChallenges[d]= name;
                d = trueChallenges.length;
            }
        }
        positionChallenge[listNumber -2] = option;

        int j = 0;
        while (j < 1) {
            System.out.println("Do you wanna create a medal for the challenge?" +
                    "\n 1. Yes" +
                    "\n 2. No");

            option = scan.nextInt();

            if (option == 1) {
                if (positionChallenge[listNumber - 2] == 1) {
                    commentChallenge[commentChallengeN -2].createMedal();
                } else if (positionChallenge[listNumber - 2] == 2) {
                    watchChallenge[watchChallengeN -2].createMedal();
                } else if (positionChallenge[listNumber - 2] == 3) {
                    rankChallenge[rankChallengeN -2].createMedal();
                }
            } else if(option != 1 && option != 2){
                System.out.println("Pls, select a valid option");
                j--;
            }
            j++;
        }
    }

    public static void lessChallenge(){

        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux <1){

            System.out.println("Whats the challenges's name you wanna delete?");
            String Moviename = scan.nextLine();
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


                        for (int d= 0; d < trueChallenges.length; d++){
                            String name = trueChallenges[d];
                            if (name.equals(challengeName)){
                                trueChallenges[d]= null;
                                d = trueChallenges.length;
                            }
                        }

                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        watchChallenge[count].deleteChallenge();
                        for (int d= 0; d < trueChallenges.length; d++){
                            String name = trueChallenges[d];
                            if (name.equals(challengeName)){
                                trueChallenges[d]= null;
                                d = trueChallenges.length;
                            }
                        }

                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        rankChallenge[count].deleteChallenge();
                        for (int d= 0; d < trueChallenges.length; d++){
                            String name = trueChallenges[d];
                            if (name.equals(challengeName)){
                                trueChallenges[d]= null;
                                d = trueChallenges.length;
                            }
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
                    if (option == 1) {
                        aux--;
                    } else if (option != 2) {
                        System.out.println("Pls, select a valid option");
                        aux2--;
                    }
                    aux2++;
                }
            }
            aux++;
        }
    }

    public static void restoreChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux <1){
            System.out.println("Whats the challenge's name you wanna restore?");

            String Moviename = scan.nextLine();

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

                    } else if (positionChallenge[i] == 2){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        watchChallenge[count].restoreChallenge();
                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        rankChallenge[count].restoreChallenge();
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
                    if (option == 1) {
                        aux--;
                    } else if (option != 2) {
                        System.out.println("Pls, select a valid option");
                        aux2--;
                    }
                    aux2++;
                }
            }
            aux++;
        }
    }

    public static void checkmChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux <1){
            System.out.println("Whats the challenges's name you wanna check?");
            String Moviename = scan.nextLine();

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

                        int aux2 = 0;

                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
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

                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
                                aux2--;
                            }
                            aux2++;
                        }
                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        rankChallenge[count].checkChallenge();
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
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
                    if (option == 1) {
                        aux--;
                    } else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option");
                        aux2--;
                    }
                    aux2++;
                }
            }

            aux++;
        }
    }

    public static void checkmyChallenge(){
        int count = 0;
        int aux = 0;
        boolean match = false;

        while (aux <1){

            System.out.println("What's the challenge's name you wanna check?");
            String Moviename = scan.nextLine();

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
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
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

                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
                                aux2--;
                            }
                            aux2++;
                        }
                    } else if (positionChallenge[i] == 3){
                        for (int j = 0; j < i; j++){
                            if (positionChallenge[j] == 2) {
                                count ++;
                            }
                        }
                        rankChallenge[count].checkMyChallenge();
                        int aux2 = 0;
                        while (aux2 < 1) {

                            System.out.println("Do you want to check this challenge's medal?" +
                                    "\n 1. yes" +
                                    "\n 2. no");

                            option = scan.nextInt();
                            if (option == 1) {
                                commentChallenge[count].checkMedal();
                            } else if (option != 1 && option != 2) {
                                System.out.println("Pls, select a valid option");
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
                    if (option == 1) {
                        aux--;
                    } else if (option != 1 && option != 2) {
                        System.out.println("Pls, select a valid option");
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
            String Moviename = scan.nextLine();

            System.out.println("What do you wanna rewrite?" +
                    "\n 1. Challenge's name and descriptoin" +
                    "\n 2. Medal");

            option = scan.nextInt();


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
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(null)){
                                    trueChallenges[d]= challengeName;
                                    d = trueChallenges.length;
                                }
                            }


                        } else if (positionChallenge[i] == 2) {
                            for (int j = 0; j < i; j++) {
                                if (positionChallenge[j] == 2) {
                                    count++;
                                }
                            }
                            watchChallenge[count].rewriteChallenge();
                            challengeList[i] = watchChallenge[count].challengeName;
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(null)){
                                    trueChallenges[d]= challengeName;
                                    d = trueChallenges.length;
                                }
                            }
                        } else if (positionChallenge[i] == 3) {
                            for (int j = 0; j < i; j++) {
                                if (positionChallenge[j] == 2) {
                                    count++;
                                }
                            }
                            rankChallenge[count].rewriteChallenge();
                            challengeList[i] = rankChallenge[count].challengeName;
                            for (int d= 0; d < trueChallenges.length; d++){
                                String name = trueChallenges[d];
                                if (name.equals(null)){
                                    trueChallenges[d]= challengeName;
                                    d = trueChallenges.length;
                                }
                            }
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
                        if (option == 1) {
                            aux--;
                        } else if (option != 1 && option != 2) {
                            System.out.println("Pls, select a valid option");
                            aux2--;
                        }
                        aux2++;
                    }
                }
            }else if(option == 2){
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
                            int aux2 = 0;
                            while (aux2 < 1) {
                                System.out.println("What action will you do?" +
                                        "\n 1. Change medal information (or create one)" +
                                        "\n 2. Delete medal");

                                option = scan.nextInt();
                                if (option == 1) {
                                    commentChallenge[count].createMedal();
                                } else if (option == 2) {
                                    commentChallenge[count].deleteMedal();
                                } else {
                                    System.out.println("Pls, select a valid option");
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
                                if (option == 1) {
                                    commentChallenge[count].createMedal();
                                } else if (option == 2) {
                                    commentChallenge[count].deleteMedal();
                                } else {
                                    System.out.println("Pls, select a valid option");
                                    aux2--;
                                }
                                aux2++;
                            }

                        } else if (positionChallenge[i] == 3) {
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
                                if (option == 1) {
                                    commentChallenge[count].createMedal();
                                } else if (option == 2) {
                                    commentChallenge[count].deleteMedal();
                                } else {
                                    System.out.println("Pls, select a valid option");
                                    aux2--;
                                }
                                aux2++;
                            }
                        }

                        i = challengeList.length;
                    }

                }

                if (!match) {
                    int aux2 = 0;
                    while (aux2 < 1) {
                        System.out.println("This challenge doesn't match whit the challenge's list, do you wanna try again?" +
                                "\n 1. yes" +
                                "\n 2. no");

                        option = scan.nextInt();
                        if (option == 1) {
                            aux--;
                        } else if (option != 2) {
                            System.out.println("Pls, select a valid option");
                            aux2--;
                        }
                        aux2++;
                    }
                }
            } else {
                System.out.println("Pls, select a valid option");
                aux--;
            }
            aux++;
        }
    }
}
