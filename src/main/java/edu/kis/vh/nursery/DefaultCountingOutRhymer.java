package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    IntArrayStack stackArray;
    IntLinkedList stack;

    public DefaultCountingOutRhymer(IntLinkedList stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public int getTotal() {
        return stack.getTotal();
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