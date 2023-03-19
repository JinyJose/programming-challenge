package de.exxcellent.challenge.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Reads a file from the disc
 *
 * @author j.jose
 */
public class FileReaderUtil {

    /**
     * Read the file from the disc
     *
     * @param filename : name of the file
     * @return
     * @throws IOException
     */
    public static String readFile(String filename) throws IOException {
        try {
            InputStream inputStream = FileReaderUtil.class.getClassLoader().getResourceAsStream(filename);            
            if (inputStream == null) return null;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
