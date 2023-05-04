package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;

public class VerifyPasswordPageElements extends AbstractWebDriverTest {
  @Test
	public void passwordFields() {

		// Navigate to the Amazon login page
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dprime%26adgrpid%3D60612964962%26ext_vrnc%3Dhi%26hvadid%3D486380734071%26hvdev%3Dc%26hvlocphy%3D9301468%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D12301292770308057828%26hvtargid%3Dkwd-11783746%26hydadcr%3D14454_2154375%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		sleep(2);


		// Navigate to password page
		WebElement emailInput = driver.findElement(By.id("ap_email"));
		emailInput.sendKeys("grvjadhav42@gmail.com");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

		// Find and verify password button
		WebElement passwordField = driver.findElement(By.className("a-form-label"));
		assert passwordField.isDisplayed();

		// Find and verify the login button
		WebElement loginButton = driver.findElement(By.className("a-button-input"));
		assert loginButton.isDisplayed();

		// Find and verify the "Use a code to sign in" button
		WebElement useCodeToSignIn = driver.findElement(By.className("a-button-input"));
		assert useCodeToSignIn.isDisplayed();

  }
}
