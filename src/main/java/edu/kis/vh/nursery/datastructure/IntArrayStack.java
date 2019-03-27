package edu.kis.vh.nursery.datastructure;

public class IntArrayStack implements BestInterface {

    private static final int MAX = 11;
    final private int[] numbers = new int[12];

    private int total = Empty_value;

    public int getTotal() {
        return total;
    }


    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == Empty_value;
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
            return Empty_value;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return Empty_value;
        }
        return numbers[total--];
    }




}
