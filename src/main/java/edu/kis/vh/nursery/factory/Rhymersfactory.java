package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface Rhymersfactory {
	
		DefaultCountingOutRhymer GetStandardRhymer();
		
		DefaultCountingOutRhymer GetFalseRhymer();
		
		DefaultCountingOutRhymer GetFIFORhymer();
		
		DefaultCountingOutRhymer GetHanoiRhymer();
		
	}
