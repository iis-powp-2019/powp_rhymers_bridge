package edu.kis.vh.nursery.ownStackImplementations;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class NodeTest {

    @Test
    public void testGetValue() {
        int val = 4;
        Node node = new Node(val);
        assertThat(val, is(node.getValue()));
    }

    @Test
    public void testSetAndGetPrev() {
        int val1 = 4;
        int val2 = 123;
        Node node1 = new Node(val1);
        Node node2 = new Node(val2);
        node1.setPrev(node2);
        assertThat(node2, is(node1.getPrev()));
    }


    @Test
    public void testSetAndGetNext() {
        int val1 = 4;
        int val2 = 123;
        Node node1 = new Node(val1);
        Node node2 = new Node(val2);
        node1.setNext(node2);
        assertThat(node2, is(node1.getNext()));
    }

    @Test
    public void testSetAndGetPrevGetValue() {
        int val1 = 4;
        int val2 = 123;
        Node node1 = new Node(val1);
        Node node2 = new Node(val2);
        node1.setPrev(node2);
        assertThat(node2.getValue(), is(node1.getPrev().getValue()));
    }


    @Test
    public void testSetAndGetNextGetValue() {
        int val1 = 4;
        int val2 = 123;
        Node node1 = new Node(val1);
        Node node2 = new Node(val2);
        node1.setNext(node2);
        assertThat(node2.getValue(), is(node1.getNext().getValue()));
    }

}