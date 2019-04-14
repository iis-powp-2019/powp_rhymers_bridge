package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IIntCounter;
import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * FIFORhymer extends defaultCountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private IIntCounter temp = new IntArrayStack();
	//najlepiej użyć raczej tablicy niż listy

	public FIFORhymer()
	{

	}

	public FIFORhymer(IntLinkedList intCounter)
	{
		super(intCounter);
	}

	/**
	 * countOut
	 * @return
	 */
	@Override
	public int pop() {
		while (!isEmpty())
			getTemp().push(super.pop());
		
		int ret = getTemp().pop();
		
		while (!getTemp().isEmpty())
			push(getTemp().pop());
		
		return ret;
	}

	/**
	 * getTemp
	 * @return
	 */
	public IIntCounter getTemp()
	{
		return temp;
	}
}
