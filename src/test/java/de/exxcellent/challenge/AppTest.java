package de.exxcellent.challenge;

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
}