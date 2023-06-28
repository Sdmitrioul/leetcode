package tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathMaximumProbabilityTest {
    private PathMaximumProbability tested;

    @BeforeEach
    void setUp() {
        tested = new PathMaximumProbability();
    }

    @Test
    void first() {
        assertEquals(0.25000, tested.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2));
    }

    @Test
    void second() {
        assertEquals(0.30000, tested.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.3}, 0, 2));
    }

    @Test
    void third() {
        assertEquals(0.0, tested.maxProbability(3, new int[][]{{0, 1}}, new double[]{0.5}, 0, 2));
    }

    @Test
    void fourth() {
        assertEquals(0.0, tested.maxProbability(500, new int[][]{{193, 229}, {133, 212}, {224, 465}}, new double[]{0.91, 0.78, 0.64}, 4, 364));
    }
}