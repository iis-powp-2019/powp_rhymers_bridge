package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck()) {
            getTemp().countIn(super.countOut());
        }
        int ret = getTemp().countOut();

        while (!getTemp().callCheck()) {
            countIn(getTemp().countOut());
        }
        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}

//alt + strzałka w IntelliJ przechodzi pomiędzy otwartymi plikami