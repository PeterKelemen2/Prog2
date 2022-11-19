import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Auto = (rendszam, loero, valto)
    // Teherauro extends Auto = (rendszam, loero, valto, teherbiras)

    public static void printList(List<Auto> list){
        System.out.println("Printed "+ list.getClass().getSimpleName());
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    public static List<Auto> lightWeightBaby(List<Auto> vList){
        List<Auto> collected = new ArrayList<>();

        for(int i=0; i<vList.size(); i++){
            if(vList.get(i).getClass().getSimpleName() == "Teherauto"){

                if(vList.get(i).getTeljesitmeny() > 20){ // teherbiras kellene, de nem tudom access-elni
                    // System.out.println(vList.get(i));
                    collected.add(vList.get(i));
                }
            }
        }
        return collected;
    }

    public static void mostPower(List<Auto> list){
        int length = list.size();
        Collections.sort(list);
        System.out.println(list);

        if(length >= 3){
            for(int i=0; i<3; i++){
                System.out.println(list.get(i));
            }
        } else {
            for(int i=0; i<length; i++){
                System.out.println(list.get(i));
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<Auto> vehicleList= new ArrayList<>();

        Auto elso = new Auto("ABC123", 100, true);
        System.out.println(elso);

        elso.checkPlate();
        System.out.println();

        Auto a1;
        Auto a2;
        Auto a3;
        Teherauto t1;
        Teherauto t2;
        Teherauto t3;

        // Scannelés helye

        a1 = new Auto("SFT385", 233, false);
        a2 = new Auto("HUS138", 84, true);
        a3 = new Auto("JZS139", 124, true);
        t1 = new Teherauto("KLR157", 74, true, 23);
        t2 = new Teherauto("KDA179", 64, false, 32);
        t3 = new Teherauto("OJT157", 97, true, 23);

        vehicleList.add(a1);
        vehicleList.add(a2);
        vehicleList.add(a3);
        vehicleList.add(t1);
        vehicleList.add(t2);
        vehicleList.add(t3);

        printList(vehicleList);
        mostPower(vehicleList);
        // System.out.println(lightWeightBaby(vehicleList));

        System.out.println(Auto.getNumOfInstances());
    }
}