package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data.DataProvider;
import edu.kis.vh.nursery.data.IntLinkedList;

/**
 * Basic rhymer type implementation
 */
public class DefaultCountingOutRhymer {


    private DataProvider dataStorage;

    public DefaultCountingOutRhymer(DataProvider list) {
        this.dataStorage = list;
    }

    public DefaultCountingOutRhymer() {

        this.dataStorage = new IntLinkedList();
    }


    public void countIn(int in) {
        dataStorage.countIn(in);
    }

    public boolean callCheck() {
        return dataStorage.callCheck();
    }

    public int peekaboo() {
        return dataStorage.peekaboo();
    }

    public int countOut() {
        return dataStorage.countOut();
    }
    boolean isFull(){
        return dataStorage.isFull();
    }
}
