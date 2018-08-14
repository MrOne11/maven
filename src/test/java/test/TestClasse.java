package test;

import demo.SimpleClasse;
import junit.framework.TestCase;

public class TestClasse extends TestCase{
	
	public void testCalculer() throws Exception{
		assertEquals(2, SimpleClasse.calculer(1, 1));
	}
	
}
