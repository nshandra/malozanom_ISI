
public class DescuentoBlackFriday {

	public double PrecioFinal(double precioOriginal) {

		double precio = precioOriginal;

		DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MM" );
		LocalDate blackFridayDate = LocalDate.parse( "23-11" , f );
		LocalDate today = LocalDate.now( f );

		if (today.compareTo(blackFridayDate)) {
			precio = precioOriginal * 0.7; //descuento del 30%
			return precio;
		}else {
			return precio;
		}

		if (precio <= 0 ) {
			throw new RuntimeException("precio erroneo");
		}
	}
	

}

