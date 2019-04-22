package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackBulider.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer(IntLinkedList intLinkedList, DefaultCountingOutRhymer temp) {
        super(intLinkedList);
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
