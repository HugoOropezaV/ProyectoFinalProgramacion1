package com.company;

public abstract class Challenge implements IChallengeManager{
    protected static String challengeName;
    protected static String challengeDescription;
    protected static boolean deletedChallenge = false;
    protected static String prize;
    protected static boolean complited = false;
    protected static double Status = 0;
    protected static double neededPoints;

    protected static String medal;
    protected static String medalDescription;
    protected static boolean medalCreated = false;



    public Challenge(){
    }

    @Override
    public void createChallenge(String challengeName, String description, double points, String prize){
        this.challengeDescription = description;
        this.neededPoints = points;
        this.challengeName = challengeName;
        this.prize = prize;
        deletedChallenge  = false;
    }

    @Override
    public void createMedal(String medalName, String medalDescription){
        this.medal = medalName;
        this.medalDescription = medalDescription;
        medalCreated = true;
    }

    @Override
    public void checkChallenge(){

        if (deletedChallenge) {
            System.out.println("This challenge has been deleted");

        } else {
            System.out.println(challengeName
                    + "\n Description: " + challengeDescription + " "
                    + "\n Needed points to win" + neededPoints
                    + "\n Prize: " + prize);

            if (medalCreated) {
                System.out.println("Related medal: " + medal);
            }
        }
    }

    protected void checkMyChallenge(){
        if (deletedChallenge) {
            System.out.println("This challenge has been deleted");

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
    public void rewriteChallenge(String challengeName, String description, int points, String prize){
        this.challengeDescription = description;
        this.neededPoints = points;
        this.challengeName = challengeName;
        this.prize = prize;
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

    protected abstract void statusPlusOne(boolean done);
    protected abstract void pointsRepartition();
}
