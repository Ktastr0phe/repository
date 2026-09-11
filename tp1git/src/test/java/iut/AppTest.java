package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAmoinsB() {
        Sub sub = new Sub();

        assertEquals(1, sub.sub(9, 8));
    }
}