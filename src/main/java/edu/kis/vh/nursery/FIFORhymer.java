package edu.kis.vh.nursery;


import edu.kis.vh.nursery.Containers.IntLinkedList;
import edu.kis.vh.nursery.Containers.StackInterface;

public class FIFORhymer extends DefaultCoutingOutRhymer {

	public final StackInterface temp = new IntLinkedList();

	public FIFORhymer (){}
	public FIFORhymer(StackInterface stack) {
		super(stack);
	}

    /**
     * method iterates through stack and returns first element
     * @return First element in list
     */
	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
