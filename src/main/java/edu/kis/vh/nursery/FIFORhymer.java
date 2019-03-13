package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

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
