package org.example;

public class Studenti {

    public String name;
    public String lastName;
    public int course;

    public Studenti(String _name, String lastName, int course){
        name = _name;
        this.lastName = lastName;
        this.course = course;
    }

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("-----------------------");
    }

}
