package de.exxcellent.challenge.utils;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for FileReader class
 * @author j.jose
 */
public class FileReaderUtilTest {

    /**
     * Test of readFile method, of class FileReaderUtil.
     */
    @Test
    public void testReadFile() throws IOException {
        String filename = "de/exxcellent/challenge/weather.csv";
        String result = FileReaderUtil.readFile(filename);
        assertNotNull(result);
    }
    
    /**
     * Test of readFile method, of class FileReaderUtil.
     */
    @Test
    public void testReadFile_invalidFile() throws IOException {
        String filename = "de/exxcellent/challenge/invalid.csv";
        String result = FileReaderUtil.readFile(filename);
        assertNull(result);
    }
    
}
