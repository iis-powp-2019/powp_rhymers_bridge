package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntLinkedList temp = new IntLinkedList();
/*
Implementacja LinkedList pozwala przechowywać nieograniczoną ilość elementów
*/
    public FIFORhymer(IntLinkedList intStackInterface) {
        super(intStackInterface);
    }

    public FIFORhymer() {
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
