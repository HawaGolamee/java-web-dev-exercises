package exercises.technology.test;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmartPhoneTest {


    SmartPhone mySmartPhone;
    @Before
    public void beforeTest(){
        SmartPhone mySmartPhone = new SmartPhone(5000, 4500, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest(){
        assertEquals(5000, this.mySmartPhone.getScreenWidth());
        assertEquals(4500, this.mySmartPhone.getScreenHeight());
        assertEquals("2021", this.mySmartPhone.getManufactureYear());
        assertEquals(true, this.mySmartPhone.isConnected5G());
    }


}
