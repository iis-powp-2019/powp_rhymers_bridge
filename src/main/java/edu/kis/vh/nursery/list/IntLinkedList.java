package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node lastNode;
    //martwa zmienna

    public void push(int i) {
        if (lastNode == null) {
            lastNode = new Node(i);
        } else {
            lastNode.next = new Node(i);
            lastNode.next.prev = lastNode;
            lastNode = lastNode.next;
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int lastValueOnList = lastNode.value;
        lastNode = lastNode.prev;

        return lastValueOnList;
    }

}
