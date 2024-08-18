package org.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinitation {
WebDriver driver;
@Given("User Have To Launch The Goodeggs Application Through Chrome Browser")
public void user_Have_To_Launch_The_Goodeggs_Application_Through_Chrome_Browser() {
	//browser launch
	driver = new ChromeDriver();
	//url launch
	driver.get("https://www.Goodeggs.com/");
	}

@Given("User Have To Maximize The Window")
public void user_Have_To_Maximize_The_Window() {
	//maximixe the window
	driver.manage().window().maximize();
}
@When("User Have To Click The Sigin Button")
public void user_Have_To_Click_The_Sigin_Button() {
	//click signin option
	driver.findElement(By.xpath("//a[text()='Sign In'][1]")).click();
}
@When("User Have To Enter Valid Email and Valid password")
public void user_Have_To_Enter_Valid_Email_and_Valid_password() throws InterruptedException {
	//provide email id
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("tirupathi@gmail.com");
	//provide a password
	Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys("12345678");
}
@When("User Have To Click The Continue Button")
public void user_Have_To_Click_The_Continue_Button() throws InterruptedException {
	//click continue to login
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[@class='submit-button sign-in-form__submit']")).click();
					
}
@Then("user have to close the browser")
public void user_have_to_close_the_browser() throws InterruptedException {
	//close the browser
	Thread.sleep(9000);
   driver.quit();
}


@When("User Have To Enter InValid Email and Valid password")
public void user_Have_To_Enter_InValid_Email_and_Valid_password() throws InterruptedException {
	//provide Invalid email id
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("capgemini@gmail.com");
		//provide a password
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("cap12345678");
	
}
@When("User Have To Enter InValid Email and InValid password")
public void user_Have_To_Enter_InValid_Email_and_InValid_password() throws InterruptedException {
	//provide Invalid email id
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("infosys@gmail.com");
	//provide a Invalid password
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("inf1");
		
		


}



@When("User Have To Enter the Valid Email and Valid password")
public void user_Have_To_Enter_the_Valid_Email_and_Valid_password() throws InterruptedException {
	//provide email id
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("tirupathi@gmail.com");
		//provide a password
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("12345678");
    
}

@When("User Have To Enter the InValid Email and Valid password")
public void user_Have_To_Enter_the_InValid_Email_and_Valid_password() throws InterruptedException {
	//provide Invalid email id
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("capgemini@gmail.com");
			//provide a password
			Thread.sleep(4000);
			driver.findElement(By.name("password")).sendKeys("cap12345678");
		
}

@When("User Have To Enter the InValid Email and InValid password")
public void user_Have_To_Enter_the_InValid_Email_and_InValid_password() throws InterruptedException {
	//provide Invalid email id
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("infosys@gmail.com");
		//provide a Invalid password
			Thread.sleep(4000);
			driver.findElement(By.name("password")).sendKeys("inf1");
			
			


	}
    
}

	










