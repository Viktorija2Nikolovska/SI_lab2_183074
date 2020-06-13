import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {



    @Test
    public void EveryStatement() {
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        assertEquals(List.of("0", "1", "#", "1"), SILab2.function(List.of("0", "0", "#", "0")));

    }

    @Test
    public void EveryPath() {
        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        assertEquals(List.of("#", "#", "#"), SILab2.function(List.of("#", "#", "#")));
        assertEquals(List.of("0", "0", "0"), SILab2.function(List.of("0", "0", "0")));
        assertEquals(List.of("0", "1", "#", "1"), SILab2.function(List.of("0", "0", "#", "0")));
        assertEquals(List.of("#", "1", "0"), SILab2.function(List.of("#", "0", "0")));
        assertEquals(List.of("0", "1", "#"), SILab2.function(List.of("0", "0", "#")));


    }
}
