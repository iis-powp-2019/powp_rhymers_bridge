package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();
    private IntLinkedList intLinkedList = new IntLinkedList();

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = null;
    }

    /*
    public static int getMaxSize() {
        return IntLinkedList.getMaxSize();
    }

    public static int getDefIndexStack() {
        return IntArrayStack.getDefIndexStack();
    }

    public static int getNotFound() {
        return IntLinkedList.getNotFound();
    }
    */

    public int getTotal() {
        return intLinkedList.getI();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
        //return false;
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    /*
    public int[] getNumbers() {
        return intLinkedList.pop();
    }
    */
}
