package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();
}
// Zad 3.1.3 lewy alt + strzałki = przęłaczanie między otwartymi kartami projektu | prawy alt to obracanie ekranu