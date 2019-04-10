package edu.kis.vh.nursery;

public interface IStack {
    int EMPTY_STACK_INDICATOR = 0;
    int STACK_TOTAL_INITIAL_VALUE = -1;
    int NUMBERS_QUANTITY = 12;
    int FULL_STACK_INDICATOR = NUMBERS_QUANTITY-1;

    int getTotal();

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
