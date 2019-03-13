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

    private DefaultCountingOutRhymer getTemp() {
        return temp;
    }

    private void setTemp(DefaultCountingOutRhymer temp) {
        this.temp = temp;
    }
}
// alt + <- i alt + -> przelaczaja miedzy otwartymi kartami