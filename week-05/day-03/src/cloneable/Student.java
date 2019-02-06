package cloneable;

public class Student extends Person implements Cloneable{
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    protected Student clone() {
        return new Student(name, age, gender, previousOrganization);
    }

    public Student() {
        super();
        this.previousOrganization = "The Schoold of Life";
    }
    
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "from " + previousOrganization + " who skipped " + skippedDays + " from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        return skippedDays += numberOfDays;
    }

}
