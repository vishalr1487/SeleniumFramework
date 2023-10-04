package mavenThroughCommand;

import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void SeleniumUITesting1(){
        System.out.println("SELENIUM TEST CASE 1");
    }

    @Test
    public void SeleniumUITesting2(){
        System.out.println("SELENIUM TEST CASE 2");
    }

    @Test
    public void SeleniumUITesting3(){
        System.out.println("SELENIUM TEST CASE 3");
    }

    @Test
    public void singleTestCaseRun(){
        System.out.println("RUNNING A SINGLE TEST CASE");
    }

    // GO THROUGH THE POM.XML FILE AND TESTNG XML FILE : PROFILES ARE ADDED IN THAT CHECK IT ONCE

    // Maven Commands:
    //mvn clean , mvn compile,  mvn test.
    // mvn test -PRegressionTestCases
    // mvn test -PSmokeTestCases      // command to run the test cases in command prompt
}
