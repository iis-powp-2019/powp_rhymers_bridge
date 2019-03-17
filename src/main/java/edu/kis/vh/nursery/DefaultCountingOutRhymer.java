package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[STACK_CAPACITY];
    private int total = -1;

    /**
     * @return Current value of total variable
     */
    public int getTotal() {
        return total;
    }

    /**
     *@param in Value which is added to numbers table.
     */
    public void countIn(int in) {
        if (!isFull()){
            numbers[++total] = in;
        }
    }

    /**
     * @return {@code true} if stack is empty; {@code false} if stack contains some values
     */
    boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    /**
     * @return {@code true} if stack is full; {@code false} if stack is not full
     */
    boolean isFull() {
        return total == STACK_CAPACITY-1;
    }

    /**
     * @return {@code int} -1 if stack is empty {@code int} current element from numbers table
     */
    int currentNumber() {
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }else{
            return numbers[total];
        }
    }

    /**
     * @return {@code int} -1 if stack is empty {@code int} element from numbers table until it is empty
     */
    public int countOut() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        } else {
            return numbers[total--];
        }
    }

}
