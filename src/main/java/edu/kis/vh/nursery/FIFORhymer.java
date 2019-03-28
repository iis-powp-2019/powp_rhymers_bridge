package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
	public FIFORhymer(IntStorageInterface intStorage) {
		super(intStorage);
	}

	public FIFORhymer()
    {
        super();
    }

	private final IntStorageInterface temp = new IntArrayStack();
	
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().push(super.countOut());
		
		int ret = getTemp().pop();
		
		while (!getTemp().isEmpty())
			countIn(getTemp().pop());
		
		return ret;
	}

	private IntStorageInterface getTemp() {
		return temp;
	}

}
