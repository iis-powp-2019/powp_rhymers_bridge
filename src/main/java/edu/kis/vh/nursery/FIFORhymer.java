package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())
            countIn(getTemp().countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

    public void setTemp(DefaultCountingOutRhymer temp) {
        this.temp = temp;
    }
}
