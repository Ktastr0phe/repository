package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAdd() {
        Add adder = new Add();
        assertEquals(7, adder.add(1, 6), "1 + 6 doit être égal à 7");
    }
    @Test
    public void testAdd2() {
        Add adder = new Add();
        assertEquals(10, adder.add(5, 5), "5 + 5 doit être égal à 10");
    }
}