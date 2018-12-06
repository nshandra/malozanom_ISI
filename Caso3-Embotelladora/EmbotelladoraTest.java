import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class EmbotelladoraTest {

	int pequenas, grandes, total, expected;
	Embotelladora emb = new Embotelladora(); 
	
	public EmbotelladoraTest (int pequenas, int grandes, int total, int expected) {
		this.pequenas = pequenas;
		this.grandes = grandes;
		this.total = total;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> calcValues() {
		return Arrays.asList (new Object [][] {

			// Happy path: valores positivos y total < grandes x 5 + pequeñas.
			// [0] FFF TTT TF
			{8,6,22,0},
			// [1] FFF TTF TF
			{20,2,-16,-1},
			// [2] FFF TFT TF
			{20,-1,16,-1},
			// [3] FFF FTT TF
			{-18,1,16,-1},
			// Happy path: valores positivos y total = grandes x 5 + pequeñas.
			// [4] FFF TTT FT
			{5,1,10,5},
			// [5] FFF TFT FT
			{6,-2,16,-1},
			// [6] FFF FTT FT
			{-6,2,16,-1},
			// Happy path: valores positivos y total > grandes x 5 + pequeñas.
			// [7] FFF TTT FF
			{3,1,18,-1},
			// [8] FFF TFT FF
			{-6,2,-5,-1},
			// [9] FFF FTT FF
			{-6,2,16,-1},
			// Happy path: Pequeñas = 0, total y grandes > 0 y total > grandes x 5 + pequeñas.
			// [10] TFF FTT FF
			{0,1,11,-1},
			// [11] TFF FFT FF
			{0,-6,3,-1},
			// [12] TFF FTT TF
			{0,8,1,-1},
			// [13] TFF FTT FT
			{0,3,15,-1},
			// Happy path: Grandes = 0, total y pequeñas > 0 y total > grandes x 5 + pequeñas.
			// [14] FTF TFT FF
			{1,0,2,-1},
			// [15] FTF FFT FF
			{-1,0,2,-1},
			// [16] FTF TFT TF
			{4,0,2,2},
			// [17] FTF TFT FT
			{3,0,3,3},
			// Happy path: Total = 0, grandes y pequeñas > 0 y total < grandes x 5 + pequeñas.
			// [18] FFT TTF TF
			{1,1,0,0},
			// [19] FFT FTF TF
			{-1,1,0,-1},
			// [20] FFT TFF TF
			{1,-1,0,-1},
			// Entrada mas simple: todo ceros.
			// [21] TTT FFF FT
			{0,0,0,-1}
			});
	}
	

	@Test
	public void testCalculaBotellasPequenas() {
		int res = emb.calculaBotellasPequenas(pequenas, grandes, total);
		System.out.format("\n%d = %d ", expected, res);
		assertTrue ("Addition Test", expected == res);
	}
}