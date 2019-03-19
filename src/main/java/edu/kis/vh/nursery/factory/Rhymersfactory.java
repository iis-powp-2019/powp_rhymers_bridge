package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public DefaultCountingOutRhymer GetFIFORhymer();

	public DefaultCountingOutRhymer GetHanoiRhymer();

}
//Uzycie alt + <- pozwala nam cofnac sie do poprzedniego otwieranego okna, alt + -> podobnie, jednak przesuwamy sie do przodu w historii
