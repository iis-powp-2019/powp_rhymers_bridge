package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data.DataProvider;
import edu.kis.vh.nursery.data.IntLinkedList;

/**
 * searching rhymer using FIFO sequence
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    //here is my last edited file

    //Najlepszym wyborem jest lista ze wzgledu na to,ze nie musimy z góry wiedziec ile danych bedzie
    private DataProvider dataForTesting = new IntLinkedList();

    public FIFORhymer() {

    }

    public FIFORhymer(DataProvider list) {
        super(list);
    }

    //pop element
    @Override
    public int countOut() {
        while (!callCheck())
            dataForTesting.countIn(super.countOut());

        int ret = dataForTesting.countOut();

        while (!dataForTesting.callCheck())
            countIn(dataForTesting.countOut());

        return ret;
    }

}
