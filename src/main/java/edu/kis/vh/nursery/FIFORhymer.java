package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Collections;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    //Najlepsza będzie linkedList ponieważ w liście zawsze bez przechodzenia mamy dostęp do jej ogona
    private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer(new IntLinkedList());

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(Collections collections) {
        super(collections);
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
}
