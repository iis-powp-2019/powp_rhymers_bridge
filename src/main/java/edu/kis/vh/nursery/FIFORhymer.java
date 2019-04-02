package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.LinkedListOfIntegers;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // 3.1.11 - w tym przypadku lepsze będzie poprzednie rozwiązanie, zawierające klasę DefaultCountingOutRhymer z uwagi na to,
    // że w tamtej klasie dochodzi do 'wyboru' implementacji naszego stosu.
    private Stack stack = new LinkedListOfIntegers();

    @Override public int countOut() {
        while (!callCheck()) {
            stack.countIn(super.countOut());
        }

        int ret = stack.countOut();
        while (!stack.callCheck()) {
            countIn(stack.countOut());
        }

        return ret;
    }
}
