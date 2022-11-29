import java.time.LocalTime;

public class Player extends Character implements iPlayer{

    // Aláhuzott implements → Alt+Enter → Implement Methods

    public int sebzes;
    public int hp;

    public Player(int x, int y, int sebzes, int hp) {
        // super(pozicio); → ezt töröljük
        super(new Pozicio(x,y));
        this.sebzes = sebzes;
        this.hp = hp;
    }



    @Override
    public boolean isActive() {
        LocalTime este11 = LocalTime.of(23,00);
        return (this.hp > 0 && LocalTime.now().isBefore(este11));
    }

    @Override
    public void attack() {
        if(isActive()){
            System.out.println("Haaa " + LocalTime.now());
        } else throw new InactiveCharacterException(); // ezt mi hozzuk létre
    }

    @Override
    protected Character clone(){ // Objectet átírni
        return new Player(this.pozicio.x, this.pozicio.y, this.sebzes, this.hp);
    }

    @Override
    public void pozicioBeallit(int x, int y) {
        this.pozicio = new Pozicio(x,y);
    }

    @Override
    public double atlagSebzes() {
        return 0;
        //return (felso+also)%2
    }
}
