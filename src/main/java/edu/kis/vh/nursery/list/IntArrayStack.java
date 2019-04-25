package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[getMaxStackSize()];

    private int total = getDefaultReturnValue();

    public static int getDefaultReturnValue() {
        return DEFAULT_RETURN_VALUE;
    }

    public static int getMaxStackSize() {
        return MAX_STACK_SIZE;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == getDefaultReturnValue();
    }

    public boolean isFull() {
        return total == getMaxStackSize() -1;
    }

    public int peekaboo() {
        if (callCheck())
            return getDefaultReturnValue();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getDefaultReturnValue();
        return getNumbers()[total--];
    }

    public int getTotal() {
        return total;
    }


    public int[] getNumbers() {
        return numbers;
    }


}
