package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IntStorageInterface intStorageInterface) {
        super(intStorageInterface);
    }

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
     * @param in value to be added to the storage
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
