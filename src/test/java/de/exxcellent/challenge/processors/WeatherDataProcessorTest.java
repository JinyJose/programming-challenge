package de.exxcellent.challenge.processors;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.WeatherBO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for WeatherDataProcessor Class
 * @author j.jose
 */
public class WeatherDataProcessorTest {
    /**
     * Test of processWeatherData method, of class WeatherDataProcessor.
     */
    @Test
    public void testProcessWeatherData() {
        System.out.println("processWeatherData");
        List<BaseBO> weatherBOs = new ArrayList<>();
        WeatherBO weatherBO1 = new WeatherBO("1,88,59,74,53.8,0,280,9.6,270,17,1.6,93,23,1004.5");
        WeatherBO weatherBO2 = new WeatherBO("2,79,63,71,46.5,0,330,8.7,340,23,3.3,70,28,1004.5");
        weatherBOs.add(weatherBO1);
        weatherBOs.add(weatherBO2);
        WeatherDataProcessor instance = new WeatherDataProcessor();
        String expResult = "Day with the smallest temperature spread (difference between maximum & minimum temperature of the day) : 2";
        String result = instance.processWeatherData(weatherBOs);
        assertEquals(expResult, result);
    }
    
}
