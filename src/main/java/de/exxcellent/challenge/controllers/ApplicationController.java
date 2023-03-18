package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.processors.WeatherDataProcessor;
import de.exxcellent.challenge.readers.CSVReader;
import de.exxcellent.challenge.utils.ChallengeType;
import de.exxcellent.challenge.utils.FileReaderUtil;
import de.exxcellent.challenge.utils.FileType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * The application workflow is described here.
 * @author j.jose
 */
public class ApplicationController {

    /**
     * Processes the file 
     * @param filename : name of the file
     * @param challengeType : type of challenge (weather , football)
     * @param fileType : type of file (csv, json)
     * @return
     * @throws IOException
     */
    public String processFile(String filename, ChallengeType challengeType, FileType fileType) throws IOException {
        String fileData = FileReaderUtil.readFile(filename);
        return processCSVFile(fileData, challengeType);
    }

    /**
     *
     * @param fileData : file contents
     * @param challengeType : type of challenge (weather , football)
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String processCSVFile(String fileData, ChallengeType challengeType) throws FileNotFoundException, IOException {        
        List<BaseBO> processedObjectList = new CSVReader().read(fileData, challengeType);
        return new WeatherDataProcessor().processWeatherData(processedObjectList);
    }

}
