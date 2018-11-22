import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.text.ParseException;


public class DescuentoBlackFridayTest{
	DescuentoBlackFriday priceoriginal = new DescuentoBlackFriday();
	private double price;

	@Test
	public void DescuentoBlackFridayTest() throws ParseException 
	{
		price = 30.0;
		double pricefinal = priceoriginal.PrecioFinal(price);
		assertTrue ("DescuentoBlackFridayTest", pricefinal == 21.0);
	}
}