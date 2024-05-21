package my.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// This is a test class for the Calculator class.
public class CalculatorJUnit4TestSuite {
	public static void main(String[] args) {
	      // This line runs the AllTests test suite and collects the results.
	      Result result = JUnitCore.runClasses(CalculatorJUnit4AllTests.class);

	      // This loop prints out a message for each test failure.
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }

	      // This line prints out whether all the tests were successful.
	      System.out.println(result.wasSuccessful());
	}
}

