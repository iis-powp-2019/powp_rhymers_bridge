package edu.kis.vh.nursery.stackable;

public interface IntStackableInterface {
    static final int RETURN_VALUE = -1;
    static final int INITIAL_STACK_INDEX = -1;

    void countIn(int i);

    boolean callCheck();

    boolean isFull();

    int countOut();

    int peekaboo();

    int getTotal();
}
