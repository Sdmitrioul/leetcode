package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IncrementalMemoryLeakTest {
    private final IncrementalMemoryLeak tested = new IncrementalMemoryLeak();

    @Test
    void memLeak1() {
        assertArrayEquals(new int[]{3,1,0}, tested.memLeak(2, 2));
    }

    @Test
    void memLeak2() {
        assertArrayEquals(new int[]{6,0,4}, tested.memLeak(8, 11));
    }
}