package com.system.measurement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * 
 * @author adeel ahmad
 *
 */
public class ConverterImplTest {

	private ConverterImpl converter= null;
	
	@Before
	public void setUp() throws Exception {
		converter = new ConverterImpl();
	}

	@After
	public void tearDown() throws Exception {
		converter = null;
	}

	@Test
	public void testConvertOutput() {
		//verified with google unit conversion
		assertEquals("10 cm equals 0.10 m", converter.convertOutput("10 cm in m"));
		assertEquals("10 cm equals 0.33 ft", converter.convertOutput("10 cm in ft"));
		assertEquals("10 cm equals 0.11 yd", converter.convertOutput("10 cm in yd"));
		assertEquals("10 cm equals 3.94 in", converter.convertOutput("10 cm in in"));
	}
}
