package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizBuzTest {

	private FizBuz fizBuz;
	
	@Before
	public void before() {
		fizBuz = new FizBuz();
	}
	@Test
	public void aNumberThatCanBeDividedBy3ButNotBy5GivesMeFiz() {
		fizBuz.setNumber(3);
		assertEquals("You are Fiz", fizBuz.whoAmI());
		fizBuz.setNumber(-3);
		assertEquals("You are Fiz", fizBuz.whoAmI());
	}
	@Test
	public void aNumberThatCanDividedBy5ButNotBy3GivesMeBuz() {
		fizBuz.setNumber(5);
		assertEquals("You are Buz", fizBuz.whoAmI());
		fizBuz.setNumber(500);
		assertEquals("You are Buz", fizBuz.whoAmI());
	}
	@Test
	public void aNumberThatCanDividedByBoth3And5GivesMeFizBuz() {
		fizBuz.setNumber(15);
		assertEquals("You are FizBuz", fizBuz.whoAmI());
		fizBuz.setNumber(105);
		assertEquals("You are FizBuz", fizBuz.whoAmI());
	}
	@Test
	public void aNumberThatCannotBeDividedBy3Nor5GivesMeSorry() {
		fizBuz.setNumber(14);
		assertEquals("Sorry, I don't know your name", fizBuz.whoAmI());
	}
	@Test
	public void FizIsTheDevil() {
		fizBuz.setNumber(666);
		assertTrue(fizBuz.whoAmI().equalsIgnoreCase("YOU ARE FIZ"));
	}

}
