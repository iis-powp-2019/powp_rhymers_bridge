package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructure.BestInterface;
import edu.kis.vh.nursery.datastructure.IntArrayStack;
import edu.kis.vh.nursery.datastructure.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private IntArrayStack temp = new IntArrayStack();
    //wybrana została arraystack'a gdyż bardzije pasuje do kodu FIFO. posiada metody potrzebne do wykonywania sie poprawnie FIFO


    public FIFORhymer() {
    }

    public FIFORhymer(BestInterface intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            getTemp().countIn(super.countOut());
        }

        int ret = getTemp().countOut();

        while (!getTemp().callCheck()) {
            countIn(getTemp().countOut());
        }

        return ret;
    }

    public IntArrayStack getTemp() {
        return temp;
    }

}
//ALT+ STRAŁKA przechodzi miedzy otwartymi plikami
