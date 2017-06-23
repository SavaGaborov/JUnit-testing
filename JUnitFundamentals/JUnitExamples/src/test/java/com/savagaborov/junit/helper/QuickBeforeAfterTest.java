package com.savagaborov.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@Before
	public void setup(){
		System.out.println("Before");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

}
