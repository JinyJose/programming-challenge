package de.exxcellent.challenge.processors;

import de.exxcellent.challenge.bo.BaseBO;
import de.exxcellent.challenge.bo.FootballBO;
import java.util.Comparator;
import java.util.List;

/**
 * Defines the logic to compute the smalles distance between Goals and Goals Allowed
 * @author j.jose
 */
public class FootballDataProcessor implements DataProcessor{

    @Override
    public BaseBO calculateSpread(List<BaseBO> baseObjects) {
        
        List<FootballBO> variable = (List<FootballBO>)(List<?>) baseObjects;
        
        FootballBO footballBO = variable.stream()
                        .min(Comparator.comparingInt(FootballBO::getAbsoluteDifference))
                        .get();           
     
        return (BaseBO) footballBO;
    }
    
    /**
     * Computes the smallest distance between Goals and Goals Allowed
     * @param footballData : List of football objects
     * @return
     */
    public String processFootballData (List<BaseBO> footballData)
    {
        FootballBO footballBO = (FootballBO)new FootballDataProcessor().calculateSpread(footballData);
        return ("Team with the smallest distance (absolute difference) between \"Goals\" and \"Goals Allowed\" : "  + footballBO.getTeam());       
    }
    
}
