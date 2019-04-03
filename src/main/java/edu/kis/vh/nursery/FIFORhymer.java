package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IStackAndListSimilarities temp = new IntLinkedList();

    public FIFORhymer(IntArrayStack intArrayStack) {
        this.temp = intArrayStack;
    }

    public FIFORhymer() {

    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        this.temp = intLinkedList;
    }

    //Odp: Najlepszy wybór to implementacja listy, ponieważ jest ona bardziej ealastyczna niż stos

    @Override public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    public IStackAndListSimilarities getTemp() {
        return temp;
    }
}
