package edu.kis.vh.nursery.storage;

public interface IntStorageInterface {
	
	static final int RETURN_DEFAULT = 0;
	
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int peekaboo();

    int pop();


}
