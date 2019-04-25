package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntStack temp = new IntArrayStack();

    public FIFORhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().push(super.countOut());

        final int ret = getTemp().pop();

        while (!getTemp().isEmpty())

            countIn(getTemp().pop());

        return ret;
    }

    private IntStack getTemp() {
        return temp;
    }

}
// alt + <- i alt + -> przelaczaja miedzy otwartymi kartami
