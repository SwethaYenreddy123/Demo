package Reusable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeClass
	public void befrClass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void befrMethod()
	{
		System.out.println("before method");
	}
	@AfterClass
	public void aftrClass()
	{
	System.out.println("after class");
	}
	@AfterMethod
	public void aftrMethod()
	{
		System.out.println("after method");
	}
}
