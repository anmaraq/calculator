package com.qa.mathopperations;


import org.junit.Assert;
import org.junit.Test;



public class DivideTest {

	@Test
	public void test() {
		Divide divide = new Divide();
		int actual = divide.divide(20,5);
		Assert.assertEquals(4, actual);
	}

}
