package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    public IntLinkedList List;

    public DefaultCountingOutRhymer(IntLinkedList List) {
        this.List = List;
    }

    public DefaultCountingOutRhymer(){
        List = new IntLinkedList();
    }

    void countIn(int in) {
        List.push(in);
    }

    boolean callCheck() { return List.isEmpty(); }

    boolean isFull() {
        return List.isFull();
    }

    int peekaboo() { return List.top(); }

    int countOut() { return List.pop(); }
}
