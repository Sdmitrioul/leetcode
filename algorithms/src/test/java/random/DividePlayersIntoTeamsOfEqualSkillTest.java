package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DividePlayersIntoTeamsOfEqualSkillTest {
    private final DividePlayersIntoTeamsOfEqualSkill test = new DividePlayersIntoTeamsOfEqualSkill();

    @Test
    public void test() {
        assertEquals(22l, test.dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(-1l, test.dividePlayers(new int[]{1, 1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(12l, test.dividePlayers(new int[]{3, 4}));
    }
}
