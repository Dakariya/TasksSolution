import com.javaex.Alarm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {
    @Test
    public void setAlarmTest(){
        assertEquals(true, Alarm.alarmSet(true,false));
    }
}
