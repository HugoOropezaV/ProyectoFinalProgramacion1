package com.company;

public interface IChallengeManager {


    public void createMedal(String medalName, String medalDescription);
    public void checkMedal();
    public void deleteMedal();

    void createChallenge(String challengeName, String description, double points, String prize);
    public void checkChallenge();
    public void deleteChallenge();
    public void rewriteChallenge(String challengeName, String description, int points, String prize);
    public void restoreChallenge();


}
