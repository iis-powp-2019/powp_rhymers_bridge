package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Basic rhymer type implementation
 */
public class DefaultCountingOutRhymer {


    private IntLinkedList list;


    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.list =  list;
    }
    public DefaultCountingOutRhymer() {

        this.list = new IntLinkedList();
    }


    public void countIn(int in) {
        list.push(in);
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public int peekaboo() {
        return list.top();
    }

    public int countOut() {
        return list.pop();
    }
}
