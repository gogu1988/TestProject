package a;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class a_ExecutionOrder {
	
/*
 * TestNG annotation can not be used for Constructor even though it will not through any error
 * TestNG will execute in the alphabetical order of the method name where special characters like _ and $ will given first priority
 * Range of TestNG Priority is -2,147,483,648 to 2,147,483, 647 which is the range of integer data type, priority will start from left to right
 * Order of execution is -ve value priority, no priority method name with symbols, method names in alphabetical order without priority, priority with Zero and +ve value priority
 */
	@Test
	a_ExecutionOrder(){
		System.out.println("executing constructor q12");
	}
	
	@Test
	public  void a(){
		
	}
	
	@Test
	public  void b(){
		
	}
	
	@Test
	public  void c(){
		
	}
	
	@Test
	public  void d(){
		throw new SkipException("Any reason");
	}
		
	@Test(priority=1)
	public  void a1(){
		
	}
	
	@Test(priority=2)
	public  void b1(){
		
	}
	
	@Test(priority=3)
	public  void c1(){
		
	}
	
	@Test
	public void _$Symbol(){
		
	}
	
	@Test(priority=0)
	public void zero(){
		
	}
	
	@Test(priority=-1)
	public void negative(){
		
	}
	
	@Test(priority=-2)
	public void negative2(){
		
	}
	
	
}
