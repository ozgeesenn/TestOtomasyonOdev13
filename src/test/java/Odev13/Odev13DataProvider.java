package Odev13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Odev5.MuhasebeTest;
import static org.testng.Assert.assertEquals;

public class Odev13DataProvider {

    MuhasebeTest muhasebeTest= new MuhasebeTest();

    @Test(groups = "PassTests", dataProvider = "maasdata")
    public void maasHesaplaTest(int a, int b){
        assertEquals(muhasebeTest.maasHesaplama(a),b);
    }

    @Test(groups = "PassTests", dataProvider = "primdata")
    public void primesaplaTest(int a, int b){
        assertEquals(muhasebeTest.primHesaplama(a),b);
    }


    @DataProvider(name = "maasdata")
    public Object[][] maasdata(){
        return new Object[][]{{10,3000},{20,6000}};
    }

    @DataProvider(name = "primdata")
    public Object[][] primdata(){
        return new Object[][]{{25,0},{50,25000}};

    }
}
