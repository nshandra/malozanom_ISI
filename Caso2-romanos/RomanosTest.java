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
	public void RomanTest()
	{
		s = i;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 1);
	}

	@Test
	public void testParasBisiestoSegunB2()
	{
		s = v;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 5);
	}

	@Test
	public void testParasBisiestoSegunB3()
	{
		s = x;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 10);
	}

	@Test
	public void testParasBisiestoSegunB4()
	{
		s = l;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 50);
	}

	@Test
	public void testParasBisiestoSegunB5()
	{
		s = c;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 100);
	}

	@Test
	public void testParasBisiestoSegunB6()
	{
		s = d;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 50);
	}

	@Test
	public void testParasBisiestoSegunB7()
	{
		s = m;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 1000);
	}

	@Test
	public void testParasBisiestoSegunB8()
	{
		s = vii;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 7);
	}

	@Test (expected = RuntimeException.class)
	public void badRoman()
	{
		s = viiii;
		bisiesto.esBisiesto(año);
	}

	@Test
	public void testParasBisiestoSegunB9()
	{
		s = iv;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 4);
	}
	@Test
	public void testParasBisiestoSegunB9bis()
	{
		s = ix;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 9);
	}

	@Test
	public void RomanTest10()
	{
		s = xl;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 40);
	}

	@Test
	public void RomanTest10bis()
	{
		s = xc;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 90);
	}

	@Test
	public void RomanTest11()
	{
		s = cd;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 400);
	}

	@Test
	public void RomanTest11bis()
	{
		s = cm;
		String decimal = roman.convierte(s);
		assertTrue ("RomanTest", decimal == 900);
	}

	@Test (expected = RuntimeException.class)
	public void RomanTest12()
	{
		s = p;
		String decimal = roman.convierte(s);
	}
}