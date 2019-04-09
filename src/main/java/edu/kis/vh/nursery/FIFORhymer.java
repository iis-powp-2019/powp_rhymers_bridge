package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntArrayStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntStack temp;

    public FIFORhymer() {
        super();
        //Array Stack powinien być szybszy
        this.temp = new IntArrayStack();
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());
        return ret;
    }
}

