package edu.kis.vh.nursery.stackBulider;



public class IntLinkedList implements StackInterface {

    private Node last;

    @Override
    public int getTotal() {
        return total;
    }

    private int total = STACK_EMPTY;


    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
            total++;
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
