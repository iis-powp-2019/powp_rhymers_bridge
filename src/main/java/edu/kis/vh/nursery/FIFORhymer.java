package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorage;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp;

    public FIFORhymer(IntStorage intStorage, DefaultCountingOutRhymer temp)
    {
        super(intStorage);
        this.temp = temp;
    }

    public FIFORhymer()
    {
        super();
        this.temp = new DefaultCountingOutRhymer();
    }

    @Override
    int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
