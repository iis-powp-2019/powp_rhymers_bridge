package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackBulider.IntArrayStack;
import edu.kis.vh.nursery.stackBulider.IntLinkedList;
import edu.kis.vh.nursery.stackBulider.StackInterface;

public class DefaultCountingOutRhymer {


     StackInterface intLinkedList = new IntLinkedList();


    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
       this.intLinkedList= intLinkedList;
    }


    public DefaultCountingOutRhymer() {}

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
    }


    public int getTotal(){
        return intLinkedList.getTotal();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
