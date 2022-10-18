import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "alma";
        String b = "bolt";

        System.out.println(b.compareTo(a));

        Player p1 = new Player("Alma", 432, 123);
        Player p2 = new Player("Bolt", 1200, 564);
        List<Player> playerList = new ArrayList<>();

        playerList.add(p1);
        playerList.add(p2);

        // System.out.println(playerList);

        Collections.sort(playerList);

        System.out.println(playerList);

    }
}
