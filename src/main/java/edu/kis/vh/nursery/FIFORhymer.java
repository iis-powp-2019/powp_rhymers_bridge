package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
	
	private final IntArrayStack TEMP = new IntArrayStack();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntStorageInterface intStorageInterface) {
		super(intStorageInterface);
	}


	@Override
	public int countOut() {
		while (!callCheck())

			TEMP.push(super.countOut());

		int ret = TEMP.pop();

		while (!TEMP.isEmpty())

			countIn(TEMP.pop());

		return ret;
	}

	public IntArrayStack getTemp() {
		return TEMP;
	}

	//używanie IntArrayStack będzie szybsze

	
//	alt ze strzalka w lewo lub w prawo przelacza miedzy otwartymi plikami w kartach
}
