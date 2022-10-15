import java.util.Objects;

public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    @Override
    public String toString() {
        return
                "Rendszám=\"" + rendszam + '\"' +
                ", Teljesítmény=" + teljesitmeny +
                ", Automata=" + automata;
    }

    public String compareCars (Auto a1, Auto a2){
        if (a1.teljesitmeny > a2.teljesitmeny){
            return a1.getRendszam();
        }else {
            return a2.getRendszam();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(rendszam, auto.rendszam);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public Auto() {
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
}


