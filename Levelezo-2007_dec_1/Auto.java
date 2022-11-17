import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Objects;

public class Auto implements Comparable<Auto> {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }


    public void checkPlate(){
        int valid = 0;

        for(int i=0; i<3; i++){
            if(Character.isAlphabetic(this.rendszam.charAt(i))){
                valid++;
            }
        }
        for(int i=3; i<this.rendszam.length(); i++){
            if(Character.isDigit(this.rendszam.charAt(i))){
                valid++;
            }
        }

        // System.out.println(valid);

        if(valid == 6) {
            System.out.println("Rendszam: " + this.rendszam + " - Valid License plate number");
        } else {
            System.out.println("Rendszam: " + this.rendszam + " - NOT valid License plate number");
        }
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": Rendszam='" + rendszam + '\'' +
                ", Teljesitmeny=" + teljesitmeny +
                ", Automata=" + automata + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(rendszam, auto.rendszam);
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    public void setAutomata(boolean automata) {
        this.automata = automata;
    }

    @Override
    public int compareTo(Auto o) {
        if (this.teljesitmeny > o.teljesitmeny){
            return -1;
        } else if (this.teljesitmeny < o.teljesitmeny){
            return 1;
         } else return (this.teljesitmeny);
    }
}
