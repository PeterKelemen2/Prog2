public class Pozicio {
    int x;
    int y;

    public Pozicio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + this.x + ", y=" + this.y;
    }
}
