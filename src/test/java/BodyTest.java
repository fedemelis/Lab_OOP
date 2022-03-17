import esercizi.oop.Body;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BodyTest {
    @Test
    public void setSpeed() {
        Body b = new Body(0, 0, 5, 5);
        b.setSpeed(10, 10);
        assertEquals(10.0, b.getVx(), 0.0);
    }

    @Test
    public void progress() {
        Body b = new Body(0, 0, 3, 2);
        b.progress(10);
        assertEquals(30.0, b.getX(), 0.0);
        assertEquals(20.0, b.getY(), 0.0);
    }
}