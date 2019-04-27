package edu.kis.vh.nursery;

import edu.kis.vh.nursery.RhymersStacks.IntLinkedList;
import edu.kis.vh.nursery.RhymersStacks.IntLinkedListInterface;

public class DefaultCountingOutRhymer {
    IntLinkedListInterface intLinkedListInterface;

    public DefaultCountingOutRhymer() {
        intLinkedListInterface= new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedListInterface intLinkedList) {
        this.intLinkedListInterface = intLinkedList;
    }

    public void countIn(int in) {
        intLinkedListInterface.push(in);
    }

    public boolean callCheck() {
        return intLinkedListInterface.isEmpty();
    }

    public boolean isFull() {
        return intLinkedListInterface.isFull();
    }

    public int peekaboo() {
        return intLinkedListInterface.top();
    }

    public int countOut() {
        return intLinkedListInterface.pop();
    }

    public int getIndexOutOfArray(){
        if(intLinkedListInterface.isEmpty())
            return -1;
        else
            return 0;
    }
}
