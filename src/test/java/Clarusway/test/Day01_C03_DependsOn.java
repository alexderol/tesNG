package Clarusway.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C03_DependsOn {
    //homepage testi login testine bagli oldugundan dependson attribute nu kullanacağız
    //depends olduğu methodlardan birisi bile calismazsa depends olan calismaz
    //yani bagımlı olduğu methodların tamamı calismali

    @Test
    public void loginTest(){
        System.out.println("loginTest yapılıyor");
        //Assert.fail(); calısmama durumunu görmek icin kullanabilirz
    }
    @Test
    public void registrationTest(){
        System.out.println("Kayit testi yapiliyor");

    }

    @Test (dependsOnMethods = {"loginTest","registrationTest"})//homepage testi login pass olursa run olur
    public void homePageTest(){
        System.out.println("homepageTesti yapiliyor");
    }




}
