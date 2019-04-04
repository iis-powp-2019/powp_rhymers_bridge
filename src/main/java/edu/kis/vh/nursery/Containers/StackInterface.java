package edu.kis.vh.nursery.Containers;

public interface StackInterface {
    int MAX_STACK_SIZE = 12;
    int NOT_FOUND_RETURN = 0;

    void countIn(int in);
    int countOut();

    boolean callCheck();

    int peekaboo();

    boolean isFull();
}
