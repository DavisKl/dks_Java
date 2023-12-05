package org.example;

public class Pet {
    public String petName;
    public String type;
    public int age;
    public String email;

    public Pet(String petName, String type, int age, String email){
        this.petName = petName;
        this.type = type;
        this.age = age;
        this.email = email;
    }

    public void print(){
        System.out.println(petName);
        System.out.println(type);
        System.out.println(age);
        System.out.println(email);

        System.out.println("---------------");
    }

}

