package com.Amokart.generic.common;

import com.Amokart.generic.excelutility.ReadExcelFile;
import com.Amokart.generic.javautility.JavaUtility;
import com.Amokart.generic.propertyfileUtility.ReadPropertiFile;
import com.Amokart.generic.webdrivenutility.WebDriverUtility;

public class ObjectUtility  implements FrameWorkConstants{
	public ReadExcelFile excelobj;
	public JavaUtility javaobj;
	public ReadPropertiFile propertyobj;
	public WebDriverUtility webdriverobj;

public void objectCreation() {
	 excelobj = new ReadExcelFile();
     javaobj = new JavaUtility();
     propertyobj = new  ReadPropertiFile();
	 webdriverobj = new WebDriverUtility();
}
}
