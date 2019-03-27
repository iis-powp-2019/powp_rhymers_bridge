package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.DataProvider;
import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Basic rhymer type implementation
 */
public class DefaultCountingOutRhymer {


    private DataProvider list;

    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.list = list;
    }

    public DefaultCountingOutRhymer() {

        this.list = new IntLinkedList();
    }


    public void countIn(int in) {
        list.countIn(in);
    }

    public boolean callCheck() {
        return list.callCheck();
    }

    public int peekaboo() {
        return list.peekaboo();
    }

    public int countOut() {
        return list.countOut();
    }
}
