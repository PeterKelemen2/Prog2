import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(5,10,100,500);
        Player player2 = player1; // klónozás, ugyanaz a memóriacím, ha egyet módosítunk, akkor mindkettőt

        Player player3 = (Player) player1.clone(); // ez már használható, csak a számokat kapja meg. (Alt+Enter Cast)

        List<Character> charachterList = new ArrayList<>();
        charachterList.add(player1.clone());

            // Fileból beolvasás
        try{
            Scanner scanner = new Scanner(new File("src/player.txt"));

            while(scanner.hasNext()){
                String s = scanner.nextLine();
                String[] adatok = s.split(",");
                charachterList.add(
                        new Player(Integer.parseInt(adatok[0]),
                                   Integer.parseInt(adatok[1]),
                                   Integer.parseInt(adatok[2]),
                                   Integer.parseInt(adatok[3]))
                    );
                }
            System.out.println(charachterList);
            }
        catch (FileNotFoundException e){
            e.printStackTrace();
            }
        }
}
