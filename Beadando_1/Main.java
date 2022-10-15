import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("SM 19 KPT",100,false);
        Auto a2 = new Auto("SM 40 KEL", 200, false);
        Auto a3 = new Auto("SM 19 KPT",130,true);
        Teherauto t1 = new Teherauto("SM 23 ASD", 100, false,123);

        if(a1.equals(a2)){
            System.out.println("\"" + a1.getRendszam() + "\" same performance as \"" + a2.getRendszam() + "\"");
        }
        else {
            System.out.println("\"" + a1.getRendszam() + "\" not the same performance as \"" + a2.getRendszam() + "\"");
        }

        System.out.println("More power: "+ a2.compareCars(a2,a1));

        System.out.println("\"" + a1.getRendszam() + "\" same License plate number as \"" + a3.getRendszam() + "\" : " + a1.equals(a3));

        System.out.println(t1);
        System.out.println(a1);


        Scanner sc = new Scanner(System.in);
        String placeholderRendszam = sc.nextLine();

        Auto a4 = new Auto(placeholderRendszam, 100, true);
        System.out.println(a4);


        // Auto a = new Auto(String ,int ,boolean);
        Auto a5 = new Auto;
        a5 =  Auto (a5.setRendszam(sc.nextLine()), a5.setTeljesitmeny(sc.nextInt()), a5.setAutomata(sc.nextBoolean()));


    }
}