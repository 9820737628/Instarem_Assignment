package dao.assignment_executor;

/*Created by Sachin Pitrubhakt on 7/12/2018.*/

import org.testng.TestNG;

public class AssignmentExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			TestNG testSuite = new TestNG();
			testSuite.setTestClasses(new Class[] { dao.assignment_executor.Assignment1.class });
			testSuite.run();
			// Assignment 1 executed
			testSuite = new TestNG();
			testSuite.setTestClasses(new Class[] { dao.assignment_executor.Assignment2.class });
			testSuite.run();
			// Assignment 2 executed
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
