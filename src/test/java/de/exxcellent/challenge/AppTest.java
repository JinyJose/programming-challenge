package de.exxcellent.challenge;

import de.exxcellent.challenge.utils.ChallengeType;
import static de.exxcellent.challenge.utils.ChallengeType.FOOTBALL;
import static de.exxcellent.challenge.utils.ChallengeType.WEATHER;
import static de.exxcellent.challenge.utils.FileType.CSV;
import static de.exxcellent.challenge.utils.FileType.JSON;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";

    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runFootballCSV() {
        App.main("football", "csv");
    }
    
    @Test
    void runWeatherCSV() {
        App.main("weather", "CSV");
    }
  
  @Test
    void runFootballJSON() {
        App.main("football", "json");
    }
    
    @Test
    void runWeatherJSON() {
        App.main("weather", "json");
    }
    
    @Test
    void runFootball_invalid() {
        App.main("football", "xyz");    
    }
    
    @Test
    void runWeather_invalid() {
        App.main("weather", "xyz"); 
    }
    
    @Test
    void runChallenge_invalid() {
        App.main("months", "csv");    
        App.main("weeks", "json");    
    }
    
    /**
     * Test of anlayseData method, of class App with weather data
     */
    @Test
    public void testAnlayseData_weather() throws Exception {
        System.out.println("anlayseData");
        ChallengeType challengeType = WEATHER;
        String fileType = CSV.toString();
        String expResult = "Day with the smallest temperature spread (difference between maximum & minimum temperature of the day) : 14";
        String result = App.anlayseData(challengeType, fileType);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of anlayseData method, of class App with weather data
     */
    @Test
    public void testAnlayseData_football() throws Exception {
        System.out.println("anlayseData");
        ChallengeType challengeType = FOOTBALL;
        String fileType = JSON.toString();
        String expResult = "Team with the smallest distance (absolute difference) between \"Goals\" and \"Goals Allowed\" : Aston_Villa";
        String result = App.anlayseData(challengeType, fileType);
        assertEquals(expResult, result);
    }
    
}