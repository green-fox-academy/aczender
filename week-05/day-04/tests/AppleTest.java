import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple testApple = new Apple();

    @Test
    void getApple() {
        assertEquals("apple", testApple.getApple());
    }
//    WRONG TEST
//    @Test
//    void getAppleWrong() {
//        assertEquals("pear", testApple.getApple());
//    }
}