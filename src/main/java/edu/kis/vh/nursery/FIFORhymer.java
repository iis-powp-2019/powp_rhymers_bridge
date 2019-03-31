package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structure.DataStructure;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(DataStructure dataStructure) {
        super(dataStructure);
    }

    @Override public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
