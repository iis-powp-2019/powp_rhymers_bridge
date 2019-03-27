package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntArrayStack;
import edu.kis.vh.nursery.stackImplementation.IntLinkedList;
import edu.kis.vh.nursery.stackImplementation.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList temp = new IntLinkedList();

    public FIFORhymer() { super();}

    public FIFORhymer(StackInterface stackInterface) {
        super(stackInterface);
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
