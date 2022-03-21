package com.company;

public class CommentChallenge extends Challenge{

    public static double comments;
    public static double pointsPerComment;

    public CommentChallenge(double comments){
        this.comments = comments;
    }


    public void statusPlusOne(boolean done){
        if (done){
            Status+=pointsPerComment;
        }
    }

    @Override
    protected void pointsRepartition() {
        pointsPerComment = neededPoints/comments;
    }

}
