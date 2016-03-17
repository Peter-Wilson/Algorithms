/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc3p03_assign3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pw12nb
 */
public class Question_1Test {
    
    public Question_1Test() {
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
     * Test of getLargestIncreasingPath method, of class Question_1.
     */
    @Test
    public void testGetLargestIncreasingPath() {
        System.out.println("getLargestIncreasingPath");
        int[] list = { 11, 17, 5, 8, 6, 4, 7, 12, 3 };
        Question_1 instance = new Question_1(list);
        int expResult = 4;
        int result = instance.getLargestIncreasingPath();
        assertEquals(expResult, result);
    }
    
}
