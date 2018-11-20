package greenfoxinheritance;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " who " +
                "represents " + company +
                " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
