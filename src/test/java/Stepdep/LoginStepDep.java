package Stepdep;

import java.io.IOException;

import com.test.pageAction.LoginPageAction;
import com.test.util.TestBase;
import com.test.util.Util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDep extends TestBase{
	
	LoginPageAction loginPageAction = new LoginPageAction();
	
	@Given("^Open page \"([^\"]*)\"$")
	public void Open_page(String URL){
		geturl(URL);
		}

	@Then("^Click on SignIN Button$")
	public void click_on_SignIN_Button() throws IOException{
		loginPageAction.ClickonSignINButton();
		
	    
	}

	@Then("^Click on SignIN Link$")
	public void click_on_SignIN_Link(){
		loginPageAction.ClickonSignINLink();
	}

	@Then("^Enter user name Enter Password Click on Signin$")
	public void enter_user_name_Enter_Password_Click_on_Signin(){
		loginPageAction.Credential(pro.getProperty("username"),pro.getProperty("password"));
	    
	}

	@Then("^Verify user can login successfully$")
	public void verify_user_can_login_successfully(){
		loginPageAction.Verifyusercanloginsuccessfully();
	    
	}
	@Then("^enter XPS in Search Field$")
	public void enter_XPS_in_Search_Field(){
		loginPageAction.enterXPSinSearchField();
	    
	}
	@Then("^Verify Search result$")
	public void Verify_Search_result(){
		loginPageAction.VerifySearchresult();
	    
	}
	@Then("^Click on Search Button$")
	public void Click_on_Search_Button(){
		loginPageAction.ClickonSearchButton();
	    
	}

}
