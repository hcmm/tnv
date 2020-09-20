package br.com.tnv.bubbleSort;

public class BubbleSort {

	public static int[] ordernar(int[] array) {

		if (array == null || array.length == 0)
			throw new RuntimeException("Lista invalida");

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				int primeiroPar = array[j];
				int SegundoPar = array[j + 1];

				if (primeiroPar > SegundoPar) {

					array[j] = SegundoPar;
					array[j + 1] = primeiroPar;
				}

			}
		}

		return array;
	}

	

}
