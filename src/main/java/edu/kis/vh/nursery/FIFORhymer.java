package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structure.DataStructure;
import edu.kis.vh.nursery.data_structure.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {


    // Szybdze będzie użycie InrArrayStack, ponieważ działamy tam na tablicy i nie tworzymy kolejnych obiektów.
    // Jednak IntLinkedList nie ograniacza nas co do ilości elementów.

    private final DataStructure temp = new IntLinkedList();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(DataStructure dataStructure) {
        super(dataStructure);
    }

    @Override public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        final int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}
