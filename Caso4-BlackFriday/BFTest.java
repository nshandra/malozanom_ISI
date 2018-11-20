public class BFTest{
	DescuentoBlackFriday priceoriginal = new DescuentoBlackFriday();
	private double price;

	@Test
	public void BFTest()
	{
		price = 30.0;
		double pricefinal = priceoriginal.PrecioFinal(price);
		assertTrue ("BFTest", pricefinal == 21.0);
	}
}