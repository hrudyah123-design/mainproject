package testpackage;



import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.loginpage;

public class fblogintest extends baseclass{
	@Test
	public void Main()
	{
		loginpage ob=new loginpage(driver);
		ob.start("abc@gmail.com","123");
		ob.login();
	}

}
