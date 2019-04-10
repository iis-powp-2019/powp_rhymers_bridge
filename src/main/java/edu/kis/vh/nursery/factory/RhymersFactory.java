package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.StackInterface;

public interface RhymersFactory {

	StackInterface GetStandardRhymer();

	StackInterface GetFalseRhymer();

	StackInterface GetFIFORhymer();

	StackInterface GetHanoiRhymer();

}