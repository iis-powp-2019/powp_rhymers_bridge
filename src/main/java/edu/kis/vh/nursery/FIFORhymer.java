package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntStorageInterface intStorageInterface) {
		super(intStorageInterface);
	}

	private final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())

			TEMP.countIn(super.countOut());

		int ret = TEMP.countOut();

		while (!TEMP.callCheck())

			countIn(TEMP.countOut());

		return ret;
	}

	public DefaultCountingOutRhymer getTemp() {
		return TEMP;
	}


	
//	alt ze strzalka w lewo lub w prawo przelacza miedzy otwartymi plikami w kartach
}
