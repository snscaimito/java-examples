package org.experiment;

import java.util.HashMap;
import java.util.Map;

public class State {

	private static Map<String, String> longNames = new HashMap<String, String>() ;
	
	static {
		longNames.put("AL", "Alabama") ;
		longNames.put("AK", "Alaska") ;
		longNames.put("AZ", "Arizona") ;		
		longNames.put("AR", "Arkansas") ;
		longNames.put("CA", "California") ;
		longNames.put("CO", "Colorado") ;
		longNames.put("CT", "Connecticut") ;
		longNames.put("DE", "Delaware") ;
		longNames.put("FL", "Florida") ;
		longNames.put("GA", "Georgia") ;
		longNames.put("HI", "Hawaii") ;
		longNames.put("ID", "Idaho") ;
		longNames.put("IL", "Illinois") ;
		longNames.put("IA", "Iowa") ;
		longNames.put("IN", "Indiana") ;
		longNames.put("KS", "Kansas") ;
		longNames.put("KY", "Kentucky") ;
		longNames.put("LA", "Louisiana") ;
		longNames.put("ME", "Maine") ;
		longNames.put("MD", "Maryland") ;
		longNames.put("MA", "Massachusetts") ;
		longNames.put("MI", "Michigan") ;
		longNames.put("MN", "Minnesota") ;
		longNames.put("MS", "Mississippi") ;
		longNames.put("MO", "Missouri") ;
		longNames.put("MT", "Montana") ;
		longNames.put("NE", "Nebraska") ;
		longNames.put("NV", "Nevada") ;
		longNames.put("NH", "New Hampshire") ;
		longNames.put("NJ", "New Jersey") ;
		longNames.put("NM", "New Mexico") ;
		longNames.put("NY", "New York") ;
		longNames.put("NC", "North Carolina") ;
		longNames.put("ND", "North Dakota") ;
		longNames.put("OH", "Ohio") ;
		longNames.put("OK", "Oklahoma") ;
		longNames.put("OR", "Oregon") ;
		longNames.put("PA", "Pennsylvania") ;
		longNames.put("RI", "Rhode Island") ;
		longNames.put("SC", "South Carolina") ;
		longNames.put("SD", "South Dakota") ;
		longNames.put("TN", "Tennessee") ;
		longNames.put("TX", "Texas") ;
		longNames.put("UT", "Utah") ;
		longNames.put("VT", "Vermont") ;
		longNames.put("VA", "Virginia") ;
		longNames.put("WA", "Washington") ;
		longNames.put("WV", "West Virginia") ;
		longNames.put("WI", "Wisconsin") ;
		longNames.put("WY", "Wyoming") ;
	}
	
	private String shortName ;

	private State(String shortName) {
		this.shortName = shortName ;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public String getLongName() {
		return longNames.get(shortName) ;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof State) {
			State otherState = (State) other ;
			return shortName.equals(otherState.shortName) ;
		} else
			return false ;
	}

	@Override
	public int hashCode() {
		return shortName.hashCode() ;
	}

	@Override
	public String toString() {
		return shortName ;
	}
	
	public static State ALABAMA() {
		return new State("AL") ;
	}

	public static State ALASKA() {
		return new State("AK") ;
	}
	
	public static State ARIZONA() {
		return new State("AZ") ;
	}

	public static State ARKANSAS() {
		return new State("AR") ;
	}

	public static State CALIFORNIA() {
		return new State("CA") ;
	}
	
	public static State COLORADO() {
		return new State("CO") ;
	}
	
	public static State CONNECTICUT() {
		return new State("CT") ;
	}

	public static State DELAWARE() {
		return new State("DE") ;
	}

	public static State FLORIDA() {
		return new State("FL") ;
	}

	public static State GEORGIA() {
		return new State("GA") ;
	}

	public static State HAWAII() {
		return new State("HI") ;
	}

	public static State IDAHO() {
		return new State("ID") ;
	}

	public static State ILLINOIS() {
		return new State("IL") ;
	}
	
	public static State INDIANA() {
		return new State("IN") ;
	}
	
	public static State IOWA() {
		return new State("IA") ;
	}
	
	public static State KANSAS() {
		return new State("KS") ;
	}
	
	public static State KENTUCKY() {
		return new State("KY") ;
	}
	
	public static State LOUISIANA() {
		return new State("LA") ;
	}

	public static State MAINE() {
		return new State("ME") ;
	}

	public static State MARYLAND() {
		return new State("MD") ;
	}

	public static State MASSACHUSETTS() {
		return new State("MA") ;
	}

	public static State MICHIGAN() {
		return new State("MI") ;
	}
	
	public static State MINNESOTA() {
		return new State("MN") ;
	}

	public static State MISSISSIPPI() {
		return new State("MS") ;
	}
	
	public static State MISSOURI() {
		return new State("MO") ;
	}

	public static State MONTANA() {
		return new State("MT") ;
	}
	
	public static State NEBRASKA() {
		return new State("NE") ;
	}

	public static State NEVADA() {
		return new State("NV") ;
	}
	
	public static State NEW_HAMPSHIRE() {
		return new State("NH") ;
	}

	public static State NEW_JERSEY() {
		return new State("NJ") ;
	}

	public static State NEW_MEXICO() {
		return new State("NM") ;
	}

	public static State NEW_YORK() {
		return new State("NY") ;
	}
	
	public static State NORTH_CAROLINA() {
		return new State("NC") ;
	}

	public static State NORTH_DAKOTA() {
		return new State("ND") ;
	}

	public static State OHIO() {
		return new State("OH") ;
	}

	public static State OKLAHOMA() {
		return new State("OK") ;
	}
	
	public static State OREGON() {
		return new State("OR") ;
	}
	
	public static State PENNSYLVANIA() {
		return new State("PA") ;
	}

	public static State RHODE_ISLAND() {
		return new State("RI") ;
	}
	
	public static State SOUTH_CAROLINA() {
		return new State("SC") ;
	}
	
	public static State SOUTH_DAKOTA() {
		return new State("SD") ;
	}
	
	public static State TENNESSEE() {
		return new State("TN") ;
	}
	
	public static State TEXAS() {
		return new State("TX") ;
	}
	
	public static State UTAH() {
		return new State("UT") ;
	}
	
	public static State VERMONT() {
		return new State("VT") ;
	}
	
	public static State VIRGINIA() {
		return new State("VA") ;
	}
	
	public static State WASHINGTON() {
		return new State("WA") ;
	}

	public static State WEST_VIRGINIA() {
		return new State("WV") ;
	}

	public static State WISCONSIN() {
		return new State("WI") ;
	}

	public static State WYOMING() {
		return new State("WY") ;
	}
	
	public static State fromShortName(String shortName) {
		if (longNames.containsKey(shortName))
			return new State(shortName);
		else
			throw new IllegalArgumentException(String.format("State %s does not exist", shortName)) ;
	}

}
