package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Stack Class
 */
public class DefaultCountingOutRhymer {
//    IntArrayStack stack;
    IntLinkedList list;

    public DefaultCountingOutRhymer() {
        list = new IntLinkedList();
    }

//    public int getTotal() {
//        return stack.getTotal();
//    }

    public void countIn(int in) {
        list.countIn(in);
    }

    public boolean callCheck() {
        return list.callCheck();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int peekaboo() {
        return list.peekaboo();
    }

    public int countOut() {
        return list.countOut();
    }
}
