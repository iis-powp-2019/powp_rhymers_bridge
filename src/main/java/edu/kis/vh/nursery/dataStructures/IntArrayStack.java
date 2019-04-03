package edu.kis.vh.nursery.dataStructures;

import edu.kis.vh.nursery.IStackAndListSimilarities;
import edu.kis.vh.nursery.StructureValue;

public class IntArrayStack implements IStackAndListSimilarities {

    private int[] numbers = new int[StructureValue.getStackCapacity()];
    private int total = StructureValue.getMinTotalValue();

    public int getTotal() {
        return total;
    }



    @Override public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    @Override public boolean callCheck() {
        return total == StructureValue.getMinTotalValue();
    }

    @Override public boolean isFull() {
        return total == 11;
    }

    @Override public int peekaboo() {
        if (callCheck())
            return StructureValue.getMinTotalValue();
        return getNumbers()[total];
    }

    @Override public int countOut() {
        if (callCheck())
            return StructureValue.getMinTotalValue();
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
