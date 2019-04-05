package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.StackListInterface;
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final StackListInterface temp = new IntLinkedList();

    public FIFORhymer(IntLinkedList intArrayStack) {
        super(intArrayStack);
    }

    public FIFORhymer() {
    }

    @Override
    public int countOut() {
        while (!intArrayStack.isEmpty())

            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.isEmpty())

            intArrayStack.push(temp.pop());

        return ret;
    }
}
