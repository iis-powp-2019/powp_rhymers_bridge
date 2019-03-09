package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
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
* Kombinacja alt + strzałka w przypadku Intellij powoduje przełączenie się pomiędzy kartami
*
* W Eclipsie umożliwia nam to powrów to poprzednio edytowanego miejsca
*
* Odpowiednikiem tego skrótu w Intellij jest ctr + alt + strzałka
*
* */
