package cp_9_03;

import java.util.Scanner;

public class WinningTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team team = new Team();

        String name = scanner.next();
        int wins = scanner.nextInt();
        int losses = scanner.nextInt();


        team.setTeamName(name);
        team.setTeamWins(wins);
        team.setTeamLosses(losses);

        if (team.getWinPercentage() >= 0.5) {
            System.out.println("Congratulations, Team " + team.getTeamName() +
                    " has a winning average!");
        }
        else {
            System.out.println("Team " + team.getTeamName() +
                    " has a losing average.");
        }
    }
}
