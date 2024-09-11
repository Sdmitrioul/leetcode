package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ListNodeBuilder.buildListNode;

public class InsertGreatestCommonDivisorsInLinkedListTest {
    private InsertGreatestCommonDivisorsInLinkedList test = new InsertGreatestCommonDivisorsInLinkedList();

    @Test
    void first() {
        assertEquals(
                buildListNode(new int[]{18, 6, 6, 2, 10, 1, 3}),
                test.insertGreatestCommonDivisors(buildListNode(new int[]{18, 6, 10, 3}))
        );
    }

    @Test
    void second() {
        assertEquals(
                buildListNode(new int[]{7}),
                test.insertGreatestCommonDivisors(buildListNode(new int[]{7}))
        );
    }
}
