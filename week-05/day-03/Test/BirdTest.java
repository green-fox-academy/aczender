

import main.java.zoo.Bird;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @org.junit.jupiter.api.Test
    void breed() {
        Bird bird = new Bird("this,", "that");
        assertEquals("laying eggs.", bird.breed());

    }

    @org.junit.jupiter.api.Test
    void eat() {
        Bird bird = new Bird("this,", "that");
        assertEquals("that", bird.eat());
    }
}