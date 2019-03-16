package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
			getTemp().countIn(super.countOut()); //formatowanie kodu: brak wcięcia
		
		int ret = getTemp().countOut();
		
		while (!getTemp().callCheck())
			
			countIn(getTemp().countOut()); //formatowanie kodu: brak wcięcia
		
		return ret;
	}

	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

}
