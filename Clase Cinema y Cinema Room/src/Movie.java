public class Movie {
    private String name;
    private String category;
    private String classification;
    private String language;
    private String type;
    private int views;
    private int lengthMinutes;
    private int rank;
    private String premiereDate;

    public Movie(String name, String category, String classification, String language,String type, int lengthMinutes, String premiereDate){
        this.name = name;
        this.category = category;
        this.classification = classification;
        this.language = language;
        this.type = type;
        this.lengthMinutes = lengthMinutes;
        this.premiereDate = premiereDate;
    }

    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("***************");
        sb.append("\n" + name);
        sb.append(" " + type);
        sb.append("\n---------------");
        sb.append("\nLanguage: " + language);
        sb.append("\nClassification: " + classification);
        sb.append("\nCategory: " + category);
        sb.append("\nTime: " + lengthMinutes );
        sb.append("\n***************");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

}
