import java.util.Date;

public class Movie {
    private String name;
    private String category;
    private String classification;
    private String[] comments;//possible class
    private String languages;
    private String type;
    private int views;
    private int lengthMinutes;
    private int rank;
    private String premierDate;

    public Movie(String name, String category, String classification, String languages, String type, int lengthMinutes,String premierDate){
        this.name = name;
        this.category = category;
        this.classification = classification;
        this.languages = languages;
        this.type = type;
        this.lengthMinutes = lengthMinutes;
        this.premierDate = premierDate;
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

    public  void setComments(String[] comments){
        this.comments = comments;
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

    public void setRank(int rank){
        this.rank = rank;
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

    public String[] getComments() {
        return comments;
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

    public int getRank() {
        return rank;
    }

    public String getPremierDate() {
        return premierDate;
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
        sb.append("\n*******************");
        return sb.toString();
    }
}
