package Users;

public class MyValues {
    public static String[] category = {"action", "comedy", "drama", "fantasy", "horror,", "mystery", "romance", "thriller", "western"};
    //
    public static String[] classification = {"green", "yellow", "blue", "orange", "red", "white"};
    public static String[] languaje  = {"spanish", "english","english with subtitles"};

    public static String getCategoryOptions(){
        String res = "";
        for(int i = 0; i < category.length; i++){
            res += (i+1) + ". " + category[i] + "\n";
        }
        return res;
    }
    public static String getLanguageOptions(){
        String res = "";
        for(int i = 0; i < languaje.length; i++){
            res += (i+1) + ". " + languaje[i] + "\n";
        }
        return res;
    }
    public static String getClassificationOptions(){
        String res = "";
        for(int i = 0; i < classification.length; i++){
            res += (i+1) + ". " + classification[i] + "\n";
        }
        return res;
    }
}
