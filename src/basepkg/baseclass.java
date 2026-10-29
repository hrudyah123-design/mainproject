package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {
public WebDriver driver;
public String url="https://www.saucedemo.com/";
@BeforeMethod
public void start()
{
	driver=new ChromeDriver();
	driver.get(url);
}
}
