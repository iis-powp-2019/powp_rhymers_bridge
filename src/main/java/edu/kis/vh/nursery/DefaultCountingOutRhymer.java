package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structure.DataStructure;
import edu.kis.vh.nursery.data_structure.IntLinkedList;

public class DefaultCountingOutRhymer {

    private DataStructure dataStructure;

    public DefaultCountingOutRhymer(){
        this.dataStructure = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(DataStructure dataStructure) {
        this.dataStructure = dataStructure;
    }

    public void countIn(int in) {
        dataStructure.push(in);
    }

    public boolean callCheck() {
        return dataStructure.isEmpty();
    }

    public boolean isFull() {
        return dataStructure.isFull();
    }

    public int peekaboo() {
        return dataStructure.top();
    }

    public int countOut() {
        return dataStructure.pop();
    }



}
