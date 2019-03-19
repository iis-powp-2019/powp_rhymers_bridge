package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();

}
//Uzycie alt + <- pozwala nam cofnac sie do poprzedniego otwieranego okna, alt + -> podobnie, jednak przesuwamy sie do przodu w historii
