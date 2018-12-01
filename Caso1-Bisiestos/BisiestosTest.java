import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest {
	/* 5 Test:
	--> 1) Happy path
	--> 2) Año negativo
	--> 3) No negativo divisible entre 4 pero no entre 100 ni 400
	--> 4) No negativo divisible entre 100, pero no entre 4 ni 400
	--> 5) No negativo divisible entre 4 y 100 pero no entre 400
	*/
	private int year;
	Bisiestos bis = new Bisiestos();

	//Test 1
	@Test
	public void testHappyPath(){
		year = 2000;
		assertTrue("Es bisiesto, fallo", true == bis.esBisiesto(year));
		System.out.println(year + " es bisiesto");
	}

	//Test 2
	//---> En mi test modifico el tipo de excepción a esperar
	@Test (expected = RuntimeException.class)
	public void testNegativeYear() {
		year = -2000;
		bis.esBisiesto(year);
	}

	//Test 3
	@Test
	public void testDivisibleBy4(){
		year = 1904;
		assertTrue("Es bisiesto, fallo", true == bis.esBisiesto(year));
		System.out.println(year + " es bisiesto");
	}

	//Test 4
	@Test
	public void testDivisibleBy100(){
		year = 700;
		assertTrue("No bisiesto, fallo", false == bis.esBisiesto(year));
		System.out.println(year + " no es bisiesto");
	}

	//Test 5
	@Test
	public void testDivisibleBy4And100(){
		year = 2200;
		assertTrue("No es bisiesto, fallo", false == bis.esBisiesto(year));
		System.out.println(year + " no es bisiesto");
	}
}
