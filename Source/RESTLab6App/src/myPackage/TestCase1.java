package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1 {
	Check test = new Check();
	String sum = test.concatenate("Suhas"," Sai");
	String testSum1 = "Suhas Sai";
	String testSum2 = "Raparthi";

	@SuppressWarnings("deprecation")
	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum1);
		assertEquals(testSum1,sum);
		assertEquals(testSum2,sum);
	}
}
