package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackModules.Data;
import edu.kis.vh.nursery.stackModules.IntLinkedList;

public class DefaultCountingOutRhymer {
    private Data data;

    public void countIn(int in) {
        data.countIn(in);
    }

    public boolean callCheck() {
        return data.callCheck();
    }

    public boolean isFull() {
        return data.isFull();
    }

    public int peekaboo() {
        return data.peekaboo();
    }

    public int countOut() {
        return data.countOut();
    }


    public DefaultCountingOutRhymer(Data data) {
        this.data = data;
    }
    public DefaultCountingOutRhymer() {
        this.data = new IntLinkedList();
    }


}
