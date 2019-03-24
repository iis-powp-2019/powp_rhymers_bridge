package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
	public FIFORhymer(IntStorageInterface intStorage) {
		super(intStorage);
	}

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());
		
		int ret = getTemp().countOut();
		
		while (!getTemp().callCheck())
			countIn(getTemp().countOut());
		
		return ret;
	}

	private DefaultCountingOutRhymer getTemp() {
		return temp;
	}

}
