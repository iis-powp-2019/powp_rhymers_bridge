package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private StackInterface temp = new IntArrayStack();
    //used IntArrayStack because i will work faster than IntLinkedList.
    //IntArrayStack use fixed size array so it memory and computational complexity is less than dynamic list in IntLinkedLIst


    public FIFORhymer() {
        super();
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
