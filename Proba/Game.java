import java.util.*;

public class Game implements Iterable<Character>{ // Alt+Enter megcsinálni az Override-ot

    List<Character> characterList = new ArrayList<>();

    // + hozzáadás metódus

    public List<Character> getActiveChars() throws CloneNotSupportedException {
        List<Character> activeList = new ArrayList<>();
        for(int i=0; i<characterList.size(); i++){
            if(characterList.get(i).isActive()){
                activeList.add(characterList.get(i).clone()); // clone → Alt+enter → exception cucc
            }
        }
        return activeList;
    }


    // "Iterátor adja vissza az aktív Character-ek klónjait fordított sorrendben"
    @Override
    public Iterator<Character> iterator() {
        List<Character> activeList = new ArrayList<>();
        try {
            activeList = getActiveChars(); // Alt+Enter → TryCatch
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Collections.reverse(activeList); // megfordítja a listát

        return activeList.iterator(); // ezután már csak simán vissza kell adni az iterátort

        // így foreach meghívásakor mindig fordítva fogja visszaadni a listát
    }
}
