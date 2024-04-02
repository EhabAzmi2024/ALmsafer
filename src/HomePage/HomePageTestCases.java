package HomePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTestCases extends parametars {
	@BeforeTest
	public void MySetup() {
		driver.manage().window().maximize();
		driver.get(URL);
		WebElement PopMsg = driver.findElement(By.cssSelector(".sc-iBmynh.izXFRL"));
		if (PopMsg.isDisplayed()) {
			WebElement SARbutton = driver
					.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
			SARbutton.click();

		}

	}

	@Test
	public void CheckTheDefaultLanguageIsEnglish() {
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		assertEquals(ActualLanguage, ExpctedLanguage);
	}

	@Test
	public void CheckDefaultcuranccy() {
		String ActualCurrency = driver.findElement(By.cssSelector(".sc-dRFtgE.fPnvOO")).getText();
		assertEquals(ActualCurrency, Expectedcuranccy);

	}
	 @Test
	    public void Checknumbercorrcte() {
	    	
	    String Actualnumbercorrcte= driver.findElement(By.tagName("strong")).getText();
	    assertEquals(Actualnumbercorrcte, Expectednumbercorrcte);
	    	
	    }
	 @Test
		public void checkDepatureAndReturnDat() {}
}
