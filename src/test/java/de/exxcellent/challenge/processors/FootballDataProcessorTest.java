package de.exxcellent.challenge.processors;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.FootballBO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for FootballDataProcessor class
 * @author j.jose
 */
public class FootballDataProcessorTest {
    
    /**
     * Test of processFootballData method, of class FootballDataProcessor.
     */
    @Test
    public void testProcessFootballData() {
        List<BaseBO> footballBOs = new ArrayList<>();
        FootballBO footballBO1 = new FootballBO("Arsenal,38,26,9,3,79,36,87");
        FootballBO footballBO2 = new FootballBO("Liverpool,38,24,8,6,67,30,80");
        footballBOs.add(footballBO1);
        footballBOs.add(footballBO2);
        FootballDataProcessor instance = new FootballDataProcessor();
        String expResult = "Team with the smallest distance (absolute difference) between \"Goals\" and \"Goals Allowed\" : Liverpool";
        String result = instance.processFootballData(footballBOs);
        assertEquals(expResult, result);
    }
    
}
