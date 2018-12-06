package dao.assignment_executor;

/*Created by Sachin Pitrubhakt on 7/12/2018.*/

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.junit.Rule;
import org.junit.rules.TestName;

public class Assignment2 {
	public String baseUrl = "https://www.theswiftcodes.com/malaysia/";
	String path = System.getProperty("user.dir");
	String driverPath = path + "\\chromedriver\\chromedriver.exe";
	public WebDriver driver;

	@Rule
	public TestName name = new TestName();

	@BeforeTest
	public void launchBrowser() {

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		// driver launched
		driver.manage().window().maximize();
		// driver maximized
		driver.get(baseUrl);
		// driver Hit the URL
	}

	@Test
	public void BankGetList() {
		try {
			System.out.println("Printing below list of Bank :");
			List<WebElement> Bank_element = driver.findElements(By.xpath("//table[@class='swift']/tbody/tr/td[2]"));
			//bank element 
			List<WebElement> City_element = driver.findElements(By.xpath("//table[@class='swift']/tbody/tr/td[3]"));
			// Stored all product images Web Element in list of Web Element
			for (int i = 0; i < Bank_element.size(); i++) {
				if (Bank_element.get(i).getText() != null)
					System.out.println(i + 1 + "|  " + Bank_element.get(i).getText()+"  |  "+City_element.get(i).getText());

			}
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}