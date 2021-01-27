package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeClass
	public void TestA()
	{
		System.out.println("BeforeClass");
	}
	@BeforeTest
	public void TestA1()
	{
		System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void TestA2()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void TestA3()
	{
		System.out.println("AfterMethod");
	}

	@AfterTest
	public void TestA4()
	{
		System.out.println("AfterTest");
	}
	@AfterClass
	public void TestA5()
	{
		System.out.println("AfterClass");
	}
}
