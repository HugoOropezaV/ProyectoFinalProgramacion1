package com.company;

import javax.swing.*;

public class WatchMovieChallenge extends Challenge{
    public static String[] moviesToWatch;
    public boolean moviesToWatchCheck = false;


    public WatchMovieChallenge(){
    }

    @Override
    public void createChallenge() {
        challengeName = JOptionPane.showInputDialog("Challenge name");
        challengeDescription = JOptionPane.showInputDialog("Challenge description");
        neededPoints = Integer.parseInt(JOptionPane.showInputDialog("How many movies do you need to watch to finish this challenge"));
        for (int j = 0; j < 1; j++){
                int n = Integer.parseInt(JOptionPane.showInputDialog("Do you wanna add a list of movies?"
                        + "\n 1. Yes" +
                        "\n 2. No"));

            if (n == 1) {
                moviesToWatch = new String[neededPoints];
                for (int i = 0; i < neededPoints; i++) {

                    int aux = i +1;
                    moviesToWatch[i] = JOptionPane.showInputDialog("Write the name of the " + aux + "º " + "movie");
                }
                moviesToWatchCheck = true;

            } else if (n != 1 && n != 2) {
                j = 0;
            }
        }

        prize = JOptionPane.showInputDialog("Related prize");
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
                    + "\n Needed points to win: " + neededPoints
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
        challengeName = JOptionPane.showInputDialog("Challenge name");
        challengeDescription = JOptionPane.showInputDialog("Challenge description");
        neededPoints = Integer.parseInt(JOptionPane.showInputDialog("How many movies do you need to watch to finish this challenge"));
        for (int j = 0; j < 1; j++){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Do you wanna add a list of movies?"
                    + "\n 1. Yes" +
                    "\n 2. No"));

            if (n == 1) {
                moviesToWatch = new String[neededPoints];
                for (int i = 0; i < neededPoints; i++) {

                    int aux = i +1;
                    moviesToWatch[i] = JOptionPane.showInputDialog("Write the name of the " + aux + "º " + "movie");
                }
                moviesToWatchCheck = true;

            } else if (n != 1 && n != 2) {
                j = 0;
            }
        }

        prize = JOptionPane.showInputDialog("Related prize");
        deletedChallenge  = false;
    }
}
