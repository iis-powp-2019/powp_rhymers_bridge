package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntStackInterface intStackInterface, int totalRejected) {
        super(intStackInterface);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(IntStackInterface intStackInterface) {
        super(intStackInterface);
    }

    public HanoiRhymer() {
    }

    int reportRejected() {
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

/*
* Kombinacja alt + strzałka w przypadku Intellij powoduje przełączenie się pomiędzy kartami
*
* W Eclipsie umożliwia nam to powrów to poprzednio edytowanego miejsca
*
* Odpowiednikiem tego skrótu w Intellij jest ctr + alt + strzałka
*
* */
