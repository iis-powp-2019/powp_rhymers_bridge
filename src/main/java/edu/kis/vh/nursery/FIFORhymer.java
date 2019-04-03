package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IIntStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private IntLinkedList temp = new IntLinkedList();
	// W przypadku FIFO lepiej uzyc listy, gdyz zawsze przegladamy kolekcje od poczatku, wiec zawsze interesuje nas
	// pierwszy dodany element, czyli poczatek listy

	public FIFORhymer(IIntStack iIntStack) {
		super(iIntStack);
	}

	public FIFORhymer() {
		super();
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}
//Kombinacje tych klawiszy przelaczaja otwarte karty plików