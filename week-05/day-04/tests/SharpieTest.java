import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

    Sharpie SharpieTest;

    @BeforeEach
    void setUp() {
        SharpieTest = new Sharpie(20, "red");
    }

    @Test
    void use() {
        assertEquals(80f, SharpieTest.use());
    }

}