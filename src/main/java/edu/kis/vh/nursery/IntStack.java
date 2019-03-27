package edu.kis.vh.nursery;


//interface
public class IntStack extends IntArrayStack {

	
	
	
	
	@Override
	public int getTotal() {
		return temp.getTotal();
	}

	@Override
	public void countIn(int in) {
		temp.push(in);
	}
	
	@Override
	public int countOut() {
		
		return 0;
	}

	@Override
	public boolean callCheck() {
		return temp.isEmpty();
	}

	@Override
	public boolean isFull() {
		return temp.isFull();
	}

	@Override
	public int peekAboo() {
		return temp.top();
	}
}
