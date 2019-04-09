package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp;

    public FIFORhymer() {
        super();
        this.temp = new DefaultCountingOutRhymer();
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

