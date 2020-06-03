package com.test.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.test.util.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
glue = "Stepdep",
tags= {"@Sanity"})

public class TestRunner extends AbstractTestNGCucumberTests {

	
@BeforeTest

public void SetUp() {
	TestBase test= new TestBase();
	test.initialize();
	
	
	
}

@AfterTest

public void tearDown() {
	TestBase test= new TestBase();
	test.driver.quit();
	
	
	
}
}
