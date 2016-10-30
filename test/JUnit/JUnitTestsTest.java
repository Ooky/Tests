/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Creat-if
 */
public class JUnitTestsTest {

    public JUnitTestsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calc method, of class JUnitTests.
     */
    @Test
    public void testCalc() {
        System.out.println("calc");
        int x = 10;
        int y = 0;
        JUnitTests instance = new JUnitTests();
        int expResult = 0;
        int result = instance.calc(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalc2() {
        System.out.println("calc");
        int x = 10;
        int y = 3;
        JUnitTests instance = new JUnitTests();
        double expResult = 3.333;
        int result = instance.calc(x, y);
        assertEquals(expResult, result);
    }
    
    @Test(timeout=100)
    public void testCalc3() {
        JUnitTests calc = new JUnitTests();
        assertEquals(10, 2);
    }

}
