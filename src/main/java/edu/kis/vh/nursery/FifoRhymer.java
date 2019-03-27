package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public FifoRhymer(IntArrayStack a, IntArrayStack b) {
		super (a);
		this.temp = new DefaultCountingOutRhymer(b);
	}
	
	
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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