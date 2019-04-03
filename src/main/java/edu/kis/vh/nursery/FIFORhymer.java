package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructure.BestInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(BestInterface intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            getTemp().countIn(super.countOut());
        }

        int ret = getTemp().countOut();

        while (!getTemp().callCheck()) {
            countIn(getTemp().countOut());
        }

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
//ALT+ STRAŁKA przechodzi miedzy otwartymi plikami
