package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_INDEX = 11;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;
    /**
     * dodaj na stos
     * @parm in liczba którą chcesz dodać
     */

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *Sprawdz czy stos pusty
     * @return prawde jesli pusty
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     *sprawdz czy stos pełny
     * @return prawde jeśli pełny
     *
     */
    public boolean isFull() {
        return total == MAX_INDEX;
    }
    /**
     * zwraca najweksza wartość stosu
     * @return -1 gdy pusty, liczba jeśli nie
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }
    /**
     *Zwraca koniec stosu
     * @return -1 gdy pusty, liczba jeśli nie
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
