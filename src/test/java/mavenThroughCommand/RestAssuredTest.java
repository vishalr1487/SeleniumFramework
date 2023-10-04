package mavenThroughCommand;

import org.testng.annotations.Test;

public class RestAssuredTest {

    @Test
    public void ApiTesting1(){
        System.out.println("API TEST CASE 1");
    }

    @Test
    public void ApiTesting2(){
        System.out.println("API TEST CASE 2");
    }

    @Test
    public void ApiTesting3(){
        System.out.println("API TEST CASE 3");
    }

    // GO THROUGH THE POM.XML FILE AND TESTNG XML FILE : PROFILES ARE ADDED IN THAT CHECK IT ONCE

    // Maven Commands:
    //mvn clean , mvn compile,  mvn test.
    // mvn test -PRegressionTestCases
    // mvn test -PSmokeTestCases      // command to run the test cases in command prompt
}
