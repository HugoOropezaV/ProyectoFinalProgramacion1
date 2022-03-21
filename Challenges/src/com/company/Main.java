package com.company;

public class Main {

    public static void main(String[] args) {

        //ejemplo

        Challenge challenge = new RankChallenge(5);

        challenge.createChallenge("Teleton", "Rankea 25 veces",100 , "1000 bolivares");
        challenge.pointsRepartition();


        challenge.createMedal("Medallín", "Esta medalla te hace guapo");

        challenge.statusPlusOne(true);
        challenge.statusPlusOne(true);
        challenge.statusPlusOne(true);


        challenge.checkMyChallenge();
        System.out.println("\n");

        challenge.deleteChallenge();

        challenge.deleteChallenge();





    }
}
