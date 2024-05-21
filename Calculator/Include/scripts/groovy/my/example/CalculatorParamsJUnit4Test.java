package my.example;

/*
    Source code is based on the material from Katalon:
    https://github.com/katalon-studio/testops-junit4
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

// This annotation tells JUnit to run the test methods in this class in a special way, 
// which allows us to easily provide different inputs to the same test method.
@RunWith(Parameterized.class)
public class CalculatorParamsJUnit4Test {

    // This method provides the data for the test. Each element in this collection will be used as a parameter to the test method.
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }
        });
    }

    // These are the inputs for the test. They are set in the constructor.
    private int fInput;
    private int fExpected;

    // This is the constructor for the test class. JUnit will construct a new instance of this class for each element in the collection returned by the data() method.
    public CalculatorParamsJUnit4Test(int input, int expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

    // This is the test method. It will be run once for each element in the collection returned by the data() method.
    @Test
    public void test() {
        assertEquals(fExpected, fInput);
    }
}

