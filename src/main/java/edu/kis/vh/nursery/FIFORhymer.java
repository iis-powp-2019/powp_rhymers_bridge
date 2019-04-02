package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntArrayStackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
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
