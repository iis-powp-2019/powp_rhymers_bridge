package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.LinkedListOfIntegers;

public class DefaultCountingOutRhymer {

    private LinkedListOfIntegers linkedListOfIntegers;

    public DefaultCountingOutRhymer(LinkedListOfIntegers linkedListOfIntegers) {
        this.linkedListOfIntegers = linkedListOfIntegers;
    }

    public DefaultCountingOutRhymer() {
        this.linkedListOfIntegers = new LinkedListOfIntegers();
    }

    public void countIn(int in) {
        linkedListOfIntegers.push(in);
    }

    public boolean callCheck() {
        return linkedListOfIntegers.isEmpty();
    }

    public boolean isFull() {
        return linkedListOfIntegers.isFull();
    }

    public int actualNumber() {
        return linkedListOfIntegers.top();
    }

    public int countOut() {
        return linkedListOfIntegers.pop();
    }
}
