package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    //TODO: DELETE reportRejected, does the same thing as getTotalRejected

    /**
     * Return the total ammount of rejected values
     * @return ammount of rejected values in int
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds values to the array if array isn't full or increment totalRejected if array is full
     * @param in value to be added to the list
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Return the total ammount of rejected values
     * @return ammount of rejected values in int
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}
