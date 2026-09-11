package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAdd() {
        Add adder = new Add();
        assertEquals(5, adder.add(2, 3), "2 + 3 doit être égal à 5");
    }
}