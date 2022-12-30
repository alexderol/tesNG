package Clarusway.test;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {
    //timeOut set edildiğinde test süresi bu sureyi gememelidir. gecmesi durumudna test exception firlatir
    //timeout gerceklestiği  andan itibaren sonraki satirler execute edilmez..kod yarida kesilir
    @Test(timeOut = 1000)
    public void passedTest() {
        System.out.println("1 saniyeden önce calisti");
    }
    @Test(timeOut = 1000)
    public void timedOutTest() throws InterruptedException {

        System.out.println("1 saniyeden sonra clasiti");
        Thread.sleep(1100);

    }

    @Test(timeOut = 1000)
    public void timedOutTest2() throws InterruptedException {//timeout exeptiondan sonra olduğu icin sout calismadi yukaridakinin tam tersi
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra clasiti");

    }
}
