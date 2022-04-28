package array;

import java.util.Arrays;

public class PrintAnyType {

	public void Print(int[] array1) {
		Arrays.stream(array1).forEach(element -> System.out.print(element + " "));
	}

}
