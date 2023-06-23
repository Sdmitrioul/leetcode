package tasks;

public class IncrementalMemoryLeak {
    /**
     * You are given two integers memory1 and memory2 representing the available memory in bits on two memory sticks.
     * There is currently a faulty program running that consumes an increasing amount of memory every second.
     * At the ith second (starting from 1), i bits of memory are allocated to the stick with more available memory
     * (or from the first memory stick if both have the same available memory).
     * If neither stick has at least i bits of available memory, the program crashes.
     * Return an array containing [crashTime, memory1crash, memory2crash],
     * where crashTime is the time (in seconds) when the program crashed
     * and memory1crash and memory2crash are the available bits of memory in the first and second sticks respectively.
     *
     * @param memory1 -  mem 1
     * @param memory2  - mem 2
     * @return - [second, mem1, mem2]
     */
    public int[] memLeak(int memory1, int memory2) {
        return slowMemLeak(memory1, memory2);
    }

    private static int[] fastMemLeak(int memory1, int memory2) {
        int second = 0;
        int mem1 = memory1;
        int mem2 = memory2;

        //TODO

        return new int[]{second, mem1, mem2};
    }

    private static int[] slowMemLeak(int memory1, int memory2) {
        int second = 0;
        int mem1 = memory1;
        int mem2 = memory2;

        while (true) {
            second++;

            if (mem1 < second && mem2 < second) {
                break;
            }

            if (mem2 > mem1) {
                mem2 -= second;
            } else {
                mem1 -= second;
            }
        }

        return new int[]{second, mem1, mem2};
    }
}
