package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.BestInterface;

public class IntArrayStack implements BestInterface {

    private static final int COUNTFINISH = -1;
    private static final int MAX = 11;
    final private int[] numbers = new int[12];

    private int total = COUNTFINISH;

    public int getTotal() {
        return total;
    }


    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == COUNTFINISH;
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
        return total == MAX;
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
            return COUNTFINISH;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return COUNTFINISH;
        }
        return numbers[total--];
    }




}
