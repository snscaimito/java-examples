package org.experiment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StateTest {

	@Test
	public void longName() {
		State state = State.ALABAMA() ;
		
		assertEquals("Alabama", state.getLongName()) ;
	}
	
	@Test
	public void shortName() {
		State state = State.ALABAMA() ;
		
		assertEquals("AL", state.getShortName()) ;
	}
	
	@Test
	public void equality() {
		assertEquals(State.ALABAMA(), State.ALABAMA()) ;
	}

	@Test
	public void notEqual() {
		assertFalse(State.ALABAMA().equals(State.OHIO())) ;
	}
	
	@Test
	public void differentObject() {
		assertFalse(State.ALABAMA().equals(new Object())) ;
	}

	@Test
	public void hashCodes() {
		assertEquals(State.ALABAMA().hashCode(), State.ALABAMA().hashCode()) ;
	}

	@Test
	public void differentHashCodes() {
		assertFalse(State.ALABAMA().hashCode() == State.OHIO().hashCode()) ;
	}

}
