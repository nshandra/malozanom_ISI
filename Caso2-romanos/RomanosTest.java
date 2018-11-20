// Instrucciones de compilación:
// javac -cp .:./hamcrest-core-1.3.jar:./junit-4.12.jar RomanNumeralTest.java

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
	RomanNumeral roman = new RomanNumeral();   	// Test fixture
	private String s;

	// Test para comprobar los ss que son bisiestos según el bloque b1:
	// "ss divisibles entre 4 pero no entre 100"
	@Test
	public void testParasBisiestoSegunB1()
	{
		s = I;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1);
	}

	@Test
	public void testParasBisiestoSegunB2()
	{
		s = V;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 5);
	}

	@Test
	public void testParasBisiestoSegunB3()
	{
		s = X;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 10);
	}

	@Test
	public void testParasBisiestoSegunB4()
	{
		s = L;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 50);
	}

	@Test
	public void testParasBisiestoSegunB5()
	{
		s = C;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 100);
	}

	@Test
	public void testParasBisiestoSegunB6()
	{
		s = D;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 50);
	}

	@Test
	public void testParasBisiestoSegunB7()
	{
		s = M;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1000);
	}

	@Test
	public void testParasBisiestoSegunB8()
	{
		s = vii;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 7);
	}

	@Test (expected = RuntimeException.class)
	public void badRoman()
	{
		s = xiiii;
		roman.convierte(s);
	}

	@Test
	public void testParasBisiestoSegunB9()
	{
		s = I;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1);
	}

	@Test
	public void testParasBisiestoSegunB10()
	{
		s = I;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1);
	}

	@Test
	public void testParasBisiestoSegunB11()
	{
		s = I;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1);
	}

	@Test
	public void testParasBisiestoSegunB12()
	{
		s = I;
		String decimal = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB1", decimal == 1);
	}
}