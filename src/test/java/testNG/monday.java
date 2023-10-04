package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class monday {


    // HELPER ATTRIBUTES IN testNG
    // dependsOnMethods,   enables =false,    timeOut= 3000
    //   @Test(dataProvider="getData")  // 'getData' is the method name

    @Parameters({"URL"})
    @Test
    public void Demo1(String urlName){

        System.out.println("Monday : Demo1 method");
        System.out.println(urlName);
    }

    @Test(dependsOnMethods = {"Demo4"})   // helper attribute
    public void Demo2(){

        System.out.println("Monday : Demo2 method");
    }

    @Test(enabled = false)   // helper attribute
    public void Demo3(){

        System.out.println("Monday : Demo3 method");
    }

    @Test(timeOut = 3000)  // this 3000 milliseconds refers to wait before throwing an error ..
    public void Demo4(){

        System.out.println("Monday : Demo4 method");
    }



}
