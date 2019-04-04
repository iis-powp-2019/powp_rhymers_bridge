package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(StackInterface stackInterface) {
        super(stackInterface);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//Używam inteliJ i ctrl+left/right arrow skacze po słowach
