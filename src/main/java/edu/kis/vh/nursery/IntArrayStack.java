package edu.kis.vh.nursery;

public class IntArrayStack implements  Stackable{

    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[MAX_STACK_SIZE];

    private int total = NO_ANY_ELEMENTS;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NO_ANY_ELEMENTS;
    }

    public boolean isFull() {
        return total == MAX_STACK_SIZE - 1;
    }

    public int top() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return numbers[total];
    }

    public int pop() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return numbers[total--];
    }
}
