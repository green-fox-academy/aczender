import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
private Animal dog = new Animal("Dog");

   @Test
   public void getName() {
       assertEquals("Dog", dog.getName());
   }

   @Test
   public void getHunger(){
       assertEquals(20,dog.getHunger());
   }
    @Test
    void eating() {
       assertEquals(19, dog.eat());

    }

    @Test
    void drink() {
        assertEquals(19, dog.eat());
    }

    @Test
    void play() {
        dog.play();
        assertEquals(21,dog.hunger);
        assertEquals(21,dog.thirst);
    }
}