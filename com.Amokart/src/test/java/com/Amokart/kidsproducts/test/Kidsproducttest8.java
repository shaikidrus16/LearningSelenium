package com.Amokart.kidsproducts.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproducttest8 {
	@Test(groups = "intigration")
	  public void deleteproduct() {
		  Reporter.log("deleteproduct---kids PRD successfully",true);
	  }
	  @Test(groups = "functional")
	  public void updateproduct() {
		  Reporter.log("update--kids product successfully",true);
	  }
	  @Test(groups = "smoke")
	  public void addproduct() {
		  Reporter.log("Addproduct kids--successfully",true);
	  }
}
