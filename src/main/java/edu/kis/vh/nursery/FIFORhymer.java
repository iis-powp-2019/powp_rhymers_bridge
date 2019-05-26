package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntCollection temp = new IntLinkedList();

    public FIFORhymer() {
    }


    public FIFORhymer(IntLinkedList stack) {
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

//Najlepszy wyborem będzie IntLinkedList gdyż nie ma ograniczenia na dłogość stosu