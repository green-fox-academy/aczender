package cloneable;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException  {
        Student student = new Student("john", 30, "male", "BME");
        Student student1 = student.clone();

        student.introduce();
        student1.introduce();
    }
}
