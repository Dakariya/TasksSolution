import com.javaex.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {
    @Test
    public void fixedTest(){
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata.countBy(1,10));
        assertArrayEquals(new int[] {2,4,6,8,10}, Kata.countBy(2,5));
        assertArrayEquals(new int[] {3,6,9,12,15}, Kata.countBy(3,5));
    }

}
