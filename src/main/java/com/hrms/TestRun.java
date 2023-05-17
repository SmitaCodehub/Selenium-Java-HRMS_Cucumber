package com.hrms;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


public class TestRun {
@RunWith(Cucumber.class)
@CucumberOptions(format= {"pretty", "html:target/cucumber-html-report"},tags= {"@Application, @LoginLogout"});
}
