package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
@Test
public void testCase1()
{
	Reporter.log("1",true);
	
}
@Test
public void testCase2()
{
	Reporter.log("2",true);
		
}
}
