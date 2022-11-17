import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Auto = (rendszam, loero, valto)
    // Teherauro extends Auto = (rendszam, loero, valto, teherbiras)

    public static void lightWeightBaby(ArrayList<Auto> vList){
        for(int i=0; i<vList.size(); i++){
            if(vList.get(i).getClass().getSimpleName() == "Teherauto"){

                if(vList.get(i).getTeljesitmeny() > 20){ // teherbiras kellene, de nem tudom access-elni
                    System.out.println(vList.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Auto> vehicleList= new ArrayList<>();

        Auto elso = new Auto("ABC123", 100, true);
        System.out.println(elso);

        elso.checkPlate();
        System.out.println();

        // Auto = {String, int, boolean}
        Auto a1;
        Auto a2;
        Teherauto t1;
        Teherauto t2;

        /*
        Scanner sc1 = new Scanner(System.in);
        a1 = new Auto( sc1.nextLine(), sc1.nextInt(), sc1.nextBoolean() );
        sc1.close();

        Scanner sc2 = new Scanner(System.in);
        a2 = new Auto( sc2.nextLine(), sc2.nextInt(), sc2.nextBoolean() );
        sc2.close();

        Scanner sc3 = new Scanner(System.in);
        t1 = new Teherauto(sc3.nextLine(), sc3.nextInt(), sc3.nextBoolean(), sc3.nextInt());
        sc3.close();

        Scanner sc4 = new Scanner(System.in);
        t2 = new Teherauto(sc4.nextLine(), sc4.nextInt(), sc4.nextBoolean(), sc4.nextInt());
        sc4.close();
        */

        a1 = new Auto("asdsad", 213, false);
        a2 = new Auto("sadas", 223, true);
        t1 = new Teherauto("ggg", 12, true, 23);
        t2 = new Teherauto("sada", 4342, false, 32);

        vehicleList.add(a1);
        vehicleList.add(a2);
        vehicleList.add(t1);
        vehicleList.add(t2);

        lightWeightBaby(vehicleList);
        /*
        for(int i=0; i < vehicleList.size(); i++){
            System.out.println(vehicleList.get(i));
        }

    */
    }
}