package Practice;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinTest{
@Test
public void jenkinTest()  throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		    FileInputStream fis = new FileInputStream("./Data/Vtiger.properties");
			Properties pf = new Properties();
			pf.load(fis);
		    String browser = pf.getProperty("url");
			driver.get(browser);
			System.out.println(browser);
			System.out.println("Done Github To Jenkins");	
}}
