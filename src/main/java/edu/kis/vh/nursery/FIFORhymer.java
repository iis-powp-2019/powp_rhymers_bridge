package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackModules.Data;
import edu.kis.vh.nursery.stackModules.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntLinkedList temp = new IntLinkedList(); //linked list doesn't have size limitation

    public FIFORhymer(Data data) {
        super(data);
    }
    public FIFORhymer(){

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
