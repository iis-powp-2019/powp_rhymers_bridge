package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final Stackable temp = new IntArrayStack();

	public FIFORhymer() {
	}

	public FIFORhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			
		countIn(temp.pop());
		
		return ret;
	}
}
