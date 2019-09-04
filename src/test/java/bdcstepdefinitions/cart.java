package bdcstepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mydemo_1.mydemo_1.Drivers;

public class cart {
	WebDriver driver;
 

@Given("user clicks on Demo Web shop icon")
public void user_clicks_on_Demo_Web_shop_icon() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver=Drivers.configureDriver("chrome");
	 driver.manage().window().maximize();
	 driver.get("http://demowebshop.tricentis.com/");
}

@Given("it will directed to home page")
public void it_will_directed_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).click();
}

@Given("Click on to Login button")
public void click_on_to_Login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("//a[@href='/login']")).click();

}

@Then("Enter login mail id and password")
public void enter_login_mail_id_and_password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.id("Email")).sendKeys("ravikumar@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("123456");
}

@Then("click the login button")
public void click_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@Given("Click on to the Books in Categories")
public void click_on_to_the_Books_in_Categories() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//a[@href='/books']")).click();
}

@Then("Click on any books")
public void click_on_any_books() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("//a[@href='/computing-and-internet']")).click();
}

@When("User clicks on books add to cart")
public void user_clicks_on_books_add_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@value='button']")).click();
}

@When("item is added to cart")
public void item_is_added_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
}

@Given("Click on to the Electronics in Categories")
public void click_on_to_the_Electronics_in_Categories() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//a[@href='/electronics']")).click();
}

@Then("Click on any Cellphones")
public void click_on_any_Cellphones() {
    // Write code here that turns the phrase above into concrete actions
 //   throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img")).click();
}

@When("User clicks on Smartphone add to cart")
public void user_clicks_on_Smartphone_add_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	
}


