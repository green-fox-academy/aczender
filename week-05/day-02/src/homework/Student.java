package homework;

public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The Schoold of Life";
    }


    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "from " + previousOrganization + "who skipped " + skippedDays + " from the course already.");

    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        return skippedDays += numberOfDays;

    }

}
