import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public abstract class PrinterTest {

    private Printer printer;

    @Before
    public void before() {printer = new Printer (100, 90, 10);}


    //Create a Printer class that has a property for number of sheets of paper left.


   // Add a method to print that takes in a number of pages to be printed and number of copies to print.
    @Test
    public void hasCapacityJobComparison() {
        Printer printer = new Printer(100, 90, 10);
        assertTrue(printer.getCapacityJobComparison());
    }




   // The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.

        // Create a method to refill the printer paper.


        //Add a toner volume property to the class.

   // Modify the printer so that it reduces the toner by 1 for each page printed.

}


