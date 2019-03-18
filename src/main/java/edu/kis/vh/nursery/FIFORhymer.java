package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    @Override
    public int countOut() {
        while (!callCheck())
            this.countIn(this.countOut());

        int ret = this.countOut();

        while (!this.callCheck())
            countIn(this.countOut());

        return ret;
    }


}
