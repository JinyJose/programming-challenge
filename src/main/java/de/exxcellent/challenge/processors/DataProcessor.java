package de.exxcellent.challenge.processors;

import de.exxcellent.challenge.bo.BaseBO;
import java.util.List;

/**
 * Interface defining the method to be implemented for football and weather data processing
 * @author j.jose
 */
public interface DataProcessor {
    
    /**
     * Method to be implemented for football and weather data processing
     * @param baseObjects : List of football or weather objects
     * @return
     */
    BaseBO calculateSpread(List<BaseBO> baseObjects);
}
