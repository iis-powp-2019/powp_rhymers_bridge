package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntLinkedList;
import edu.kis.vh.nursery.containers.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final Stack temp = new IntLinkedList(); // Zapewnia nieograniczoną pojemność, a w dużej tablicy nie zajmuje jednego bloku w pamięci

    public FIFORhymer() {
    }

    public FIFORhymer(Stack intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!isCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())
            countIn(temp.pop());

        return ret;
    }
}
