package edu.kis.vh.nursery.datastructures;

//Alt-strzałka lewo - przejście do pliku znajdującego się na zakładce po lewej od obecnie edytowanego pliku
//Alt-strzałka prawo - przejście do pliku znajdującego się na zakładce po prawej od obecnie edytowanego pliku

import edu.kis.vh.nursery.Rhymer;

public class IntLinkedList implements Rhymer {

    private Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return RHYMER_EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RHYMER_EMPTY;
        int ret = last.getValue();
        last = last.prev;
        return ret;
    }

    private class Node {

        private final int value;
        protected Node prev, next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }
    }

    @Override
    public void countIn(int in) {
        push(in);
    }

    @Override
    public boolean callCheck() {
        return isEmpty();
    }

    @Override
    public int peekaboo() {
        return top();
    }

    @Override
    public int countOut() {
        return pop();
    }
}
