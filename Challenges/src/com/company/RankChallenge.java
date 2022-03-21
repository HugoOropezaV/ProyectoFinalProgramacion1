package com.company;

public class RankChallenge extends Challenge{

    public static double pointsPerRank;
    public static double numberOfRanks;

    public RankChallenge(double numberOfRanks){
        this.numberOfRanks = numberOfRanks;
    }

    @Override
    public void pointsRepartition(){
        pointsPerRank = neededPoints/numberOfRanks;
    }

    protected void statusPlusOne(boolean done) {
        if (done){
            Status += pointsPerRank;
        }
    }

}


