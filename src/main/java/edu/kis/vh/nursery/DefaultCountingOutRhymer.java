package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStack;

public class DefaultCountingOutRhymer {

    IntStack intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer(){
        intLinkedList = new IntLinkedList();
    }

    public static int getDefaultReturnValue() {
        return IntArrayStack.getDefaultReturnValue();
    }

    public static int getMaxStackSize() {
        return IntArrayStack.getMaxStackSize();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    public int getTotal() {
        return intLinkedList.getTotal();
    }

}
