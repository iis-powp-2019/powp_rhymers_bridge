package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntArrayStack;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private final IntStack temp;

	public FifoRhymer() {
		super();
		temp = new IntArrayStack();
	}
	
	public FifoRhymer(IntStack in, IntStack in2) {
		super(in);
		temp = in2;
	}
	
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

//alt + <- oraz alt + -> zmieniają obecnie otwartą zakładkę 
//zgodnie z kolejnością edycji