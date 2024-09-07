package random;

import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation {
    private static final int HASH_VALUE = 100003;
    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    public int robotSim(int[] commands, int[][] obstacles) {
        int row = 0;
        int col = 0;
        int direction = 0;
        int max = 0;

        Set<Integer> obstacleSet = new HashSet<>();

        for (int[] obstacle : obstacles) {
            obstacleSet.add(hashObstacle(obstacle[1], obstacle[0]));
        }

        for (int command : commands) {
            if (command == -2) {
                direction = (direction + 1 + 4) % DIRECTIONS.length;
            } else if (command == -1) {
                direction = (direction - 1 + 4) % DIRECTIONS.length;
            } else {
                while (command != 0) {
                    command--;
                    row += DIRECTIONS[direction][0];
                    col += DIRECTIONS[direction][1];
                    if (obstacleSet.contains(hashObstacle(row, col))) {
                        row -= DIRECTIONS[direction][0];
                        col -= DIRECTIONS[direction][1];
                        break;
                    }
                }
            }
            max = Math.max(max, distance(row, col));
        }
        return max;
    }

    private int hashObstacle(int col, int row) {
        return col + row * HASH_VALUE;
    }

    private static int distance(int row, int col) {
        return row * row + col * col;
    }
}
