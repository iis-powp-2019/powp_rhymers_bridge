package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntLinkedList intStorageInterface) {
        super(intStorageInterface);
    }

    @Override
    public int countOut() {

        while (!callCheck())
            TEMP.countIn(super.countOut());

        int ret = TEMP.countOut();

        while (!TEMP.callCheck())
            countIn(TEMP.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return TEMP;
    }
}
