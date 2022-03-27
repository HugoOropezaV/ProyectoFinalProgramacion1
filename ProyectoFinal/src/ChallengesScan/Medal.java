package ChallengesScan;

public class    Medal {
    protected String medalDescription;
    protected boolean medalCreated;
    String category ;
    String medalName;

    public Medal(String name, String category, String description){
        this.medalName = name;
        this.category = category;
        this.medalDescription = description;
        medalCreated = true;
    }

    public String getMedalDescription() {
        return medalDescription;
    }

    public void setMedalDescription(String medalDescription) {
        this.medalDescription = medalDescription;
    }

    public boolean isMedalCreated() {
        return medalCreated;
    }

    public void setMedalCreated(boolean medalCreated) {
        this.medalCreated = medalCreated;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getMedalName() {
        return medalName;
    }

    public void setMedalName(String medalName) {
        this.medalName = medalName;
    }
}
