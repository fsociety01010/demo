package sasha;


import java.io.Serializable;

public class Sasha implements Serializable,Comparable<Sasha> {
   public String name;
   public int age;

    @Override
    public String toString() {
        return "Sasha{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Sasha(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return (int) (age*Math.ceil(Math.sqrt(age)));
    }

    @Override
    public int compareTo(Sasha o) {
        return this.name.compareTo(o.name);
    }
}


