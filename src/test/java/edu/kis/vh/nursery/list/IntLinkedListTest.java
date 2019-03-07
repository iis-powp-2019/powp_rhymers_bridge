package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

	@Test
	public void testPush()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.push(5);
		lList.push(7);
		
		Assert.assertEquals(7, lList.top());
		lList.pop();
		
		Assert.assertEquals(5, lList.top());
	}
	
	@Test
	public void testPop()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.push(5);
		lList.push(7);
		
		lList.pop();
		
		Assert.assertEquals(5, lList.top());
	}
	
	@Test
	public void testIsEmpty()
	{
		IntLinkedList lList = new IntLinkedList();
		
		Assert.assertEquals(true, lList.isEmpty());
		
		lList.push(5);
		Assert.assertEquals(false, lList.isEmpty());
	}
	
	/**
	 * 
	 */
	@Test
	public void testTop()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.push(5);
		lList.push(7);
		
		Assert.assertEquals(7, lList.top());
	}
	
	/**
	 * 
	 */
	@Test
	public void testIsFull()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.push(5);
		lList.push(7);
		
		Assert.assertEquals(false, lList.isFull());
		
		for(int i = 0; i < 10; i++)
		{
			lList.push(5);
		}
		
		Assert.assertEquals(true, lList.isFull());
	}

}
