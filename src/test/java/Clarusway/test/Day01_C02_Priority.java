package Clarusway.test;

import org.testng.annotations.Test;

public class Day01_C02_Priority {
//en küçükten en büyüge dogru testler calıstırılır
   @Test (priority = -1)
    public void test2(){}
    @Test(priority =-2 )
    public void test4(){}
    @Test(priority = -3)
    public void test1(){}
    @Test(priority = -4)
    public void test3(){}
}
