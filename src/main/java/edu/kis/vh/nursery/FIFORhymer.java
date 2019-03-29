package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorage;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntStorage temp; //Lepszy niż IntArrayStack ponieważ nie ma narzuconej z pojemności

    public FIFORhymer(IntStorage intStorage, IntStorage temp)
    {
        super(intStorage);
        this.temp = temp;
    }

    public FIFORhymer()
    {
        super();
        this.temp = new IntLinkedList();
    }

    @Override
    int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        final int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}
