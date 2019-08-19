import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {

    private int nrPlayer;
    private String firstNamePlayer;
    private String secondNamePlayer;

    public Player(int nrPlayer, String firstNamePlayer, String secondNamePlayer){
        this.nrPlayer = nrPlayer;
        this.firstNamePlayer = firstNamePlayer;
        this.secondNamePlayer = secondNamePlayer;
    }

    @Override
    public String toString() {
        return nrPlayer +
                ". " + firstNamePlayer +
                " " + secondNamePlayer;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return nrPlayer == player.nrPlayer;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(nrPlayer);
    }
}

