import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    private Anagram AnagramTest;

    @BeforeEach
    void setUp() {
        AnagramTest = new Anagram();
        System.out.println("this is a before message");
    }

    @Test
    void anagramWithEquals() {
        boolean expectedResult = true;
        String first = "some";
        String second = "emos";

        assertEquals(expectedResult, AnagramTest.anagram(first, second));
    }

    @Test
    void anagramWithTrue() {
        String first = "this";
        String second = "shit";

        assertTrue(Anagram.anagram(first, second));
    }
}