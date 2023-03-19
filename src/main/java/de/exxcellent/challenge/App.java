package de.exxcellent.challenge;

import de.exxcellent.challenge.controllers.ApplicationController;
import de.exxcellent.challenge.utils.ChallengeType;
import static de.exxcellent.challenge.utils.ChallengeType.FOOTBALL;
import static de.exxcellent.challenge.utils.ChallengeType.WEATHER;
import static de.exxcellent.challenge.utils.FileType.CSV;
import static de.exxcellent.challenge.utils.FileType.JSON;
import java.io.IOException;
import java.util.Optional;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {
        String challengeType = WEATHER.toString();
        String fileType = CSV.toString();
        // For unit tests
        if (args != null && args.length != 0) {
            challengeType = Optional.ofNullable(args[0]).orElse(challengeType); //args[0];        
            fileType = Optional.ofNullable(args[1]).orElse(fileType); //args[1];        
        }

        System.out.println("!! Start Processing --- FileType : " + fileType + " , Challenge : " + challengeType + " ----- !!");
        try {
            if (WEATHER.toString().equalsIgnoreCase(challengeType)) {
                System.out.println(anlayseData(WEATHER , fileType));
            } else if (FOOTBALL.toString().equalsIgnoreCase(challengeType)) {
                System.out.println(anlayseData(FOOTBALL , fileType));                
            } else {
                System.out.println("Invalid challenge type --- Challenge : " + challengeType);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("!! End Processing --- FileType : " + fileType + " , Challenge : " + challengeType + " ------ !!");
        System.out.println("");

    }

    public static String anlayseData(ChallengeType challengeType, String fileType) throws IOException {

        String processedDataOutput = "Invalid file type --- FileType : " + fileType;
        ApplicationController applicationController = new ApplicationController();
        if (CSV.toString().equalsIgnoreCase(fileType)) {
            String filePath = challengeType.toString().equalsIgnoreCase("WEATHER") ? "de/exxcellent/challenge/weather.csv" : "de/exxcellent/challenge/football.csv";
            processedDataOutput = applicationController.processFile(filePath, challengeType, CSV);
        } else if (JSON.toString().equalsIgnoreCase(fileType)) {
            String filePath = challengeType.toString().equalsIgnoreCase("WEATHER") ? "de/exxcellent/challenge/weather.json" : "de/exxcellent/challenge/football.json";
            processedDataOutput = applicationController.processFile(filePath, challengeType, JSON);
        } 
        return processedDataOutput;
    }
}
