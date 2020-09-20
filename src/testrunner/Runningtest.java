package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
     (  features=".//features/" ,
       glue = "src/stepdefinition/TEstStep.java" , 
       dryRun = true,
       tags = ("@grid"),
       monochrome = true,
       plugin = {"pretty","html:test-output"}
     
    		 )

public class Runningtest {

}
