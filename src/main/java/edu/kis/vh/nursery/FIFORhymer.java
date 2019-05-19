package edu.kis.vh.nursery;


import edu.kis.vh.nursery.collection.IntCollection;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntCollection temp = new IntLinkedList();

    public FIFORhymer() {
    }

    public FIFORhymer(IntCollection stack) {
        super(stack);
    }

    @Override
    public int countOut() {

        while (!callCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }
}
