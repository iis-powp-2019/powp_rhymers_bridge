package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

/*
* w intelij alt-left przeskakukje na otwartych kartach w lewo, natomiast alt-right umożliwia zmienianie aktualnie
* otwartych kart w prawą stronę
*/


