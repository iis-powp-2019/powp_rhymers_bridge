package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackModules.Data;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp;

    public FIFORhymer(Data data, DefaultCountingOutRhymer temp) {
        super(data);
        this.temp = temp;
    }

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
