import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {waterBottle = new WaterBottle(100);}

    //Create a water bottle class with a volume property.

    // The volume should start at 100.
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());

    }

    // Add a drink function that takes 10 from the volume each time it is called.

    @Test
    public void hasDrinkWater() {
        assertEquals(90, waterBottle.getDrinkWater());
    }

    //Create an empty function that brings the volume down to 0.

    @Test
    public void hasEmptyBottle(){
        assertEquals( 0, waterBottle.getEmptyBottle());

    }

    //Create a fill function that fills the volume back to 100.
    @Test
    public void hasFillBottle(){
        assertEquals(100, waterBottle.getFillBottle());

    }

}
