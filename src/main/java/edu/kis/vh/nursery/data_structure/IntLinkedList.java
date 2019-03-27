package edu.kis.vh.nursery.data_structure;

/**
 * Lista przechowująca liczby całkowite.
 */
public class IntLinkedList implements DataStructure {

    private final int EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Umieszcza w liście element o przekazanej wartości.
     *
     * @param i wartość nowego elementu
     */
    @Override public void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza czy lista jest pusta.
     * @return true jeśli lista jest pusta, false jeśli nie jest
     */
    @Override public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza czy lista jest pełna.
     * @return true jeśli lista jest pełna, false jeśli nie
     */
    @Override public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartośc ostatniego elementu na liście.
     * @return ostatni element na liście lub -1 jeśli lista jest pusta
     */
    @Override public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Zwraca ostatni element z listy i usuwa go.
     * @return ostatni element na liście lub -1 jeśli lista jest pusta
     */
    @Override public int pop() {
        if (isEmpty())
            return EMPTY;
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private int value;
        private Node prev;
        private Node next;

        Node(int i) {
            value = i;
        }

        int getValue() {
            return value;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(final Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(final Node next) {
            this.next = next;
        }
    }

}
