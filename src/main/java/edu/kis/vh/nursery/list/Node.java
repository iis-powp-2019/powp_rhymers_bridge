package edu.kis.vh.nursery.list;

/**
 * Klasa trzymajaca wartosc oraz poprzedni i kolejny obiekt listy
 */
public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * konstruktor
     * @param i wartosc obiektu
     */
    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
