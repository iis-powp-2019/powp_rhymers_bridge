package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

	public DefaultCountingOutRhymer getStandardRhymer();

	public DefaultCountingOutRhymer getFalseRhymer();

	public DefaultCountingOutRhymer getFIFORhymer();

	public DefaultCountingOutRhymer getHanoiRhymer();
}
// Zad 3.1.3 lewy alt + strzałki = przęłaczanie między otwartymi kartami projektu | prawy alt to obracanie ekranu