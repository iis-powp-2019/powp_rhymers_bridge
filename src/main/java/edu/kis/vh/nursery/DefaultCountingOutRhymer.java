package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull()){
            numbers[++total] = in;
        }
    }

    boolean isEmpty() {
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
    }

    int currentNumber() {
        if (isEmpty()){
            return -1;
        }else{
            return numbers[total];
        }
    }

    public int countOut() {
        if (isEmpty()) {
            return -1;
        } else {
            return numbers[total--];
        }
    }

}
