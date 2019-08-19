import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void addPlayerShouldNotAddingPlayersWithTheSameNrPlayer() {
        Team team1 = new Team();
        team1.addPlayer(new Player(5, "Jan", "Kowalski"));
        team1.addPlayer(new Player(5, "Michał", "Nowak"));
        assertEquals(1,team1.teamSize());
    }

    @Test
    public void removePlayerShouldRemovePlayersFromTeam() {
        Team team1 = new Team();
        Player player1 = new Player(5, "Jan", "Kowalski");
        Player player2 = new Player(6, "Michał", "Nowak");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.removePlayer(player2);
        assertEquals(1,team1.teamSize());
    }



}
