package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.IIntLinkedList;
import edu.kis.vh.nursery.datastructures.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

//    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    //IntLinkedList ponieważ countOut() (dla DefaultCountingOutRhymer) zwracało element który jako ostatni został
    //dodany a IntLinkedList zawiera zmienną last dzięki czemu jest wstanie szybko ten element zwrócić.
    private final IIntLinkedList temp = new IntLinkedList();

    public FIFORhymer() {
    }

    public FIFORhymer(IIntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            getTemp().push(super.countOut());
        }
        int ret = getTemp().pop();

        while (!getTemp().isEmpty()) {
            countIn(getTemp().pop());
        }
        return ret;
    }

    public IIntLinkedList getTemp() {
        return temp;
    }
}

//alt + strzałka w IntelliJ przechodzi pomiędzy otwartymi plikami