package edu.kis.vh.nursery;

public interface Stackable {

    int NO_ANY_ELEMENTS = -1;

     void push(int in);
     boolean callCheck();
     boolean isFull();
     int top();
     int pop();
}
