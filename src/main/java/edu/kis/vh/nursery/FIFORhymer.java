package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override public int countOut() {
        while (!isEmpty())

            getDefaultCountingOutRhymer().countIn(super.countOut());

        int returningValue = getDefaultCountingOutRhymer().countOut();

        while (!getDefaultCountingOutRhymer().isEmpty()){
            countIn(getDefaultCountingOutRhymer().countOut());
        }

        return returningValue;
    }

    public DefaultCountingOutRhymer getDefaultCountingOutRhymer() {
        return defaultCountingOutRhymer;
    }

    public void setDefaultCountingOutRhymer(DefaultCountingOutRhymer defaultCountingOutRhymer) {
        this.defaultCountingOutRhymer = defaultCountingOutRhymer;
    }
}
