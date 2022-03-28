package Cinema;

import java.util.ArrayList;

public class Movie {
    private String name;
    private String category;
    private String classification;
    public ArrayList<String> comments;//possible class
    private String languages;
    private String type;
    private int views;
    private int lengthMinutes;
    private int rankCounter;
    private double rank;
    private String premierDate;
    private int totalRank ;

    public Movie(String name, String category, String classification, String languages, String type, int lengthMinutes,String premierDate){
        this.name = name;
        this.category = category;
        this.classification = classification;
        this.languages = languages;
        this.type = type;
        this.lengthMinutes = lengthMinutes;
        this.premierDate = premierDate;
        comments = new ArrayList<String>();
        rankCounter = 0;
        rank = 0;
        totalRank = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }


    public void setLanguages(String languages){
        this.languages = languages;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setViews(int views){
        this.views = views;
    }

    public void setLengthMinutes (int lengthMinutes){
        this.lengthMinutes = lengthMinutes;
    }


    public void setPremierDate (String premierDate){
        this.premierDate = premierDate;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getClassification() {
        return classification;
    }


    public ArrayList<String> getComments() {
        return comments;
    }

    public void addComment(String name, String comment){
        String str = "****************************" +
                name+
                comment+
                "*****************************";
        comments.add(str);
    }

    public void removeComment(int i){
        comments.remove(i);
    }

    public String getLanguages() {
        return languages;
    }

    public String getType() {
        return type;
    }

    public int getViews() {
        return views;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public String getPremierDate() {
        return premierDate;
    }

    public void addRank(double i){
        totalRank += i;
        rankCounter++;
    }

    public double getRank() {
        rank = totalRank/rankCounter;
        return rank;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("*******************");
        sb.append("\n" +name);
        sb.append(" " + type);
        sb.append("\n-------------------------");
        sb.append("\nLanguage: ");
        sb.append(languages);
        sb.append("\nClassification: ");
        sb.append(classification);
        sb.append("\nCategory: ");
        sb.append(category);
        sb.append("\nTime: ");
        sb.append(lengthMinutes);
        sb.append("\n Rank: ");
        sb.append(getRank());

        sb.append("\n*******************");

        return sb.toString();
    }

    public String getAllComments(){
        String comment ="";
        for(String str : comments){
            comment += "********************************\n" + str;
        }
        return comment;
    }

    public String getMovieRank(){
        String res;
        return "";

    }
}
