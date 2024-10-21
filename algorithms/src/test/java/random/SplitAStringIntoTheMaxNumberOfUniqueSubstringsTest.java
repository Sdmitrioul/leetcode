package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitAStringIntoTheMaxNumberOfUniqueSubstringsTest {
    private final SplitAStringIntoTheMaxNumberOfUniqueSubstrings test = new SplitAStringIntoTheMaxNumberOfUniqueSubstrings();

    @Test
    public void test() {
        assertEquals(5, test.maxUniqueSplit("ababccc"));
    }

    @Test
    public void test2() {
        assertEquals(2, test.maxUniqueSplit("aba"));
    }

    @Test
    public void test3() {
        assertEquals(1, test.maxUniqueSplit("aa"));
    }

    @Test
    public void test4() {
        assertEquals(7, test.maxUniqueSplit("nfbbgmgp"));
    }

    @Test
    public void test5() {
        assertEquals(11, test.maxUniqueSplit("wwwzfvedwfvhsww"));
    }
}
