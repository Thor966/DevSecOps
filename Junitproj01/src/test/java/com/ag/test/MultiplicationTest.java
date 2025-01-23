package com.ag.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ag.service.Multiplication;

public class MultiplicationTest {

	
	private static Multiplication mul;
	
	@BeforeAll
	public static void setup()
	{
		System.out.println("MultiplicationTest.setup()");
		 mul = new Multiplication();
	}
	
	@Test
	public void testwithpositivenumber()
	{
		float excpected = 20.0f;
		float actual = mul.multiple(10.0f, 2.0f);
		assertEquals(excpected,actual);
	}
	
	@Test
	public void testwithnegativenumber()
	{
		float expected = -10.0f;
		float actual = mul.multiple(-5.0f, 2.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testwithzeros()
	{
		float expected = 0.0f;
		float actual = mul.multiple(0.0f, 0.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testwithbignumber()
	{
		float expected = 23872.0f;
		float actual = mul.multiple(746.0f, 32.0f);
		assertEquals(expected,actual);
		
	}
	
	@AfterAll
	public static void teatDown()
	{
		mul=null;
	}
}
