package ChallengesScan;

import javax.swing.*;

public class CommentChallenge extends Challenge{


    public CommentChallenge(){
    }

    @Override
    public void createChallenge(){
        System.out.println("Challenge name");
        challengeName = scan.nextLine();
        System.out.println("Challenge description");
        challengeDescription = scan.nextLine();
        System.out.println("How many comments do you need to finish this challenge");
        neededPoints = scan.nextInt();
        String empty = scan.nextLine();
        System.out.println("Related prize");
        prize = scan.nextLine();
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

    public void rewriteChallenge(){
        if (deletedChallenge){
            System.out.println("This challenge has been deleted, pls restore it before you rewrite it");
        } else {
            System.out.println("New challenge name");
            challengeName = scan.nextLine();
            System.out.println("New challenge description");
            challengeDescription = scan.nextLine();
            System.out.println("How many comments do you need to finish this challenge");
            neededPoints = scan.nextInt();
            String empty = scan.nextLine();
            System.out.println("Related prize");
            prize = scan.nextLine();
        }
    }

}
