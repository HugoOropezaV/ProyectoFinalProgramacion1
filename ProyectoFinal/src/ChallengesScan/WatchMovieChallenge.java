package ChallengesScan;

import javax.swing.*;

public class WatchMovieChallenge extends Challenge{
    public String[] moviesToWatch;


    public WatchMovieChallenge(){
    }

    @Override
    public void createChallenge() {
        System.out.println("Challenge name");
        challengeName = scan.nextLine();
        System.out.println("Challenge description");
        challengeDescription = scan.nextLine();
        System.out.println("How many movies do you need to watch to finish this challenge");
        neededPoints = scan.nextInt();
        for (int j = 0; j < 1; j++){
            System.out.println("Do you wanna add a list of movies?"
                    + "\n 1. Yes" +
                    "\n 2. No");
            int n = scan.nextInt();

            if (n == 1) {
                moviesToWatch = new String[neededPoints];

                String empty = scan.nextLine();
                for (int i = 0; i < neededPoints; i++) {
                    int aux = i +1;
                    System.out.println("Write the name of the " + aux + "º " + "movie");
                    moviesToWatch[i] = scan.nextLine();
                }

                moviesToWatchCheck = true;

            } else if (n != 1 && n != 2) {
                j = 0;
            }
        }
        System.out.println("Related prize");
        prize = scan.nextLine();
        deletedChallenge  = false;
    }

    @Override
    public void checkMyChallenge(){
        if (deletedChallenge) {
            System.out.println("This challenge doesn't exist or has been deleted");

        } else {

            if (neededPoints == Status) {
                complited = true;

            }
            if (complited) {
                System.out.println(challengeName
                        + "\n Description: " + challengeDescription
                        + "\n YOU'VE ACTUALLY FINISHED THIS CHALLENGE :D");
                if (medalCreated) {
                    System.out.println(medal);
                }
            } else {
                System.out.println(challengeName
                        + "\n Description: " + challengeDescription + " "
                        + "\n Actual watched movies: " + Status
                        + "\n You need to get " + neededPoints + " points to finish this challenge"
                        + "\n Prize: " + prize);

                if (medalCreated) {
                    System.out.println("Once you finish this challenge you can get: " + medal);
                }

                if (moviesToWatchCheck) {
                    System.out.println("You have to watch the next movies: ");

                    for (int i = 0; i< moviesToWatch.length; i++){
                        System.out.println(moviesToWatch[i]);
                    }
                }
            }
        }
    }

    @Override
    public void checkChallenge(){

        if (deletedChallenge) {
            System.out.println("This challenge doesn't exist or has been deleted");

        } else {
            System.out.println(challengeName
                    + "\n Description: " + challengeDescription + " "
                    + "\n Needed movies viewed to win: " + neededPoints
                    + "\n Prize: " + prize);
            if (moviesToWatchCheck) {
                System.out.println("Movies to watch: ");

                for (int i = 0; i < moviesToWatch.length; i++) {
                    System.out.println(i+1 +".- " +moviesToWatch[i]);
                }
            }
            if (medalCreated) {
                System.out.println("Related medal: " + medal);
            }
        }
    }

    @Override
    public void rewriteChallenge(){
        if (deletedChallenge){
            System.out.println("This challenge has been deleted, pls restore it before you rewrite it");
        } else {
            System.out.println("New challenge name");
            challengeName = scan.nextLine();
            System.out.println("New challenge description");
            challengeDescription = scan.nextLine();
            System.out.println("How many points do ypu need to complete the challenge");
            neededPoints = scan.nextInt();
            for (int j = 0; j < 1; j++) {
                System.out.println("Do you wanna add a list of movies?"
                        + "\n 1. Yes" +
                        "\n 2. No");
                int n = scan.nextInt();

                if (n == 1) {
                    moviesToWatch = new String[neededPoints];
                    String empty = scan.nextLine();
                    for (int i = 0; i < neededPoints; i++) {
                        int aux = i + 1;
                        System.out.println("Write the name of the " + aux + "º " + "movie");
                        moviesToWatch[i] = scan.nextLine();
                    }
                    moviesToWatchCheck = true;

                } else if (n != 1 && n != 2) {
                    j = 0;
                }
            }
            String empty = scan.nextLine();
            System.out.println("Related prize");
            prize = scan.nextLine();

            deletedChallenge = false;
        }
    }
}
