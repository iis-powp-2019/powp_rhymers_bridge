package edu.kis.vh.nursery.list;

//Alt-strzałka lewo - przejście do pliku znajdującego się na zakładce po lewej od obecnie edytowanego pliku
//Alt-strzałka prawo - przejście do pliku znajdującego się na zakładce po prawej od obecnie edytowanego pliku

public class IntLinkedList {

    private static final int NO_ELEMENTS_LEFT = -1;
    private Node last;
    int i;

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return NO_ELEMENTS_LEFT;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return NO_ELEMENTS_LEFT;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
