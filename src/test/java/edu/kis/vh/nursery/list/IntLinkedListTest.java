package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

	@Test
	public void testPush()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.countIn(5);
		lList.countIn(7);
		
		Assert.assertEquals(7, lList.peekaboo());
		lList.countOut();
		
		Assert.assertEquals(5, lList.peekaboo());
	}
	
	@Test
	public void testPop()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.countIn(5);
		lList.countIn(7);
		
		lList.peekaboo();
		
		Assert.assertEquals(5, lList.peekaboo());
	}
	
	@Test
	public void testIsEmpty()
	{
		IntLinkedList lList = new IntLinkedList();
		
		Assert.assertEquals(true, lList.callCheck());
		
		lList.countIn(5);
		Assert.assertEquals(false, lList.callCheck());
	}
	
	/**
	 * 
	 */
	@Test
	public void testTop()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.countIn(5);
		lList.countIn(7);
		
		Assert.assertEquals(7, lList.peekaboo());
	}
	
	/**
	 * 
	 */
	@Test
	public void testIsFull()
	{
		IntLinkedList lList = new IntLinkedList();
		
		lList.countIn(5);
		lList.countIn(7);
		
		Assert.assertEquals(false, lList.isFull());
		
		for(int i = 0; i < 10; i++)
		{
			lList.countIn(5);
		}
		
		Assert.assertEquals(true, lList.isFull());
	}

}
