package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntLinkedListAdapter;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntStack temp = new DefaultCountingOutRhymer().stack;
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		final int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
}
