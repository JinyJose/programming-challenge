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
 * Test for JSONReader class
 * @author j.jose
 */
public class JSONReaderTest {
    
    /**
     * Test of read method, of class JSONReader.
     */
    @Test
    public void testRead() throws IOException{
        String filename = "de/exxcellent/challenge/football.json";
        String jsonData = FileReaderUtil.readFile(filename);
        ChallengeType challengeType = FOOTBALL;
        JSONReader instance = new JSONReader();
        List<BaseBO> result = instance.read(jsonData, challengeType);
        assertEquals(20, result.size());
    }
    
}
