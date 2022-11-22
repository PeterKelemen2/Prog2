import java.util.List;
import java.util.Scanner;

public class Szolobirtok {
    List<Parcella> parcellaList;

    public Szolobirtok(List<Parcella> parcellaList) {
        this.parcellaList = parcellaList;
    }

    @Override
    public String toString() {
        return "Szolobirtok{" +
                "parcellaList=" + parcellaList +
                '}';
    }

    public void selectParcel() {

        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("Adj meg helyrajzi szamot: ");
        num1 = scanner.nextInt();
        for (int i = 0; i < parcellaList.size(); i++) {
            if (parcellaList.get(i).helyRajziSz == num1) {
                System.out.println("Mit szeretnel csinalni?");
                System.out.println("1: Fajta modositasa");
                System.out.println("2: Tokeszam modositasa");
                System.out.println("3: Evestermes modositasa");
                System.out.print("Opcio: ");
                Scanner sc = new Scanner(System.in);
                int num2;
                num2 = sc.nextInt();

                switch (num2){
                    case 1:
                        // Fajta modositasa
                        Scanner sc2 = new Scanner(System.in);
                        int szF;
                        szF = sc2.nextInt();
                        switch (num2){
                            case 1:
                                parcellaList.get(i).setFajta(Szolofajta.FURMINT);
                                break;
                            case 2:
                                parcellaList.get(i).setFajta(Szolofajta.KEKFRANKOS);
                                break;
                            case 3:
                                parcellaList.get(i).setFajta(Szolofajta.LEANYKA);
                        }
                        sc2.close();
                        break;
                    case 2:
                        // Tokeszam modositasa
                        Scanner sc3 = new Scanner(System.in);
                        int modTokeSz;
                        modTokeSz = sc3.nextInt();
                        parcellaList.get(i).setTokeSzam(modTokeSz);
                        sc3.close();
                        break;
                    case 3:
                        Scanner sc4 = new Scanner(System.in);
                        int modEv;
                        modEv = sc4.nextInt();
                        double modOsszT;
                        modOsszT = sc4.nextDouble();

                        parcellaList.get(i).setEvesTermes(new EvesTermes (modEv, modOsszT)); // szopik

                }
            }
        }
        scanner.close();
    }

    public void modifyParcel(){
        System.out.println("Mit szeretnel csinalni?");
        System.out.println("1: Fajta modositasa");
        System.out.println("2: Tokeszam modositasa");
        System.out.println("3: Evestermes modositasa");
        System.out.print("Opcio: ");
        Scanner sc = new Scanner(System.in);
        int num2;
        num2 = sc.nextInt();
    }
}
