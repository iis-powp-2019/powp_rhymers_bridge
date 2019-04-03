package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node last;
    int count=0;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
        count++;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        count--;
        return ret;
    }
    public int countOut(){
        return pop();
    }
    public void countIn(int i){
        push(i);
    }
    public boolean callCheck(){
        if(count  > 0)
            return false;
        return true;
    }
    public int peekaboo(){
        return top();
    }


}
