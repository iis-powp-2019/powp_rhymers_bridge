package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.LinkedListOfIntegers;

public class DefaultCountingOutRhymer {

    // zrobione w podpunkcie 3.1.4
    private Stack typeOfImplementation;

    public DefaultCountingOutRhymer(Stack typeOfImplementation) {
        this.typeOfImplementation = typeOfImplementation;
    }

    public DefaultCountingOutRhymer() {
        this.typeOfImplementation = new LinkedListOfIntegers();
    }

    public void countIn(int in) {
        typeOfImplementation.countIn(in);
    }

    public boolean callCheck() {
        return typeOfImplementation.callCheck();
    }

    public boolean isFull() {
        return typeOfImplementation.isFull();
    }

    public int actualNumber() {
        return typeOfImplementation.actualNumber();
    }

    public int countOut() {
        return typeOfImplementation.countOut();
    }
}
