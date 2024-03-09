package Odev13;

import Odev5.MuhasebeTest;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Odev13Test {

    MuhasebeTest muhasebeTest= new MuhasebeTest();

    @Test(groups = "Passed Test")
    public void maasHesaplaTest(){

        assertEquals(muhasebeTest.maasHesaplama(10),3000);
    }

    @Test(groups = "Failed Test")
    public void maasHesaplaHataliTest()
    {
        assertEquals(muhasebeTest.maasHesaplama(10),4000);
    }

    @Test(groups="Passed Test")
    public void primHeesaplaTest()
    {
        assertEquals(muhasebeTest.primHesaplama(75),50000);
    }

    @Test(groups="Failed Test")
    public void primHeesaplaHataliTest()
    {
        assertEquals(muhasebeTest.primHesaplama(75),50000777);
    }

}
