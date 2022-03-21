package com.company;

public class WatchMovieChallenge extends Challenge{
    public static String[] moviesToWatch;
    public static double pointsPerMovie;


    public WatchMovieChallenge(String[] moviesToWatch){
        this.moviesToWatch = moviesToWatch;
    }


    @Override
    public void pointsRepartition(){
        pointsPerMovie = neededPoints/moviesToWatch.length;
    }

    @Override
    public void statusPlusOne(boolean done){
        if (done){
            Status += pointsPerMovie;
        }
    }

    @Override
    public void checkMyChallenge(){
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

                System.out.println("You have to watch the next movies: ");

                for (String movie : moviesToWatch){
                    System.out.println(movie);
                }
            }
        }
    }
}
