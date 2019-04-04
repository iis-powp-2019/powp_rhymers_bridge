package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList list, DefaultCountingOutRhymer temp) {
        super(list);
        this.temp = temp;
    }

    public FIFORhymer(DefaultCountingOutRhymer temp) {
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
