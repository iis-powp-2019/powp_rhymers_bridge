package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

    public FIFORhymer(){
        super();

    }

    public FIFORhymer(IntLinkedList stackableInterface){
        super(stackableInterface);
    }

    @Override public int countOut() {
        while (!callCheck())
            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())
            countIn(getTemp().countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return TEMP;
    }
}
