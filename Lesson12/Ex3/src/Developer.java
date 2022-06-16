import java.util.Arrays;

public class Developer extends Employee {
    protected String mainLanguages;
    protected String[] skills;

    public Developer(String name, String email, int experience, String mainLanguages, String[] skills){
        super(name, email, experience);
        this.mainLanguages = mainLanguages;
        this.skills = skills;
    }

    public String[] getSkills(){
        return skills;
    }
    public String getMainLanguages(){
        return mainLanguages;
    }



}
