package Kata;

import static org.junit.Assert.assertEquals;
import Kata.BowlingGame;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame game;

	@Test
	public void canCreateGame() throws Exception {
		setUp();
	}

	@Test
	public void canRoll() {
		game.roll(0); 
	}
	
	private void rollMany(int rolls, int pins) {
		for (int i = 0; i < rolls; i++) {
			game.roll(pins);
		}
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

}
