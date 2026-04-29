package week3.role;

import week3.policy.SubmitPolicy;
import week3.policy.Lionpolicy;

public class Lion extends Role{
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    public SubmitPolicy getPolicy() {
        return new Lionpolicy();
    }

    public String getInfo() {
        return "Likelion\n"
                +"Name: "+getName()
                +"Generation: "+getGeneration()
                +"Part: "+getPart()
                +"StudentId: "+studentId;
    }
}