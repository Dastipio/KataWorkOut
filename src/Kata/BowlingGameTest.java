package Kata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BowlingGameTest {

	@Test
	public void canCreateGame(){
		BowlingGame game = new BowlingGame();
	}
	
	@Test
	public void canRoll(){
		BowlingGame game = new BowlingGame();
		game.roll(0);
	
	}
}
