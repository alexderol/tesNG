package Clarusway.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    @Test
    public void hardAssertion(){
        System.out.println("Assertion oncesi calisiyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrasi calisiyor");
    }

    @Test
    public void softAssertion(){
        System.out.println("SoftAssertion öncesi calisiyor");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);//fail
        softAssert.assertTrue(true);//pass
        System.out.println("softAssertion sonrası calisiyor");

        softAssert.assertAll();//bu olmadan softlar calismaz
    }

}
