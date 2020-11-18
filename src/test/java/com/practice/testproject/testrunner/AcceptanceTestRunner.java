package com.practice.testproject.test.runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="classpath:Practicefeature/",glue="com.practice.testproject.steps.definitions",plugin="pretty", monochrome = true)

public class AcceptanceTestRunner {
}
