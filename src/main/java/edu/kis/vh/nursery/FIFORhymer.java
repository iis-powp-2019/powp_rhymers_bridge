package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.DataStructure;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DataStructure temp = new IntLinkedList();
    //IntLinkedList nie ma ograniczenia wielkości

    public FIFORhymer(DataStructure dataStructure) {
        super(dataStructure);
    }

    public FIFORhymer() {
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
