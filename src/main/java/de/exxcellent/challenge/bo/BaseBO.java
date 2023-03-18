package de.exxcellent.challenge.bo;

/**
 * Superclass for FootballBO and WeatherBO
 * @author j.jose
 */
public class BaseBO {
    int computeDifference(int num1, int num2) {
        int difference = Math.abs(num1 - num2);
        return difference;
    }  
}
