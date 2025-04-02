package pkg1;
 
import org.testng.annotations.Test;
 
public class new_groups {
	@Test(groups= {"F1","F2"})
	public void t1()
	{
		System.out.println("Executing F1 and F2 testcases");
	}
	
	
	@Test(groups= {"F1"})
	public void t2()
	{
		System.out.println("Executing F1 testcases");
	}
	
	@Test(groups= {"F2"})
	public void t3()
	{
		System.out.println("Executing F2 testcases");
	}
	
	@Test(groups= {"F1"})
	public void t4()
	{
		System.out.println("Executing F1 testcases");
	}
 
}