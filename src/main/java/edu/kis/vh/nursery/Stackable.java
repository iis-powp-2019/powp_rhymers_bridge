package edu.kis.vh.nursery;

public interface Stackable {

    int NO_ANY_ELEMENTS = 0;

     void push(int in);
     boolean isFull();
     int top();
     int pop();
     boolean isEmpty();
}
