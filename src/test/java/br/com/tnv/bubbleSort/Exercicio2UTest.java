package br.com.tnv.bubbleSort;

import org.junit.Assert;
import org.junit.Test;

public class Exercicio2UTest {
	
	int[] arrayEsperado = { 0, 1, 2, 3, 4, 5, 6, 7 };
	
	@Test
	public void deveTestarOrdenacao() {
		int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };

		int[] array2 = BubbleSort.ordernar(array);		
		
		Assert.assertArrayEquals(arrayEsperado, array2);
		
	}
}
