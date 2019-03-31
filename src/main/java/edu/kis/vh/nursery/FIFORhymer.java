package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FIFORhymer(Stack stack) {
        super(stack);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
