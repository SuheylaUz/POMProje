package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReaders;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class Day22_ReasubleMethods_WebLists extends TestBaseRapor {



    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReaders.getProperty("amazon_url"));

        AmazonPage amazonPage = new AmazonPage();
        List<WebElement> tumDatalar = amazonPage.tumDataWebElementList;

        System.out.println(ReusableMethods.getElementsText(tumDatalar));


    }
}
