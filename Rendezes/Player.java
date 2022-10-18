public class Player implements Comparable<Player>{
    public String name;
    public int age;
    public int position;

    @Override
    public int compareTo(Player o) {
        if(this.age > o.age){
            return -1;
        } else if (this. age < o.age){
            return 1;
        }
        else if (this.position > o.position) {
            return -1;
        }
        else if (this.position < o.position){
            return 1;
            }
        else {
            return this.name.compareTo(o.name);
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

    public Player(String name, int age, int position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
