public class RomanNumeral {
	// Devuelve true si año es roman, false en caso contrario
	// No se especifica qué ocurre si el número es negativo
	// => Se ha optado por lanzar la excepción RuntimeException
	public int convierte(String s) {

		int decimal = 0 //esta es la variable en la que vamos a ir almacenando la suma
		int m = 0;
		int d = 0;
		int c = 0;
		int l = 0;
		int x = 0;
		int v = 0;
		int i = 0;
		

		if (s.length() <= 0) {
			throw new RuntimeException("Longitud incorrecta");
		}
		String romanNumeral = s.toUpperCase(); //lo ponemos todo en myosculas para facilitarnos las cosas
		for (int n= 0;n < romanNumeral.length() ;n++ ) {
			//vamos a ir recorriendonos el string caracter a caracter 
			char decimalConvert = romanNumeral.charAt(i);
			switch (decimalConvert) {
				case 'M':
		            decimal += 1000;
		            m = m+1;
		            break;

		        case 'D':
		            decimal += 500;
		            d = d + 1;
		            break;

		        case 'C':
		            decimal += 100;
		            c = c + 1;
		            break;

		        case 'L':
		            decimal += 50;
		            l = l + 1;
		            break;

		        case 'X':
		            decimal += 10;
		            x = x+1;
		            break;

		        case 'V':
		            decimal += 5;
		            v = v+1;
		            break;

		        case 'I':
		            decimal += 1;
		            i = i+1;
		            break;

		        default:
		        throw new RuntimeException("Letra incorrecta");
        	}
		}
		if (m>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (d>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (c>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (l>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (x>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (v>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		if (i>3) {
			throw new RuntimeException("más de tres letras iguales");
		}
		//ahora tenemos que comprobar las restas 
		if (romanNumeral.contains("IV"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("IX"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("XL"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("XC"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("CD"))
	    {
	        decimal-=100;
	    }
	    if (romanNumeral.contains("CM"))
	    {
	        decimal-=100;
	    }
	    return decimal;
	}

	public static void main(String[] args) {
	 	RomanNumeral roman = new RomanNumeral();
	 	System.out.println(roman.convierte(m));
	 	System.out.println(roman.convierte(v));
	 	System.out.println(roman.convierte(vi));
	 	System.out.println();
	 	System.out.println(roman.convierte(iv));
	 	System.out.println(roman.convierte(xii));
		System.out.println(roman.convierte(ix));
	 	System.out.println(xxx);
	 	System.out.println(roman.convierte(m));
	 	System.out.println(roman.convierte(d));
	 	System.out.println(roman.convierte(cd));
		System.out.println();
		System.out.println(roman.convierte(h));
		System.out.println(roman.convierte(52));
	}
}