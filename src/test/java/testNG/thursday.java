package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class thursday {


    @Test(dataProvider = "getData")
    public void selenium(String username, String password){
        System.out.println("Thursday : selenium method");

        System.out.println(username);
        System.out.println(password);
    }

    @Test(groups = {"Smoke"})
    public void appium(){
        System.out.println("Thursday : appium method");
    }

    @Test
    public void restAssured(){
        System.out.println("Thursday : restAssured method");
    }


    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[3][2];

        data[0][0]= "vishalr1487@gmail.com";
        data[0][1]= "firstPassword";

        data[1][0]= "naveencns@gmail.com";
        data[1][1]= "secondPassword";

        data[2][0]= "manohar@gmail.com";
        data[2][1]= "thirdPassword";

        return data;

    }


}
