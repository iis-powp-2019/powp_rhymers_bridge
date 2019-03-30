package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.stacks.LinkedListOfIntegers;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private LinkedListOfIntegers linkedListOfIntegers = new LinkedListOfIntegers();

    public FIFORhymer(LinkedListOfIntegers linkedListOfIntegers) {
        super(linkedListOfIntegers);
    }

    public FIFORhymer(){

    }

    @Override public int countOut() {
        while (!isEmpty())

            linkedListOfIntegers.push(super.countOut());

        int returningValue = linkedListOfIntegers.pop();

        while (!linkedListOfIntegers.isEmpty()){
            countIn(linkedListOfIntegers.pop());
        }

        return returningValue;
    }


}
