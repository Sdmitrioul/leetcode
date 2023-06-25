package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeConfusionExamTest {
    private final MaximizeConfusionExam tested = new MaximizeConfusionExam();

    @Test
    void first() {
        assertEquals(4, tested.maxConsecutiveAnswers("TTFF", 2));
    }

    @Test
    void second() {
        assertEquals(3, tested.maxConsecutiveAnswers("TFFT", 1));
    }

    @Test
    void third() {
        assertEquals(5, tested.maxConsecutiveAnswers("TTFTTFTT", 1));
    }
}
