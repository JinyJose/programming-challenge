package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.utils.ChallengeType;
import java.util.List;

/**
 * Interface defining a CSV or JSON File Reader
 * @author j.jose
 */
public interface Reader {

    /**
     * Method to be implemented for reading CSV or JSON files
     * @param fileData : file contents
     * @param challengeType : type of challenge (weather , football)
     * @return
     */
    List<BaseBO> read(String fileData ,ChallengeType challengeType);

}
