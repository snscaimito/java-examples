package org.experiment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class StateFromShortNameTest {

	public static @DataPoints String[] stateShortNames = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" } ;
	
	@Theory
	public void fromShortName(String shortName) {
		State state = State.fromShortName(shortName) ;
		
		assertEquals(shortName, state.getShortName()) ;
	}

	@Theory
	public void makeString(String shortName) {
		State state = State.fromShortName(shortName) ;
		
		assertEquals(shortName, state.toString()) ;
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void unknownShortName() {
		State.fromShortName("UNKNOWN") ;
	}

}
