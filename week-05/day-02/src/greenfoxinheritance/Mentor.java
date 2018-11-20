package greenfoxinheritance;

public class Mentor extends Person {
    String level;

    Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    Mentor() {
        super();
        this.level = "intermediate";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

}
