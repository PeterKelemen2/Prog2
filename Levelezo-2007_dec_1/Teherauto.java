public class Teherauto extends Auto{
    public int teherbiras = 0;

    public Teherauto(String rendszam, int teljesitmeny, boolean automata, int teherbiras) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return super.toString() + ", Teherbiras=" + teherbiras;
    }
}
