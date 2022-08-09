package Box;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {
    @Test
    public void test() {
        Box box = new Box(10, 20);
        assertEquals(200, box.area());
    }
}
