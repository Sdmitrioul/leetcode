package random;

public class DividePlayersIntoTeamsOfEqualSkill {
    public static final int MAX_SKILL_LEVEL = 1000;

    public long dividePlayers(int[] skills) {
        long sum = 0L;
        for (int skill : skills) {
            sum += skill;
        }
        int aim = (int) ((sum * 2 / (skills.length)));
        int[] values = new int[MAX_SKILL_LEVEL + 1];
        int level = 0;
        long result = 0L;
        for (int skill : skills) {
            int opposite = aim - skill;
            if (opposite <= 0) {
                return -1L;
            }
            if (opposite > MAX_SKILL_LEVEL) {
                return -1L;
            }
            if (values[opposite] == 0) {
                level++;
                values[skill]++;
            } else {
                values[opposite]--;
                level--;
                result += ((long) opposite * skill);
            }
        }
        if (level != 0) {
            return -1L;
        }
        return result;
    }
}
