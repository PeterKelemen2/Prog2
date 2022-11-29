import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(5,10,100,500);
        Player player2 = player1; // klónozás, ugyanaz a memóriacím, ha egyet módosítunk, akkor mindkettőt

        Player player3 = (Player) player1.clone(); // ez már használható, csak a számokat kapja meg. (Alt+Enter Cast)

        List<Character> charachterList = new ArrayList<>();
        charachterList.add(player1.clone());

        // Fileból beolvasást megnézni
    }
}
