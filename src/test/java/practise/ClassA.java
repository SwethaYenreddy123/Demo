package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassA extends BaseClass {
	
	@Test(dataProvider="getData")
	public void Test1(String name)
	{
		System.out.println("Test1");
		System.out.println("name-"+name);
	}
	@Test(dataProvider="getData")
	public void Test2(String name)
	{
		System.out.println("Test2");
		System.out.println("name-"+name);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][1];
		
		data[0][0]="swetha";
		data[1][0]="reddy";
		data[2][0]="yenreddy";
		return data;
		

		
		
	}
}
