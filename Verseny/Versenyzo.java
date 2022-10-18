package Verseny;

import java.util.Objects;

public class Versenyzo implements Comparable<Versenyzo>{
    protected int Id;
    protected String name;
    protected String field;

    @Override
    public int compareTo(Versenyzo o){
        if(this.field.compareTo(o.field) == -1){
            return -1;
        } else if(this.field.compareTo(o.field) == 1){
            return 1;
        } else if(this.name.compareTo(o.name) == -1){
            return -1;
        } else if(this.name.compareTo(o.name) == 1){
            return 1;
        } else if(this.Id > o.Id){
            return 1;
        } else if(this.Id < o.Id){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Versenyzo versenyzo = (Versenyzo) o;
        return Id == versenyzo.Id;
    }

    @Override
    public String toString() {
        // <név> (<terület>), azonosítója: <azonosító>
        return name + " (" + field + "), azonositója: " + Id;
    }

    public Versenyzo(int id, String name, String field) {
        Id = id;
        this.name = name;
        this.field = field;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
