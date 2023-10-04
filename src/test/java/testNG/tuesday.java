package testNG;

import org.testng.annotations.Test;

public class tuesday {

    @Test
    public void Sample1(){
        System.out.println("Tuesday : Sample1 method");
    }

    @Test(groups = {"Smoke"})
    public void Sample2(){

        System.out.println("Tuesday : Sample2 method");
    }

    @Test
    public void Sample3(){

        System.out.println("Tuesday : Sample3 method");
    }
}
