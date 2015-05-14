package Kata;

import static org.junit.Assert.assertEquals;
import Kata.BowlingGame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


//STRIKE � zbijasz wszystkie kr�gle w pierwszym rzucie . Kolejne Twoje rzuty w nast�pnych kolejkach liczone s� 2 razy, w 10 kolejce razy1.
//
//SPARE � zbijasz wszystkie kr�gle w kolejce w dw�ch rzutach . W nast�pnej kolejce pierwszy rzut liczony jest razy 2, w 10 kolejce razy 1.
//
//SPLIT � po pierwszym rzucie pozostajesz ze skrajnie ustawionymi kr�glami, z kt�rych mo�esz zbi� tylko 1.
//
//FOUL � przekroczy�e� lini� rzutu � spali�e�, je�eli zbi�e� kr�gle, punkty nie s� liczone, ale rzut tak

public class BowlingGameTest {

	private BowlingGame game;
//pins - kr�gle

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
