package org.experiment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=Agent.TABLE_NAME)
public class Agent {
	public static final String TABLE_NAME = "agents" ;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;
	
	private String name ;
	private String state ;
	
	public Agent(String name, State state) {
		this.name = name ;
		this.state = state.getShortName() ;
	}
	
	public String getName() {
		return name;
	}
	
	public State getState() {
		return State.fromShortName(state);
	}
}
