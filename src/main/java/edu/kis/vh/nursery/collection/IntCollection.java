package edu.kis.vh.nursery.collection;

public interface IntCollection {

    int NUMBERS_EMPTY = 0;
    int EMPTY_VALUE = 0;

    /**
     * Adds number to collection
     * @param in value to add to the collection
     */
    void push(int in);

    /**
     * Checks if collection is empty
     * @return true when collection stores no numbers
     */
    boolean isEmpty();

    /**
     * Checks if collection is full
     * @return true when collection can store no more numbers
     */
    boolean isFull();

    /**
     * Gets value of last added number
     * @return last added number
     */
    int top();

    /**
     * Gets value of last added number, removing it from collection
     * @return last added number
     */
    int pop();

    /**
     * Gets count of elements stored in collection
     * @return number of elements currently in collection
     */
    int getElementCount();
}
