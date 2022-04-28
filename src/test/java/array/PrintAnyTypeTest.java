package array;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintAnyTypeTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@After
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	public void testPrint() {
		PrintAnyType printArray = new PrintAnyType();
		int[] testArray = { 4, 3 };
		printArray.Print(testArray);
		Assert.assertEquals("4 3", outputStreamCaptor.toString().trim());
	}
}
