package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(IntStorageInterface intStorageInterface) {
        super(intStorageInterface);
    }

    @Override public int countOut() {
        while (!callCheck())
            getTemp().countIn(super.countOut());

        final int ret = getTemp().countOut();

        while (!getTemp().callCheck())
            countIn(getTemp().countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
