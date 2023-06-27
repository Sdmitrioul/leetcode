package structures;

/**
 * For a stream of integers, implement a data structure that checks if the last k integers parsed
 * in the stream are equal to value.
 * Implement the DataStream class:
 * DataStream(int value, int k) Initializes the object with an empty integer stream and the two integers value and k.
 * boolean consec(int num) Adds num to the stream of integers.
 * Returns true if the last k integers are equal to value, and false otherwise.
 * If there are less than k integers, the condition does not hold true, so returns false.
 * 1 <= value, num <= 109
 * 1 <= k <= 105
 * At most 105 calls will be made to consec.
 */

interface IDataStream {
    boolean consec(int num);
}

public class DataStream implements IDataStream {
    private static final Node END = new Node(null, Integer.MIN_VALUE);
    private final int kVal;
    private final int k;
    private int size = 0;

    private Node head = END;
    private Node tail = END;

    public DataStream(int value, int k) {
        this.kVal = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if (size >= k) {
            tail = tail.next;
        }

        size++;
        if (num == kVal) {
            head.setNext();
        } else {
            head.setNext(0);
        }
        head = head.next;

        return size >= k && (head.value >= k || head.value == Integer.MIN_VALUE);
    }

    private static class Node {
        final int value;
        private Node prev;
        private Node next;

        public Node(Node prev, int value) {
            this.prev = prev;
            this.value = value;
        }

        public Node setNext(int val) {
            this.next = new Node(this, val);
            return this.next;
        }

        public Node setNext() {
            if (this.value == Integer.MIN_VALUE) {
                this.next = new Node(this, Integer.MIN_VALUE);
            } else {
                this.next = new Node(this, this.value + 1);
            }
            return this.next;
        }
    }
}

//Better by memory, but doesn't hold stream of ints.
class DataStream2 implements IDataStream {
    private final int kVal;
    private final int k;

    private int current = Integer.MIN_VALUE;
    private int size = 0;

    public DataStream2(int value, int k) {
        this.kVal = value;
        this.k = k;
    }

    @Override
    public boolean consec(int num) {
        size++;
        if (num != kVal) {
            current = 0;
        } else if (current != Integer.MIN_VALUE) {
            current++;
        }

        return size >= k && (current >= k || current == Integer.MIN_VALUE);
    }
}
