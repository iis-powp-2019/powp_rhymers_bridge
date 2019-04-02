package edu.kis.vh.nursery.stacks;

public enum StackValues {
    EMPTY_STACK_VALUE(0),
    STACK_CAPACITY(12);

    private final int value;

    StackValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
