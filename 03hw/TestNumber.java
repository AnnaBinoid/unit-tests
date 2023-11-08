import org.junit.jupiter.api.Test;
import seminars.third.hw.Number;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNumber {

    @Test
    void testIsEven(){
        int n = 8;
        boolean result = Number.evenOddNumber(n);
        assertTrue(result);
    }

    @Test
    void testIsOdd(){
        int n = 9;
        boolean result = Number.evenOddNumber(n);
        assertFalse(result);
    }

    @Test
    void testInInterval(){
        int n = 25;
        boolean result = Number.numberInInterval(n);
        assertTrue(result);
    }

    @Test
    void testNotInInterval(){
        int n = 101;
        boolean result = Number.evenOddNumber(n);
        assertFalse(result);
    }

}