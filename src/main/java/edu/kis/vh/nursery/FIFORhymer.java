package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        final int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    private DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
// alt + <- i alt + -> przelaczaja miedzy otwartymi kartami
