package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
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


