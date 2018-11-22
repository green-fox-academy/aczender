import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum SumTest;
   // ArrayList<Integer> arrayList;                         //GOOD OPTION AS WELL /1

    @BeforeEach
    void setUp() {
        SumTest = new Sum();
        //arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));   //GOOD OPTION AS WELL/2
        System.out.println("this is a before message");
    }

    @Test
    void sum() {
        int expectedresult = 10;
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));


        assertEquals(expectedresult, SumTest.sum(arrayList));
    }
}