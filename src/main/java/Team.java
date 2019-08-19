import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {

    private final int MAX_NUMBER_PLAYERS = 4;

    private String teamName;
    private Player player;
    private List<Player> players;

    public Team() {
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        if (players.size() < 14) {
            boolean testEquals = true;
            for (Player player1 : players) {
                if (player.equals(player1)) {
                    testEquals = false;
                    System.out.println("Zawodnik z tym numerem występuje już w systemie");
                }
            }
            if (testEquals) {
                players.add(player);
            }
        } else {
            System.out.println("Przekroczono maksymalną liczbę zawodników w drużynie");
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public int teamSize() {
        return players.size();
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void printTeam(){
        System.out.println(teamName);
        for (Player p : players) {
            System.out.println(p.toString());
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return Objects.equals(teamName, team.teamName);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(teamName);
    }
}

