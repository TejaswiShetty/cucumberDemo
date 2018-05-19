package com.cucumber.stepdef;

import java.net.MalformedURLException;

import com.cucumber.selenium.SeleniumFunctions;
import com.cucumber.selenium.SeleniumLogout;
import com.objectRepo.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class GithubLoginSD {

    SeleniumFunctions sf = new SeleniumFunctions();
    SeleniumLogout sl= new SeleniumLogout();
    ObjectRepo or=new ObjectRepo();

    @Given("^user is on github homepage$")
    public void user_is_on_github_homepage() throws MalformedURLException,
            InterruptedException {
    	   or.ObjectRepoFunc();
           sf.createDriver();
           sf.ishomepageDisplayed();
        
       // sl.functionLogout();
    }

    @When("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() {
        sf.clickSigninLink();
    	//sl.functionLogout();
    }

    @Then("^user is displayed login screen$")
    public void user_is_displayed_login_screen() {
    	or.ObjectRepoFunc();
        sf.isloginsectionDisplayed();
        sf.teardown();
    	//sl.functionLogout();
    }
    
    @Given("^user has already logged in$")
    public void user_has_already_logged_in() throws MalformedURLException,
            InterruptedException {
    	
    	
    
    }

    @When("^user clicks on logout button$")
    public void user_clicks_on_logout_button() throws MalformedURLException,
    InterruptedException {
    }

    @Then("^user should successfully logout$")
    public void user_should_successfully_logout() throws MalformedURLException,
    InterruptedException {
    	
    }
      
    }
    
    
    
    
    
    
