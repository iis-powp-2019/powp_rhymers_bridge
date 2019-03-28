package edu.kis.vh.nursery;

public interface Stackable {

    public static final int NO_ANY_ELEMENTS = -1;

    public void countIn(int in);
    public boolean callCheck();
    public boolean isFull();
    public int peekaboo();
    public int countOut();

}
