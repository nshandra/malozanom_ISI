import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;

//---> Añadido para probar su DescuentoBlackFriday
import java.text.ParseException;


public class DescuentoBlackFridayTest {

	private double price;
	private Date date = new Date();
	private LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	DescuentoBlackFriday dbf = new DescuentoBlackFriday();

	//---> He añadido el throw ParseException basandome en los mensajes de error y en los test del compañero
	//Test 1
	@Test
	public void testCheckPrice() throws ParseException{
		price = 30.0;

		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		double discount = price * (30.0/100.0);
		if((month == 11) && (day == 23)){
				assertTrue("Es Black Friday, fallo", discount == dbf.PrecioFinal(price));
		}else{
				assertTrue("No es Black Friday, fallo", price == dbf.PrecioFinal(price));
		}

	}

	//Test 2
	@Test (expected = IllegalArgumentException.class)
	public void testNonPositivePrice() throws ParseException{
		price = -59.99;
		dbf.PrecioFinal(price);

	}
}
