package edu.kis.vh.nursery;


import edu.kis.vh.nursery.collection.IntCollection;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(IntCollection stack) {
        super(stack);
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
