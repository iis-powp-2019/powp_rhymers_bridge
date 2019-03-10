package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Factory for different implementations of Rhymers
 */
public class DefaultRhymersFactory implements RhymersFactory {

	/**
	 * @return DefaultCountingOutRhymer - default implementation of Rhymer
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * @return DefaultCountingOutRhymer - default implementation of Rhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * @return FIFO-based implementation of Rhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	/**
	 * @return Hanoi-based implementation of Rhymer
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
