package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public int countOut() {
        while (!isEmpty())

            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())

            push(temp.pop());

        return ret;
    }
}
