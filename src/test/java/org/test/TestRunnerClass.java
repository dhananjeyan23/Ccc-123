package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\psjey\\eclipse-workspace\\GoodCucu\\src\\test\\resources"
		+ "\\features\\Goodeggs.feature",glue="org.step",dryRun = false,strict = true)
public class TestRunnerClass {

}
