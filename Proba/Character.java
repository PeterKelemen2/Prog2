public abstract class Character {
    Pozicio pozicio;

    public Character(Pozicio pozicio) {
        this.pozicio = pozicio;
    }

    public Pozicio getPozicio() {
        return pozicio;
    }

    protected void setPozicio(Pozicio pozicio) { // így kell majd, idk
        this.pozicio = pozicio;
    }

    public abstract boolean isActive(); // az osztály abstract, ezért nem példányosítjuk
    public abstract void attack();      // majd más classokban, amit ebből hozunk létre


    // Insert → Override Methods → Clone
    @Override
    protected abstract Character clone() throws CloneNotSupportedException;
    // kitöröljük a body-t és átírjuk mi abstractra (abstract izének nincs body-ja)
}
