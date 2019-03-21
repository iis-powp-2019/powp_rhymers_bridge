package edu.kis.vh.nursery;

public class IntArrayStack {
    /**
     *  Maksymalna pojemność stosu klasy
     */
    private static final int capacity = 12;

    /**
     *  Wartość błędu gdy indeks przekracza wielkość tablicy
     */
    private static final int indexOutOfArray = -1;

    /**
     *  Stos klasy
     */
    private int[] numbers = new int[capacity];

    /**
     *  Zminna informująca o stanie stosu
     */
    private int total = getIndexOutOfArray();


    /**
     * Wprowadzenie nowej wartości do stosu klasy
     *
     * @param in liczba, która będzie dodana do stosu jeśli ten nie jest pełen
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *  Sprawdzenie czy stos jest pusty
     *
     *  @return True - stos pusty, False - stos pełny
     */
    public boolean callCheck() {
        return total == getIndexOutOfArray();
    }

    /**
     *  Sprawdzenie czy stos jest pełen
     *
     * @return True - stos pełny, False - stos pusty
     */
    public boolean isFull() {
        return total == capacity - 1;
    }

    /**
     *  Odczytanie liczby ze stosu
     *
     * @return liczba ze stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return getIndexOutOfArray();
        return numbers[total];
    }

    /**
     *  Odcztanie liczby ze stosu o ineksie o jeden mniejszy od wartości wskaźnika stosu
     *
     * @return liczba ze stosu o ineksie o jeden mniejszy od wartości wskaźnika stosu
     */
    public int countOut() {
        if (callCheck())
            return getIndexOutOfArray();
        return numbers[total--];
    }


    public static int getCapacity() {
        return capacity;
    }


    public static int getIndexOutOfArray() {
        return indexOutOfArray;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getTotal() {
        return total;
    }



}
