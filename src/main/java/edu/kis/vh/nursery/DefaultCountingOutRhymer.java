package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public static int getStackCapacity() {
        return IntArrayStack.getStackCapacity();
    }

    public static int getMinTotalValue() {
        return IntArrayStack.getMinTotalValue();
    }

    public int getTotal() {
        return intLinkedList.getValue();
    }

    public void countIn(int in) {
        intLinkedList.countIn(in);
    }

    public boolean callCheck() {
        return intLinkedList.callCheck();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.peekaboo();
    }

    public int countOut() {
        return intLinkedList.countOut();
    }

    public int[] getNumbers() {
        return intLinkedList.getNumbers();
    }


}
