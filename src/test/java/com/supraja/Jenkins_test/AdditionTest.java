package com.supraja.Jenkins_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class AdditionTest
{
	@Test
	void testSum() {
		Addition obj = new Addition();
		assertEquals(10, obj.sum(6, 4));
	}
}
