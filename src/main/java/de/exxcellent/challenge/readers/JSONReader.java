package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.FootballBO;
import de.exxcellent.challenge.bo.WeatherBO;
import de.exxcellent.challenge.utils.ChallengeType;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Reads a JSON file
 * @author j.jose
 */
public class JSONReader implements Reader {

    @Override
    public List<BaseBO> read(String jsonData, ChallengeType challengeType) {
        List<BaseBO> bo = new LinkedList<>();
        JSONObject jsonObject = new JSONObject(jsonData);
        switch (challengeType) {
            case FOOTBALL:
                JSONArray footballData = jsonObject.getJSONArray("footballData");
                for (int i = 0; i < footballData.length(); i++) {
                    FootballBO footballBO = new FootballBO(footballData.getJSONObject(i));
                    bo.add(footballBO);
                }
                break;
            case WEATHER:
                JSONArray weatherData = jsonObject.getJSONArray("weatherData");
                for (int i = 0; i < weatherData.length(); i++) {
                    WeatherBO weatherBO = new WeatherBO(weatherData.getJSONObject(i));
                    bo.add(weatherBO);
                }
                break;
        }

        return bo;
    }

}
