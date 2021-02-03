package exercises.technology.test;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LaptopTest {


    Laptop myLaptop;
    @Before
    public void beforeTest(){
        Laptop myLaptop = new Laptop(5000, 4500, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest(){
        assertEquals(5000, this.myLaptop.getScreenWidth());
        assertEquals(4500, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }

    @Test
    public void isOpenedIntelliJReturnsTrueTest(){

        this.myLaptop.setIntelliJOpened(false);
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.getisIntelliJOpened());
    }
}
