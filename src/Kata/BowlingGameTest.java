package Kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class BowlingGameTest {

	private BowlingGame game;
	
	@Test
	public void canCreateGame() throws Exception{
		setUp();
	}
	
	@Test
	public void canRoll(){
		game.roll(0);
	
	}

	@Before
	public void setUp() throws Exception {
			game = new BowlingGame();
		
	}
	
	
}
