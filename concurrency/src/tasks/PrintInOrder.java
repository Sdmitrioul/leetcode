package tasks;

import java.util.concurrent.Phaser;

public class PrintInOrder {
    private final Phaser phaser = new Phaser(3);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        phaser.arriveAndDeregister();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (phaser.getPhase() != 1) {
            phaser.arriveAndAwaitAdvance();
        }
        printSecond.run();
        phaser.arriveAndDeregister();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (phaser.getPhase() != 2) {
            phaser.arriveAndAwaitAdvance();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        phaser.arriveAndDeregister();
    }
}
