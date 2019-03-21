package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

//TODO: think about extracting interface and using bridge.
public class DefaultCountingOutRhymer {
	private IntStorageInterface intStorage;

	public DefaultCountingOutRhymer(IntStorageInterface intStorage) {
		this.intStorage = intStorage;
	}

	public DefaultCountingOutRhymer() {
		this.intStorage = new IntLinkedList();
	}

	public void countIn(int in) {
		intStorage.push(in);
	}

	public boolean callCheck() {
		return intStorage.isEmpty();
	}

	public boolean isFull() {
		return intStorage.isFull();
	}

	public int peekaboo() {
		return intStorage.top();
	}

	public int countOut() {
		return intStorage.pop();
	}

}
