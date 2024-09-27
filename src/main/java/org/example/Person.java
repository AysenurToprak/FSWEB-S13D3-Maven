package org.example;

public class Person {
    public  String firstName;
    public  String lastName;
    public  int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public  boolean isTeen(){
        if (age>=13 && age<=19) {
            return true;
        }
        return false;
    }

    public  String gender;
    public  int weight;
    public  int height;
    public Person(String firstName,String  lastName,int age){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        new Person("male",132,123);
    }
    public  Person(String gender,int weight,int height){
        this.height = height;
        this.gender = gender;
        this.weight = weight;
    }

}
