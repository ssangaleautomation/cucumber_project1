package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
@Given("User is at login screen")	
public void preconditions()
{
	System.out.println("This is my Given statment");
}
	
@When("User enters username")
public void enterUserName()
{
	System.out.println("When statment for entering username");
}	
	
@When("User enters password")
public void enterPassword()
{
	System.out.println("When statment for entering password");
}		
	
@When("User click on login button")
public void ClickonLogin()
{
	System.out.println("When statment for click on login");
}	
	
@Then("User should get redirect to home page")
public void ValidateOnHomePage()
{
	System.out.println("Then statment for Home page");
}

}
