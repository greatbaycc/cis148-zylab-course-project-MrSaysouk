package cp_9_03;

public class Team {
    private String teamName;
    private int teamWins;
    private int teamLosses;

    public Team() {
    }

    public void setTeamName(String name) {
        teamName = name;
    }
    public void setTeamWins(int wins) {
        teamWins = wins;
    }
    public void setTeamLosses(int losses) {
        teamLosses = losses;
    }

    public String getTeamName() {
        return teamName;
    }
    public int getTeamWins() {
        return teamWins;
    }
    public int getTeamLosses() {
        return teamLosses;
    }

    public double getWinPercentage() {
        double winPercent = (double)teamWins / (teamWins + teamLosses);
        return winPercent;
    }

}