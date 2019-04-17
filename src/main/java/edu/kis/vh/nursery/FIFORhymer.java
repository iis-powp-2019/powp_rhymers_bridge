package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackable.IntArrayStack;
import edu.kis.vh.nursery.stackable.IntLinkedList;
import edu.kis.vh.nursery.stackable.IntStackableInterface;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntStackableInterface temp = new IntLinkedList();

    public FIFORhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }


    /* Used IntLinkedList because of object Node. It allows quick searching for last element of stack*/
    public FIFORhymer(IntStackableInterface intStackableInterface){
        super(intStackableInterface);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
