package de.exxcellent.challenge.bo;

import org.json.JSONObject;

/**
 * Definition of Football Data
 * @author j.jose
 */
public class FootballBO extends BaseBO {

    private String team;

    private int games;

    private int wins;

    private int losses;

    private int draws;

    private int goals;

    private int goalsAllowed;

    private int points;

    private int absoluteDifference;

    /**
     * Constructor for csv String Input
     * @param footballTeamDataStr
     */
    public FootballBO(String footballTeamDataStr) {
        String[] footballTeamData = footballTeamDataStr.split(",");
        this.team = footballTeamData[0];
        this.games = Integer.parseInt(footballTeamData[1]);
        this.wins = Integer.parseInt(footballTeamData[2]);
        this.losses = Integer.parseInt(footballTeamData[3]);
        this.draws = Integer.parseInt(footballTeamData[4]);
        this.goals = Integer.parseInt(footballTeamData[5]);
        this.goalsAllowed = Integer.parseInt(footballTeamData[6]);
        this.points = Integer.parseInt(footballTeamData[7]);
        this.absoluteDifference = computeDifference(this.getGoals(), this.getGoalsAllowed());
    }
    /**
     * Contructor for JSONObject Input
     * @param footballTeamDataJsonStr
     */
    public FootballBO(JSONObject footballTeamDataJsonStr) {
        this.team = footballTeamDataJsonStr.getString("Team");
        this.games = footballTeamDataJsonStr.getInt("Games");
        this.wins = footballTeamDataJsonStr.getInt("Wins");
        this.losses = footballTeamDataJsonStr.getInt("Losses");
        this.draws = footballTeamDataJsonStr.getInt("Draws");
        this.goals = footballTeamDataJsonStr.getInt("Goals");
        this.goalsAllowed = footballTeamDataJsonStr.getInt("Goals Allowed");
        this.points = footballTeamDataJsonStr.getInt("Points");
        this.absoluteDifference = computeDifference(this.getGoals(), this.getGoalsAllowed());
    }
    
    /**
     * Get the value of points
     *
     * @return the value of points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Set the value of points
     *
     * @param Points new value of points
     */
    public void setPoints(int Points) {
        this.points = Points;
    }

    /**
     * Get the value of goalsAllowed
     *
     * @return the value of goalsAllowed
     */
    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    /**
     * Set the value of goalsAllowed
     *
     * @param GoalsAllowed new value of goalsAllowed
     */
    public void setGoalsAllowed(int GoalsAllowed) {
        this.goalsAllowed = GoalsAllowed;
    }

    /**
     * Get the value of goals
     *
     * @return the value of goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Set the value of goals
     *
     * @param Goals new value of goals
     */
    public void setGoals(int Goals) {
        this.goals = Goals;
    }

    /**
     * Get the value of draws
     *
     * @return the value of draws
     */
    public int getDraws() {
        return draws;
    }

    /**
     * Set the value of draws
     *
     * @param Draws new value of draws
     */
    public void setDraws(int Draws) {
        this.draws = Draws;
    }

    /**
     * Get the value of losses
     *
     * @return the value of losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Set the value of losses
     *
     * @param Losses new value of losses
     */
    public void setLosses(int Losses) {
        this.losses = Losses;
    }

    /**
     * Get the value of wins
     *
     * @return the value of wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Set the value of wins
     *
     * @param Wins new value of wins
     */
    public void setWins(int Wins) {
        this.wins = Wins;
    }

    /**
     * Get the value of games
     *
     * @return the value of games
     */
    public int getGames() {
        return games;
    }

    /**
     * Set the value of games
     *
     * @param Games new value of games
     */
    public void setGames(int Games) {
        this.games = Games;
    }

    /**
     * Get the value of team
     *
     * @return the value of team
     */
    public String getTeam() {
        return team;
    }

    /**
     * Set the value of team
     *
     * @param Team new value of team
     */
    public void setTeam(String Team) {
        this.team = Team;
    }

    /**
     * Get the value of absoluteDifference
     *
     * @return the value of absoluteDifference
     */
    public int getAbsoluteDifference() {
        return absoluteDifference;
    }

    /**
     * Set the value of absoluteDifference
     *
     * @param absoluteDifference new value of absoluteDifference
     */
    public void setAbsoluteDifference(int absoluteDifference) {
        this.absoluteDifference = absoluteDifference;
    }

}
