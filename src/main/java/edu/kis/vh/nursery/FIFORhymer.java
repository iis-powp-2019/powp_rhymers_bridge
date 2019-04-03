package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.IIntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(IIntLinkedList intLinkedList) {
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

//alt + strzałka w IntelliJ przechodzi pomiędzy otwartymi plikami