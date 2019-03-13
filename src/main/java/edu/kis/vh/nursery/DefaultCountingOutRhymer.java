package edu.kis.vh.nursery;

/**
 * @author modyfikacji Damian Golema
 *
 */
public class DefaultCountingOutRhymer 
{
	/**
	 * Maksymalny rozmiar stosu (tablica numbers)
	 */
	private static final int MAX_SIZE = 12;
	/**
	 * Wartość zwracanego błędy przez funkcie
	 */
	private static final int ERROR = -1;
	
	/**
	 * Stos 
	 */
	private int[] numbers = new int[MAX_SIZE];
	
	/**
	 * przechowuje rozmiar aktualny rozmiar stosu, ERROR jeśli pusty 
	 */
	private int total = ERROR;

	/**
	 * @param in jes dodawany na końcu stosa
	 */
	public void countIn(int in) 
	{
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return true jeśli stos jest pusty
	 */
	public boolean callCheck() 
	{
		return total == ERROR;
	}
	
	/**
	 * @return zwraca true jeśli stos jest pełny
	 */
	public boolean isFull() 
	{
		return total == MAX_SIZE-1;
	}

	/**
	 * @return zwraca ostatni element na stosie
	 */
	protected int peekaboo() 
	{
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	/**
	 * @return zwraca i usuwa ostatni element stosu
	 */
	public int countOut() 
	{
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
