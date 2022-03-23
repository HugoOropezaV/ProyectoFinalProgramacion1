package com.company;

import javax.swing.*;

public abstract class Challenge implements IChallengeManager{
    protected String challengeName;
    protected String challengeDescription;
    protected boolean deletedChallenge = true;
    protected String prize;
    protected boolean complited = false;
    protected static int Status;
    protected int neededPoints;

    protected String medal;
    protected String medalDescription;
    protected boolean medalCreated = false;



    public Challenge(){
    }

    @Override
    public void createChallenge(){
        challengeName = JOptionPane.showInputDialog("Challenge name");;
        challengeDescription = JOptionPane.showInputDialog("Challenge description");
        neededPoints = Integer.parseInt(JOptionPane.showInputDialog("How many points do ypu need to complete the challenge"));
        prize = JOptionPane.showInputDialog("Related prize");
        deletedChallenge  = false;
    }

    @Override
    public void createMedal(){
        medal = JOptionPane.showInputDialog("Medal Name");
        medalDescription = JOptionPane.showInputDialog("Medal description");
        medalCreated = true;
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

            if (medalCreated) {
                System.out.println("Related medal: " + medal);
            }
        }
    }

    protected void checkMyChallenge(){
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
                        + "\n Actual points: " + Status + " "
                        + "\n You need to get " + neededPoints + " points to finish this challenge"
                        + "\n Prize: " + prize);

                if (medalCreated) {
                    System.out.println("Once you finish this challenge you can get: " + medal);
                }
            }
        }
    }

    @Override
    public void checkMedal(){

        if (medalCreated) {
            System.out.println("Medal: " + medal
                    + "\n" + medalDescription);
        } else {
            System.out.println("There's not a medal related to this challenge");
        }
    }

    @Override
    public void deleteChallenge(){
        if (deletedChallenge){
            System.out.println("This challenge has already been deleted");
        } else {
            deletedChallenge = true;
        }
    }
    @Override
    public void rewriteChallenge(){
        if (deletedChallenge){
            System.out.println("This challenge has been deleted, pls restore it before you rewrite it");
        } else {
            challengeName = JOptionPane.showInputDialog("Challenge name");
            ;
            challengeDescription = JOptionPane.showInputDialog("Challenge description");
            neededPoints = Integer.parseInt(JOptionPane.showInputDialog("How many points do ypu need to complete the challenge"));
            prize = JOptionPane.showInputDialog("Related prize");
        }
    }

    @Override
    public void restoreChallenge(){
        if (deletedChallenge){
            deletedChallenge = false;
        } else {
            System.out.println("This challenge hasn't been deleted");
        }
    }

    @Override
    public void deleteMedal(){
        medalCreated = false;
    }

    protected void statusPlusOne(boolean done) {
        if (done){Status ++;}
    }
}
