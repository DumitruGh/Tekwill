import java.util.Arrays;

public class Books {
    private String title;
    private int yearOfPublishing;
    private String [] authors;


    public Books(String title, int yearOfPublishing, String[] authors){
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public String toString(){
        String auth = Arrays.toString(authors).replace(" ", "");
        return "title=" + title +"," + "yearOfPublishing=" +yearOfPublishing +"," + "authors=" + auth;
    }

}





