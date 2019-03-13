package edu.kis.vh.nursery;

class Node {  //in case of problems

    public int getValue() {
        return value;
    }


    private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[getMaxSize()];

    private int total = getDefIndexStack();

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getDefIndexStack() {
        return DEF_INDEX_STACK;
    }

    public static int getNotFound() {
        return NOT_FOUND;
    }

    public int getTotal() {
        return total;
    }

    private static final int DEF_INDEX_STACK = -1;

    private static final int NOT_FOUND = -1;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    protected boolean callCheck() {

        return total == getDefIndexStack();
    }

    protected boolean isFull() {

        return total == getMaxSize() -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return getNotFound();
        return getNumbers()[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    // alt + ->/<- pozwala na przełączanie pomiędzy aktywnymi kartami
}
