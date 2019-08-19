import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Match {

    private Team team1;
    private Team team2;
    private int numberGoalsTeam1;
    private int numberGoalsTeam2;

    public Match(Team team1, Team team2, int numberGoalsTeam1, int numberGoalsTeam2){
        this.team1 = team1;
        this.team2 = team2;
        this.numberGoalsTeam1 = numberGoalsTeam1;
        this.numberGoalsTeam2 = numberGoalsTeam2;
    }

    public int getNumberGoalsTeam1() {
        return numberGoalsTeam1;
    }

    public void setNumberGoalsTeam1(int numberGoalsTeam1) {
        this.numberGoalsTeam1 = numberGoalsTeam1;
    }

    public int getNumberGoalsTeam2() {
        return numberGoalsTeam2;
    }

    public void setNumberGoalsTeam2(int numberGoalsTeam2) {
        this.numberGoalsTeam2 = numberGoalsTeam2;
    }

    public String toString(){
        return team1.getTeamName() + " : " + team2.getTeamName() + " " + numberGoalsTeam1 + ":" + numberGoalsTeam2;
    }
}
