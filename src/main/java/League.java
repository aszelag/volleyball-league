import java.util.ArrayList;
import java.util.List;

public class League {

    private List<Match> matches;

    public League() {
        this.matches = new ArrayList<>();
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void removeMatch(Match match) {
        matches.remove(match);
    }

    public void printMatches(){
        for (Match m : matches) {
            System.out.println(m.toString());
        }
    }

    public int leagueSize() {
        return matches.size();
    }
}
