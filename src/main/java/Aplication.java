import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Jan", "Kowalsi");
        Player player2 = new Player(2, "Adam", "Nowak");

        Team team1 = new Team();
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        

    }
}


