package com.mycomapny.testModule;

import org.testng.annotations.Test;

import com.mycomapny.test.TestBase;

public class MlCalLoanTest extends TestBase {
	
	@Test
	public void testMortgage() {
		
		lp.inputDiffererntParameter("6000", "20","34");
		res.printRes();

	}

}
