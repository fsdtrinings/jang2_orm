package exeHandling;

import java.sql.SQLException;

public class Demo2 {
	
	public void method1()throws SQLException
	{
		
	}
	
	public void caller()
	{
		// method1();
		// line no 14 gives us an error 
		// becoz method1() is declared with throws clause
		
		try
		{
			method1(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
