import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    private HashMap<Character, Integer> forTest = new HashMap<Character, Integer>();

    @BeforeEach
    void setUp() {
        System.out.println("this is a before message");
        forTest.put('a', 1);
        forTest.put('p', 2);
        forTest.put('l', 1);
        forTest.put('e', 1);

    }


    @Test
    void countLetters() {

        assertEquals(forTest, CountLetters.countLetters("apple"));
    }
}


