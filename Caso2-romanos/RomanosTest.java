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

	// Test para comprobar los ss que son bisiestos según el bloque b2:
	// "ss divisibles entre 4, entre 100 y entre 400"
	@Test
	public void testParasBisiestoSegunB2()
	{
		s = 1600;
		boolean convierte = roman.convierte(s);
		assertTrue ("testParasBisiestoSegunB2", convierte == true);
	}

	// Test para comprobar los ss que no son bisiestos según el bloque b3:
	// "Resto de ss"
	@Test
	public void testParasNoBisiestoSegunB3()
	{
		s = 1;
		boolean convierte = roman.convierte(s);
		assertTrue ("testParasNoBisiestoSegunB3", convierte == false);
	}

	// Test para comprobar que un s es inválido según el bloque b4:
	// "ss inválidos (números negativos y el 0)."
	@Test (expected = RuntimeException.class)
	public void testParasInvalido()
	{
		s = -1;
		roman.convierte(s);
	}
}