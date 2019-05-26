package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer {

    IntCollection stack;

    public DefaultCountingOutRhymer(IntCollection stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }



    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}

//Skrót ctr + shift + backspace cofa do ostatnio edytowanego pliku