package cloneable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException  {
        Student student = new Student("john", 20, "male", "BME");
        Student johnTheClone = student.clone();

        student.introduce();
        johnTheClone.introduce();
    }
}
