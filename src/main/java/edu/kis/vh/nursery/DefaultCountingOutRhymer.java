package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.DataStructure;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    DataStructure dataStructure;

    public DefaultCountingOutRhymer(DataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    public DefaultCountingOutRhymer() {
        this.dataStructure = new IntLinkedList();
    }

    public void countIn(int in) {
        dataStructure.countIn(in);
    }

    public int countOut() {
        return dataStructure.countOut();
    }

    public boolean callCheck() {
        return dataStructure.callCheck();
    }

    public boolean isFull() {
        return dataStructure.isFull();
    }

    public int peekaboo() {
        return dataStructure.peekaboo();
    }
}
