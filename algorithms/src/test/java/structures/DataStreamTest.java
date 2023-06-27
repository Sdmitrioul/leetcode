package structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataStreamTest {
    @Test
    void basicTest() {
        final DataStream ds = new DataStream(4, 3);
        assertFalse(ds.consec(4));
        assertFalse(ds.consec(4));
        assertTrue(ds.consec(4));
        assertFalse(ds.consec(3));
    }
}