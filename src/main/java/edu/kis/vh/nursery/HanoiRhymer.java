package edu.kis.vh.nursery;

/**
 *   class add integer to queue
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer(IntStack intStack) {
        super(intStack);
    }

    public HanoiRhymer() {
    }

    private int totalRejected = 0;

    /**
     *
     * @return how many attempts of adding value to queue was rejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     *
     * @param in - value which is added to queue
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
//    ctrl + shift + backspace - navigate to last edit location
}
