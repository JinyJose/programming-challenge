package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.WeatherBO;
import de.exxcellent.challenge.utils.ChallengeType;
import java.util.LinkedList;
import java.util.List;

/**
 * Reads a CSV file
 * @author j.jose
 */
public class CSVReader implements Reader {

    @Override
    public List<BaseBO> read(String csvData, ChallengeType challengeType) {

        List<BaseBO> bo = new LinkedList<>();
        String[] csv = csvData.split(System.lineSeparator());
        for (int i = 1; i < csv.length; i++) {
            WeatherBO weatherBO = new WeatherBO(csv[i]);
            bo.add(weatherBO);
        }
        return bo;
    }

}
