package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheNumberOfTheSmallestUnoccupiedChairTest {
    private final TheNumberOfTheSmallestUnoccupiedChair test = new TheNumberOfTheSmallestUnoccupiedChair();

    @Test
    public void test() {
        assertEquals(1, test.smallestChair(new int[][]{{1, 4}, {2, 3}, {4, 6}}, 1));
    }

    @Test
    public void test2() {
        assertEquals(2, test.smallestChair(new int[][]{{3, 10}, {1, 5}, {2, 6}}, 0));
    }

    @Test
    public void test3() {
        assertEquals(2, test.smallestChair(new int[][]{{33889, 98676}, {80071, 89737}, {44118, 52565}, {52992, 84310}, {78492, 88209}, {21695, 67063}, {84622, 95452}, {98048, 98856}, {98411, 99433}, {55333, 56548}, {65375, 88566}, {55011, 62821}, {48548, 48656}, {87396, 94825}, {55273, 81868}, {75629, 91467}}, 6));
    }
}