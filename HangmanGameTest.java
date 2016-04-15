import static org.junit.Assert.*;

import org.junit.Test;

public class HangmanGameTest {

	@Test
	//checkWord checks if word valid (all characters)
	public void checkWordValidTest() {
		HangmanGame h = new HangmanGame();
		String word = "desklamp";
		assertTrue(h.checkWord(word));
	}
	
	@Test
	public void checkWordInvalidTest() {
		HangmanGame h = new HangmanGame();
		String word = "12345";
		assertFalse(h.checkWord(word));
	}
	
	@Test
	public void checkWordEmpty() {
		HangmanGame h = new HangmanGame();
		String word = "";
		assertFalse(h.checkWord(word));
	}
	
	@Test
	public void testLetterCountCorrect() {
		HangmanGame h = new HangmanGame();
		String word = "desklamp";	//this word has 8 letters
		int numLetters = h.countLetters(word);
		assertEquals(8, numLetters);
		
	}
	
	@Test
	public void testLetterCountIncorrect() {
		HangmanGame h = new HangmanGame();
		String word = "desklamp";	//this word has 8 letters
		int numLetters = h.countLetters(word);
		assertFalse(numLetters != 8);
	}
	
	@Test
	public void testPrintBlanksCorrect() {
		HangmanGame h = new HangmanGame();
		int numLetters = 6;
		assertEquals(h.printBlanks(numLetters), "_ _ _ _ _ _ ");
	}
	
	@Test
	public void testPrintBlanksZero() {
		HangmanGame h = new HangmanGame();
		assertEquals(h.printBlanks(0), "");
	}
	
	

}
