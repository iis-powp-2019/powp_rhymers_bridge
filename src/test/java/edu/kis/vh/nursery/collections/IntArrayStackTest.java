package edu.kis.vh.nursery.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayStackTest {

    public IntArrayStack stack;

    @Before
    public void init(){
        if(stack == null){
            stack = new IntArrayStack();
        }
    }
    @Test
    public void getCurrentSize() {
        while(!stack.isFull()){
            stack.push(1);
        }
        assertEquals(stack.getCurrentSize(),11);

    }

    @Test
    public void push() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(stack.getCurrentSize(),1);
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isFull() {
        while(!stack.isFull()){
            stack.push(1);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void top() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertEquals(stack.top(),5);
        assertEquals(stack.getCurrentSize(),1);
    }

    @Test
    public void pop() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(stack.pop(),5);
        assertTrue(stack.isEmpty());
    }

    @After
    public void clear() {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}