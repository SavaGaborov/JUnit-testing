package com.savagaborov.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.savagaborov.junit.helper.JunitTesting;

public class CountATest {
	
	JunitTesting test = new JunitTesting();

	@Test
	public void test() {
		int input = test.countA("JavaApp");
		int expected=3;
		assertEquals(expected, input);
	}

}
