package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntLinkedList;

/**
 * @author 209515
 * Klasa wyliczaki opartej o listę
 */
public class DefaultCountingOutRhymer {

	private IStackInterface list;

	/**
	 * @param in
	 * Metoda dodaje element in do listy
	 */
	public void countIn(final int in) {
		list.countIn(in);
	}

	/**
	 * @return
	 * Metoda sprawdza czy lista jest pusta
	 */
	public boolean callCheck() {
		return list.callCheck();
	}

	/**
	 * @return
	 * Metoda sprawdza czy lista jest pełna
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return
	 * Metoda zwraca ostatni element listy
	 */
	public int countOut() {
		return list.countOut();
	}

	/**
	 * Domyslny konstruktor klasy
	 */
	public DefaultCountingOutRhymer() {
		list = new IntLinkedList();
	}
	
	/**
	 * @param list
	 * Konstruktor inicjalizujacy pole list
	 */
	public DefaultCountingOutRhymer(IntLinkedList list) {
		super();
		this.list = list;
	}

	public int peekaboo() {
		return list.peekaboo();
	}
	

}
