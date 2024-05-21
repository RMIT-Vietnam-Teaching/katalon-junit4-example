package my.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// This annotation tells JUnit to run this class as a suite of tests.
@RunWith(Suite.class)
// This annotation tells JUnit which test classes to include in this suite.
@SuiteClasses({
        CalculatorJUnit4Test.class,
        CalculatorParamsJUnit4Test.class })
public class CalculatorJUnit4AllTests {

}

