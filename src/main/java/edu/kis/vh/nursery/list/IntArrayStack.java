package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.IIntLinkedList;

public class IntArrayStack implements IIntLinkedList {

    public static final int DEFAULT = -1;
    public static final int MAX_NUMBER_OF_ELEMENTS = 12;

    private final int[] numbers = new int[MAX_NUMBER_OF_ELEMENTS];

    private int total = DEFAULT;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    @Override
    public void push(int i) {
        countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return !isFull();
    }

    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        return peekaboo();
    }

    @Override
    public int pop() {
        return countOut();
    }

    protected int peekaboo() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[total--];
    }

}
