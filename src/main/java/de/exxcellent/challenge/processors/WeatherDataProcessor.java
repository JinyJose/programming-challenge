package de.exxcellent.challenge.processors;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.WeatherBO;
import java.util.Comparator;
import java.util.List;

/**
 * Defines the logic to compute the smallest temperature spread (difference between maximum & minimum temperature of the day)
 * @author j.jose
 */
public class WeatherDataProcessor implements DataProcessor{

    @Override
    public BaseBO calculateSpread(List<BaseBO> baseObjects) {
        
        List<WeatherBO> variable1 = (List<WeatherBO>)(List<?>) baseObjects;
        
        WeatherBO weatherBO = variable1.stream()
                        .min(Comparator.comparingInt(WeatherBO::getAbsoluteDifference))
                        .get();           
     
        return (BaseBO) weatherBO;
    }
    
    /**
     * Computes the smallest temperature spread (difference between maximum & minimum temperature of the day)
     * @param weatherData : List of weather objects
     * @return
     */
    public String processWeatherData (List<BaseBO> weatherData)
    {
        WeatherBO weatherBO = (WeatherBO) new WeatherDataProcessor().calculateSpread(weatherData);
        return ("Day with the smallest temperature spread (difference between maximum & minimum temperature of the day) : "  + weatherBO.getDay());       
    }
    
}
