package edu.kis.vh.nursery.list;

/**
 * @author tobia
 * Klasa 
 */
public class IntLinkedList {

	private Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
		}
	}

	/**
	 * Sprawdzanie listy
	 * @return zwraca prawde jeśli lista jest pusta albo fałsz jeśli coś w niej jest
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Sprawdza czy lista jest pełna
	 * @return zawsze fałszywe
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Zwraca top wartość
	 * @return wartość ostatniego elementu  albo -1 jeśli jest pusta
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/**
	 * Usuwanie elementu z listy
	 * @return wartość elementu albo -1 jeśli jest pusty
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
        last = last.getPrev();
		return ret;
	}

}
