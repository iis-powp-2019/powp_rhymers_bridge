package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Collections;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer countingOfRhymer = new DefaultCountingOutRhymer();

    public FIFORhymer(){ super();}

    public FIFORhymer(Collections collections){
        super(collections);
    }
    @Override
    public int countOut() {
        while (!callCheck())
            countingOfRhymer.countIn(super.countOut());
        int ret = countingOfRhymer.countOut();
        while (!countingOfRhymer.callCheck())
            countIn(countingOfRhymer.countOut());
        return ret;
    }
}
