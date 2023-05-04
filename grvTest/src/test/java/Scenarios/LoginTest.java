package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;

public class LoginTest extends AbstractWebDriverTest {
  @Test
	public void amazonLogin() {
		// Navigate to the Amazon login page
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dprime%26adgrpid%3D60612964962%26ext_vrnc%3Dhi%26hvadid%3D486380734071%26hvdev%3Dc%26hvlocphy%3D9301468%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D12301292770308057828%26hvtargid%3Dkwd-11783746%26hydadcr%3D14454_2154375%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		// Enter the email/phone number into the login form and submit
		WebElement emailInput = driver.findElement(By.id("ap_email"));
		emailInput.sendKeys("your_email");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

		// Enter the password into the login form and submit
		WebElement passwordInput = driver.findElement(By.id("ap_password"));
		passwordInput.sendKeys("your_password");
		WebElement signInButton = driver.findElement(By.id("signInSubmit"));
		signInButton.click();

		// Verify that the login was successful
		WebElement accountLink = driver.findElement(By.id("nav-link-accountList"));
		String expectedText = "Hello, gaurav";
		String actualText = accountLink.getText();
		if (actualText.contains(expectedText)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed.");
		}
  }
}
