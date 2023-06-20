import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaProgram 
{
	public static void main (String args []) throws InterruptedException
	{
		//System.out.println("This is my first java program");
		//System.out.println("This is my first class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
	}

}
