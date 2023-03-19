package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.utils.ChallengeType;
import static de.exxcellent.challenge.utils.ChallengeType.FOOTBALL;
import static de.exxcellent.challenge.utils.ChallengeType.WEATHER;
import de.exxcellent.challenge.utils.FileType;
import static de.exxcellent.challenge.utils.FileType.CSV;
import static de.exxcellent.challenge.utils.FileType.JSON;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ApplicationController
 * @author j.jose
 */
public class ApplicationControllerTest {
    /**
     * Test of processFile method, of class ApplicationController for weather data
     */
    @Test
    public void testProcessFileWeather() throws Exception {
        String filename = "de/exxcellent/challenge/weather.csv";
        ChallengeType challengeType = WEATHER;
        FileType fileType = CSV;
        ApplicationController instance = new ApplicationController();
        String expResult = "Day with the smallest temperature spread (difference between maximum & minimum temperature of the day) : 14";
        String result = instance.processFile(filename, challengeType, fileType);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of processFile method, of class ApplicationController for football data
     */
    @Test
    public void testProcessFileFootball() throws Exception {
        String filename = "de/exxcellent/challenge/football.json";
        ChallengeType challengeType = FOOTBALL;
        FileType fileType = JSON;
        ApplicationController instance = new ApplicationController();
        String expResult = "Team with the smallest distance (absolute difference) between \"Goals\" and \"Goals Allowed\" : Aston_Villa";
        String result = instance.processFile(filename, challengeType, fileType);
        assertEquals(expResult, result);        
    }

    
}
