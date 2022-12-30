package Clarusway.test;

import org.testng.annotations.Test;

public class Day01_C04_Enabled {
    @Test(enabled = true)
    public void enabledTest(){
        System.out.println("Enabled test ");
    }

    @Test(enabled = false)//enable false olduğunda calıstıramıyoruz..true olursa calısır zanet yanındaki yeşil run tuşu da kayboluyor
    public void disabledTest(){
        System.out.println("Desabled test ");
    }
}
