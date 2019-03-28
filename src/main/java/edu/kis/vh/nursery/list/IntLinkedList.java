package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i = 0;

    /**
     *
     * @param i
     * Add i to linkedList
     */
    public void push(int i) {
        if (last == null){
            last = new Node(i);
            this.i++;
            }
        else {
            this.i++;
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks that list is empty
     * @return
     * True if last == null
     * false if last !=null
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks that list is full
     * @return
     * Always return false :)
     */
    public boolean isFull() {
        return false;
    }

    /**
     *
     * @return
     * last value from linkedList
     * if linkedList is empty return -1
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     *
     * @return
     * Last added value from linkedList and delete this value form list
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        this.i--;
        return ret;
    }

    public int getTotal(){
        return this.i;
    }

}
