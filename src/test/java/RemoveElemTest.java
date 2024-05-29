import com.javaex.RemoveElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElemTest {
    @Test
    public  void remElemTest(){
        assertEquals(new int[]{2, 2}, RemoveElement.removeElem(new int[]{3,2,2,3},3));
    }
}
