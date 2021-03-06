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
public class Question_3Test {
    
    public Question_3Test() {
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
     * Test of getCheapestPath method, of class Question_3.
     */
    @Test
    public void testGetCheapestPath() {
        System.out.println("getCheapestPath");
        int n = 8;
        int[] prices = {0,5,8,6,15};
        int miles = 5;
        Question_3 instance = new Question_3(prices);
        int expResult = 20;
        int result = instance.getCheapestPath(n);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCheapestPath method, of class Question_3.
     */
    @Test
    public void testGetCheapestPath_2() {
        System.out.println("getCheapestPath with negatives");
        int n = 8;
        int[] prices = {0,-3,-5,-3,-6};
        Question_3 instance = new Question_3(prices);
        int expResult = -24;
        int result = instance.getCheapestPath(n);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCheapestPath method, of class Question_3.
     */
    @Test
    public void testGetCheapestPath_3() {
        System.out.println("getCheapestPath n is more than double the m");
        int n = 30;
        int[] prices = {0,5,8,6,15};
        Question_3 instance = new Question_3(prices);
        int expResult = 60;
        int result = instance.getCheapestPath(n);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getCheapestPath method, of class Question_3.
     */
    @Test
    public void testGetCheapestPath_4() {
        System.out.println("getCheapestPath with a 0 price");
        int n = 30;
        int[] prices = {0,0,8,6,15};
        Question_3 instance = new Question_3(prices);
        int expResult = 0;
        int result = instance.getCheapestPath(n);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
