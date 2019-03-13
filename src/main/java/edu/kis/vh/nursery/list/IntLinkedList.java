package edu.kis.vh.nursery.list;

//Alt-strzałka lewo - przejście do pliku znajdującego się na zakładce po lewej od obecnie edytowanego pliku
//Alt-strzałka prawo - przejście do pliku znajdującego się na zakładce po prawej od obecnie edytowanego pliku

public class IntLinkedList {

    private static final int NO_ELEMENTS_LEFT = -1;
    Node last;
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

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return NO_ELEMENTS_LEFT;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return NO_ELEMENTS_LEFT;
        int ret = last.getValue();
        last = last.prev;
        return ret;
    }

}
