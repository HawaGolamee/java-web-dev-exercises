package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComputerTest {

    Computer myComputer;
    @Before
    public void beforeTest(){
        Computer myComputer = new Computer(5000, 4500, "2021");
    }

    @Test
    public void constructorSetsValuesTest(){
        assertEquals(5000, this.myComputer.getScreenWidth());
        assertEquals(4500, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufactureYear());
    }

    @Test
    public void twoPlusTwoReturnFour(){

       int result = this. myComputer.processTwoPlusTwo();
       assertEquals(4, result);
    }
}
