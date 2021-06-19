package tests;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;
import utilities.ConfigReaders;
import utilities.Driver;

public class Day22_IlkClass {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReaders.getProperty("kr_url"));
    }

}
