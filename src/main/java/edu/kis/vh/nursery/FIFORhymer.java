package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntLinkedList temp = new IntLinkedList();

	public FIFORhymer(Stackable stack) {
		super(stack);
	}

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		final int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}


//Ctrl + strzalka w lewo porusza się po otwartych klasach wedle historii otworzenia wstecz, a ctrl + strzalka w prawo w przód

//IntLinkedList będzie najlepszym wyborem, ponieważ temp musi być w stanie pomieścić różną ilość elementów w zależności
//od wielkości właściwego stosu. Jeżeli temp byłby IntArrayStack, mogłoby dojść do wyjścia poza dopuszczalny
//obszar pamięci i rzucenia wyjątku ArrayIndexOutOfBoundsException