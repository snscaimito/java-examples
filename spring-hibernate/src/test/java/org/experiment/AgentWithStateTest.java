package org.experiment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration
public class AgentWithStateTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private AgentRepository agentRepository ;
	
	@Test
	public void saveAgent() {
		Agent agent = new Agent("Joe Agent", State.ALABAMA()) ;

		agentRepository.store(agent) ;

		assertEquals(1, countRowsInTable(Agent.TABLE_NAME)) ;
		assertEquals("Joe Agent", simpleJdbcTemplate.queryForObject(String.format("select name from %s", Agent.TABLE_NAME), String.class)) ;
		assertEquals("AL", simpleJdbcTemplate.queryForObject(String.format("select state from %s", Agent.TABLE_NAME), String.class)) ;
	}
	
}
