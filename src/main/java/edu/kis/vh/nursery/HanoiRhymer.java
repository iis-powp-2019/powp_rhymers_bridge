package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;
import edu.kis.vh.nursery.stack.stacks.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected;

    public HanoiRhymer(Stack stack, int totalRejected) {
        super(stack);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(Stack stack){
        super(stack);
    }

    public HanoiRhymer(){

    }

    int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > currentNumber()){
            setTotalRejected(getTotalRejected() + 1);
        } else{
            super.countIn(in);
        }
    }



    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
