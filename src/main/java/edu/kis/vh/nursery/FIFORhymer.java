package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntegerLinkedList;
import edu.kis.vh.nursery.stack.StackCollection;

public class FIFORhymer extends DefaultCountingOutRhymer {

	// It is better to use LinkedList, because we can put arbitrary number of elements there
	// With ArrayStack, we would need to resize array (time expensive) or create bigger one (memory expensive)
	private final StackCollection rhymer = new IntegerLinkedList();

	public FIFORhymer() {
	}

	public FIFORhymer(StackCollection collection) {
		super(collection);
	}

	@Override
	public int countOut() {
		while (!isEmpty())
			rhymer.push(super.countOut());
		
		int valueToReturn = rhymer.pop();
		
		while (!rhymer.isEmpty())
			countIn(rhymer.pop());
		
		return valueToReturn;
	}
}
