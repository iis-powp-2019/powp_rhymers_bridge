package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackBulider.IntArrayStack;
import edu.kis.vh.nursery.stackBulider.IntLinkedList;
import edu.kis.vh.nursery.stackBulider.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private StackInterface temp = new IntArrayStack();

    public FIFORhymer(IntLinkedList intLinkedList, DefaultCountingOutRhymer temp) {
        super(intLinkedList);

    }
    public FIFORhymer(){}

    public FIFORhymer(IntLinkedList intLinkedList) {
    }

    public FIFORhymer(IntArrayStack intArrayStack) {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

       int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}
