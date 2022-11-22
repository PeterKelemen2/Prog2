import java.util.Scanner;

public class Parcella {
    int helyRajziSz;
    Szolofajta fajta;
    double tokeSzam;
    EvesTermes evesTermes;

    public Parcella(int helyRajziSz, Szolofajta fajta, int tokeSzam, EvesTermes evesTermes) {
        this.helyRajziSz = helyRajziSz;
        this.fajta = fajta;
        this.tokeSzam = tokeSzam;
        this.evesTermes = evesTermes;
        this.evesTermes.tokeErtek = evesTermes.osszTermes/tokeSzam;
    }

    @Override
    public String toString() {
        return "Parcella {" +
                "helyRajziSz=" + helyRajziSz +
                ", fajta=" + fajta +
                ", tokeSzam=" + tokeSzam +
                ", evesTermes=" + evesTermes +
                '}';
    }

    public int getHelyRajziSz() {
        return helyRajziSz;
    }

    public void setHelyRajziSz(int helyRajziSz) {
        this.helyRajziSz = helyRajziSz;
    }

    public Szolofajta getFajta() {
        return fajta;
    }

    public void setFajta(Szolofajta fajta) {
        this.fajta = fajta;
    }

    public double getTokeSzam() {
        return tokeSzam;
    }

    public void setTokeSzam(double tokeSzam) {
        this.tokeSzam = tokeSzam;
    }

    public EvesTermes getEvesTermes() {
        return evesTermes;
    }

    public void setEvesTermes(EvesTermes evesTermes) {
        this.evesTermes = evesTermes;
    }

    public void selectParcel(){
        Scanner scanner = new Scanner(System.in);
        int selected;
        selected = scanner.nextInt();

        modifyParcel();
    }

    public void modifyParcel() {

        System.out.println("Mit szeretnel csinalni?");
        System.out.println("1: Fajta modositasa");
        System.out.println("2: Tokeszam modositasa");
        System.out.println("3: Evestermes modositasa");
        System.out.print("Opcio: ");
        Scanner sc = new Scanner(System.in);
        int num1;
        num1 = sc.nextInt();


    }

}
