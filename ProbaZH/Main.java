import javax.swing.plaf.FontUIResource;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printList(List<Parcella> list){
        for (int i=0; i<list.size(); i++){
            System.out.println(i+1 + ". " + list.get(i));
        }
    }


    public static void main(String[] args) {
        Parcella p1 = new Parcella(123, Szolofajta.KEKFRANKOS, 12, new EvesTermes(1999,18));
        Parcella p2 = new Parcella(245, Szolofajta.FURMINT, 35, new EvesTermes(2000,34));
        Parcella p3 = new Parcella(678, Szolofajta.LEANYKA, 64, new EvesTermes(2001, 65));

        List<Parcella> parcellas = new ArrayList<>();
        parcellas.add(p1);
        parcellas.add(p2);
        parcellas.add(p3);

        printList(parcellas);


        //p1.selectParcel();


    }
}
