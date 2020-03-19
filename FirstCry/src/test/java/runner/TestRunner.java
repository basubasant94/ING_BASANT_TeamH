package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features"  
                ,glue={"stepdefinitions"} 
                 //,format={"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucmber.xml"}
                 , plugin= {"pretty","html:test-output"}
                // ,monochrome=true 
                 //,strict=false	   
                // ,dryRun=false
)
public class TestRunner {

}
