package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.StackableInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer(){
        super();
    }

    public HanoiRhymer(StackableInterface stackableInterface){
        super(stackableInterface);
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}

// W InteliJ IDEA: Kombinacje klawiszy "alt + <-" oraz "alt + ->" umożliwiają poruszanie się po otwartych plikach w edytorze.

