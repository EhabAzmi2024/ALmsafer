package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class parametars {
	WebDriver driver = new ChromeDriver();
	Assertion assret = new  Assertion();
	String URL = "https://www.almosafer.com/en";
	String ExpctedLanguage="en";
	String Expectedcuranccy="SAR";
	String Expectednumbercorrcte="+966554400000";
	
	
}