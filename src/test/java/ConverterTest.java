import com.javaex.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    @Test
    public void converterTest(){
        assertEquals(3.54f, Converter.mpgtoKPM(10), 0.001f);
    }
}
