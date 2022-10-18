package Verseny;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Versenyzo v1 = new Versenyzo(3, "zz", "bb");
        System.out.println(v1);

        Versenyzo v2 = new Versenyzo(1, "zz", "bb");
        System.out.println(v2);

        List<Versenyzo> versenyzoList = new ArrayList<>();
        versenyzoList.add(v1);
        versenyzoList.add(v2);

        String a = "aaaa";
        String b = "aaab";
        System.out.println(a.compareTo(b));
        // -1

        Collections.sort(versenyzoList);
        System.out.println(versenyzoList);

    }
}
