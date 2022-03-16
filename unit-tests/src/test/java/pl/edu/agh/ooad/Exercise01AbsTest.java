package pl.edu.agh.ooad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01AbsTest {
    
    @Test
    @DisplayName("Test positive values of abs")
    public void testPositiveValue() {
        assertEquals(1, Exercise01Abs.abs(1));
        assertEquals(1324, Exercise01Abs.abs(1324));
    }
	
}
