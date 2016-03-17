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
        Question_2 instance = new Question_2(matrices);
        int expResult = 1344;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_2() {
        System.out.println("getLowestMultiplications_2");
        int[] matrices = {10,20,50,1,100};
        Question_2 instance = new Question_2(matrices);
        int expResult = 2200;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_3() {
        System.out.println("getLowestMultiplications_3");
        int[] matrices = {10,30,5,60};
        Question_2 instance = new Question_2(matrices);
        int expResult = 4500;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_4() {
        System.out.println("getLowestMultiplications_4");
        int[] matrices = {40, 20, 30, 10, 30};
        Question_2 instance = new Question_2(matrices);
        int expResult = 26000;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_5() {
        System.out.println("getLowestMultiplications_5");
        int[] matrices = {10, 20, 30, 40, 30};
        Question_2 instance = new Question_2(matrices);
        int expResult = 30000;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_6() {
        System.out.println("getLowestMultiplications_6");
        int[] matrices = {10, 20, 30};
        Question_2 instance = new Question_2(matrices);
        int expResult = 6000;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_7() {
        System.out.println("getLowestMultiplications_6");
        int[] matrices = {30, 35, 15, 5, 10, 20, 25};
        Question_2 instance = new Question_2(matrices);
        int expResult = 15125;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
    @Test
    public void testGetLowestMultiplications_8() {
        System.out.println("getLowestMultiplications_6");
        int[] matrices = {20, 25, 5, 10, 30, 15, 20, 10, 5, 40};
        Question_2 instance = new Question_2(matrices);
        int expResult = 13500;
        int result = instance.getLowestMultiplications();
        assertEquals(expResult, result);
        instance.printBrackets();
    }
    
}
