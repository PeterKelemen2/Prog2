package Verseny;

public class Egyeni extends Versenyzo{
    protected int Age;

    public Egyeni(int id, String name, String field) {
        super(id, name, field);
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
