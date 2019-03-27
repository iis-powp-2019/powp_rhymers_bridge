package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data.DataProvider;

/**
 * searching rhymer using FIFO sequence
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    //here is my last edited file
    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(){

    }

    public FIFORhymer(DataProvider list) {
        super(list);
    }

    //pop element
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

}
