package com.company;

import javax.swing.*;

public class CommentChallenge extends Challenge{


    public CommentChallenge(){
    }

    @Override
    public void createChallenge(){
        challengeName = JOptionPane.showInputDialog("Challenge name");;
        challengeDescription = JOptionPane.showInputDialog("Challenge description");
        neededPoints = Integer.parseInt(JOptionPane.showInputDialog("How many comments do you need to finish this challenge"));
        prize = JOptionPane.showInputDialog("Related prize");
        deletedChallenge  = false;
    }

    @Override
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
                        + "\n Actual comments: " + Status
                        + "\n You need to comment " + neededPoints + " times to finish this challenge"
                        + "\n Prize: " + prize);

                if (medalCreated) {
                    System.out.println("Once you finish this challenge you can get: " + medal);
                }
            }
        }
    }

}
