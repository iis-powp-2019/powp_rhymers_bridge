package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;
import edu.kis.vh.nursery.stack.stacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList = new IntLinkedList();

    public FIFORhymer(Stack stack) {
        super(stack);
    }

    public FIFORhymer(){

    }

    @Override public int countOut() {
        while (!isEmpty())

            intLinkedList.push(super.countOut());

        int returningValue = intLinkedList.pop();

        while (!intLinkedList.isEmpty()){
            countIn(intLinkedList.pop());
        }

        return returningValue;
    }


}
