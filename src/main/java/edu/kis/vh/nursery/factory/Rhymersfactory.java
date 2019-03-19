package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

	DefaultCountingOutRhymer GetStandardRhymer();

	DefaultCountingOutRhymer GetFalseRhymer();

	DefaultCountingOutRhymer GetFIFORhymer();

	DefaultCountingOutRhymer GetHanoiRhymer();

}
//Uzycie alt + <- pozwala nam cofnac sie do poprzedniego otwieranego okna, alt + -> podobnie, jednak przesuwamy sie do przodu w historii
