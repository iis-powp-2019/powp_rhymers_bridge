package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStack{
    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[getMaxStackSize()];

    private int total = getDefaultReturnValue();

    public static int getDefaultReturnValue() {
        return EMPTY_STACK_VALUE;
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
    @Override
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

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void push(int i) {
        countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return callCheck();
    }

    @Override
    public int top(){
        return peekaboo();
    }

    @Override
    public int pop() {
        return countOut();
    }
}
