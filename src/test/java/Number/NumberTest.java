package Number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    @Test
    public void numTest(){
        Number obj = new Number(5.0);
        assertEquals(false, obj.isZero());
        assertEquals(true, obj.isPositive());
        assertEquals(false, obj.isNegative());
        assertEquals(false, obj.isEven());
        assertEquals(true, obj.isOdd());
        assertEquals(true, obj.isPrime());
    }
}
