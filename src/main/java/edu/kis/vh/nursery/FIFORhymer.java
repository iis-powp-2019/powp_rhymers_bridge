package edu.kis.vh.nursery;

/**
 *  searching rhymer using FIFO sequence
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
//here is my last edited file
    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


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

    @Override public int pop() {
        return super.pop();
    }
}
