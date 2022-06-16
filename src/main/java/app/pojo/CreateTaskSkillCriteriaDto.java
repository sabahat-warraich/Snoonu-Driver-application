package main.java.app.pojo;

public class CreateTaskSkillCriteriaDto {

    private String[] requiredSkills;

    private String allRequired;

    public String[] getRequiredSkills ()
    {
        return requiredSkills;
    }

    public void setRequiredSkills (String[] requiredSkills)
    {
        this.requiredSkills = requiredSkills;
    }

    public String getAllRequired ()
    {
        return allRequired;
    }

    public void setAllRequired (String allRequired)
    {
        this.allRequired = allRequired;
    }

}
