/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bdaniel
 */
public class StageResultsTest {
    
    private StageResults empty;
    private StageResults full;
    private StageResults halfFull;
    
    public StageResultsTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        empty = new StageResults();
        
        full = new StageResults();
        full.addModuleMark(120, 50.0);
        
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testAddModuleMark() {
        System.out.println("Testing Add module");
        
        empty.addModuleMark(10, 10);
        System.out.println(empty.getTotalMarks());
        
        empty.addModuleMark(10, 20);
        System.out.println(empty.getTotalMarks());
        
        empty.addModuleMark(10, 40);
        System.out.println(empty.getTotalMarks());
        
        empty.resetValues();
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testCalculateAverageSoFar() {
        assertEquals("empty", 0.0, empty.calculateAverageSoFar(), 0.0); 
        assertEquals("full @ 50%", 50.0, full.calculateAverageSoFar(), 0.0);
        full.resetValues();
        full.addModuleMark(120, 100.0);
        assertEquals("full @ 100%", 100.0, full.calculateAverageSoFar(), 0.0);
    }

    @Test
    public void testIsComplete() {
        System.out.println("Testing Complete");
        
        assertFalse("empty object", empty.isComplete());
        
        assertFalse("halfFull object", halfFull.isComplete());
        
        assertTrue("full object", full.isComplete());
    }

    @Test
    public void testPredictClass() {
       double[] marks = {0.00, 50.00, 50.00, 100.00, 39.99, 40.0,
                        49.99, 50.0, 59.99, 60.0, 69.99, 70.0, 99.99, 35.67,
                        44.22, 56.39, 64.00, 76.80};
       
       String[] expResult1 = {"No marks", "Lower 2nd",
                            "Lower 2nd", "1st", "Fail", "3rd", "3rd", "Lower 2nd",
                            "Lower 2nd", "Upper 2nd", "Upper 2nd", "1st", "1st",
                            "Fail", "3rd", "Lower 2nd", "Upper 2nd", "1st"};
       
       for (int count = 0; count < marks.length; count++) {
           full.resetValues();
           full.addModuleMark(120, marks[count]);
           assertEquals("120 credits, mark = " + marks[count], 
           expResult1[count], full.predictClass());
       }
    
    }

    @Test
    public void testResetValues() {
        System.out.println("Testing resetValues");
        
        full.resetValues();
        
        int expIntResult = 0;
        double expDoubleResult = 0.0;
        
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);
        
        full.addModuleMark(120, 50.0);
    }
    
}
