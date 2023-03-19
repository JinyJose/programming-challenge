package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.utils.ChallengeType;
import static de.exxcellent.challenge.utils.ChallengeType.FOOTBALL;
import de.exxcellent.challenge.utils.FileReaderUtil;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for CSV Reader
 * @author j.jose
 */
public class CSVReaderTest {
    
    /**
     * Test of read method, of class CSVReader.
     */
    @Test
    public void testRead() throws IOException{
        String filename = "de/exxcellent/challenge/football.csv";
        String csvData = FileReaderUtil.readFile(filename);
        ChallengeType challengeType = FOOTBALL;
        CSVReader instance = new CSVReader();
        List<BaseBO> result = instance.read(csvData, challengeType);
        assertEquals(20, result.size());  
    }
    
}
