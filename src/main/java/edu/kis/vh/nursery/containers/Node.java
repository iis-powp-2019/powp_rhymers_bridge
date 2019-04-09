package edu.kis.vh.nursery.containers;

public class Node {

	private int value;
	private Node prev;
	private Node next;

	public Node(final int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
//	Skróty klawiszowe alt + -> oraz alt + <- służą
//	do poruszania się pomiędzy ostatnio otwieranymi plikami
//	alt + <- służy do przechodzenia do poprzednio otwartego pliku
//	a alt + -> służy do przechodzenia do póniej otwartych plików w 
//	stosunku do obecnie otwartego jezeli sie cofamy

}
