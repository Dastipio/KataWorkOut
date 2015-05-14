package Kata;

import static org.junit.Assert.assertEquals;
import Kata.BowlingGame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


//STRIKE – zbijasz wszystkie krêgle w pierwszym rzucie . Kolejne Twoje rzuty w nastêpnych kolejkach liczone s¹ 2 razy, w 10 kolejce razy1.
//
//SPARE – zbijasz wszystkie krêgle w kolejce w dwóch rzutach . W nastêpnej kolejce pierwszy rzut liczony jest razy 2, w 10 kolejce razy 1.
//
//SPLIT – po pierwszym rzucie pozostajesz ze skrajnie ustawionymi krêglami, z których mo¿esz zbiæ tylko 1.
//
//FOUL – przekroczy³eœ liniê rzutu – spali³eœ, je¿eli zbi³eœ krêgle, punkty nie s¹ liczone, ale rzut tak

public class BowlingGameTest {

	private BowlingGame game;
//pins - krêgle

	private void rollMany(int rolls, int pins) {
		for (int i = 0; i < rolls; i++) {
			game.roll(pins);
		}
	}
	
	@Test
	public void canCreateGame() throws Exception {
		setUp();
	}

	@Test
	public void canRoll() {
		game.roll(0); 
	}
	
	

	@Before
	public void setUp() throws Exception {
		game = new BowlingGame();
	}

	
	@Test
	public void gutterGame_ShouldReturnRed() {
		rollMany(20, 0);
		assertEquals(0, game.score());
	}

	
	@Test
	public void allOnes() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
	
	@Ignore
	@Test
	public void oneSpare(){
		game.roll(5);
		game.roll(5); //spare
		game.roll(3);
		rollMany(17, 0);
		
		assertEquals(16, game.score());
	}

}
