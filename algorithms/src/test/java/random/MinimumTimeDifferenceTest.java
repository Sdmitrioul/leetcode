package random;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTimeDifferenceTest {
    private final MinimumTimeDifference test = new MinimumTimeDifference();

    @Test
    void minimumTimeDifference() {
        assertEquals(1, test.findMinDifference(List.of("23:59","00:00")));
    }

    @Test
    void minimumTimeDifference2() {
        assertEquals(0, test.findMinDifference(List.of("00:00","23:59","00:00")));
    }
}
