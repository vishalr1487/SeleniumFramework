package testNG;

import org.testng.annotations.Test;

public class wednesday {

    @Test
    public void duplicate1(){
        System.out.println("Wednesday : duplicate1 method");
    }

    @Test
    public void duplicate2(){

        System.out.println("Wednesday : duplicate2 method");
    }

    @Test(groups = {"Smoke"})
    public void duplicate3(){

        System.out.println("Wednesday : duplicate3 method");
    }
}
