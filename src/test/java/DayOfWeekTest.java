import com.javaex.DayOfWeek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {
    @Test
    public void dayOfWeekTest(){
        assertEquals("Sunday", DayOfWeek.getDay(1));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(8));
    }
}
