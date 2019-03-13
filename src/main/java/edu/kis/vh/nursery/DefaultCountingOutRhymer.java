package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;

    private int[] numbers = new int[MAX_SIZE];

    private int total = DEF_INDEX_STACK;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private static final int DEF_INDEX_STACK = -1;

    private static final int NOT_FOUND = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {

        return total == DEF_INDEX_STACK;
    }

    protected boolean isFull() {

        return total == MAX_SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return NOT_FOUND;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
    // alt + ->/<- pozwala na przełączanie pomiędzy aktywnymi kartami
}
