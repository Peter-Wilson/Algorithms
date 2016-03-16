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
public class Question_2Test {
    
    public Question_2Test() {
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
     * Test of getLowestMultiplications method, of class Question_2.
     */
    @Test
    public void testGetLowestMultiplications() {
        System.out.println("getLowestMultiplications");
        int[] matrices = {4,10,3,12,20,7};
        Question_2 instance = new Question_2(5, matrices);
        int expResult = 1344;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_2() {
        System.out.println("getLowestMultiplications_2");
        int[] matrices = {10,20,50,1,100};
        Question_2 instance = new Question_2(4, matrices);
        int expResult = 2200;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_3() {
        System.out.println("getLowestMultiplications_2");
        int[] matrices = {10,30,5,60};
        Question_2 instance = new Question_2(3, matrices);
        int expResult = 4500;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
}
