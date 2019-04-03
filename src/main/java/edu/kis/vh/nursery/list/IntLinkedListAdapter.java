package edu.kis.vh.nursery.list;

public class IntLinkedListAdapter implements Stackable {
	
	private IntLinkedList list;
	
	public IntLinkedListAdapter(IntLinkedList list) {
		this.list = list;
	}

	@Override
	public int getTotal() {
		int total = 0;
		IntLinkedList tmp = list;
		while (!tmp.isEmpty()) {
			tmp.pop();
			total++;
		}
		return total;
	}

	@Override
	public void countIn(int in) {
		list.push(in);
		
	}

	@Override
	public boolean callCheck() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return list.isFull();
	}

	@Override
	public int countOut() {
		return list.pop();
	}

	@Override
	public int peekaboo() {
		return list.top();
	}

}