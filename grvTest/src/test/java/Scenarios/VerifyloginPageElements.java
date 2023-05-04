package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;

public class VerifyloginPageElements extends AbstractWebDriverTest {
  @Test
	public void verifyElements() {

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dprime%26adgrpid%3D60612964962%26ext_vrnc%3Dhi%26hvadid%3D486380734071%26hvdev%3Dc%26hvlocphy%3D9301468%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D12301292770308057828%26hvtargid%3Dkwd-11783746%26hydadcr%3D14454_2154375%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		// Find and verify the logo image
		WebElement logoImage = driver.findElement(By.className("a-link-nav-icon"));
		assert logoImage.isDisplayed();

		// Find and verify the email field
		WebElement emailField = driver.findElement(By.id("ap_email"));
		assert emailField.isDisplayed();

		// Find and verify the continue button
		WebElement continueButton = driver.findElement(By.id("continue"));
		assert continueButton.isDisplayed();

		// Find and verify the password field
		WebElement passwordField = driver.findElement(By.id("legalTextRow"));
		assert passwordField.isDisplayed();


		// Find and verify the "Need help?" link
		WebElement needHelpLink = driver.findElement(By.className("a-expander-prompt"));
		assert needHelpLink.isDisplayed();

		// Find and verify the "Create your Amazon account" button
		WebElement createAccountButton = driver.findElement(By.id("createAccountSubmit"));
		assert createAccountButton.isDisplayed();

	}
  }

