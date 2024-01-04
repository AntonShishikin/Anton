import java.lang.*;

public class Dog{
    private int age;
    private String name;


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Dog's name: " + name + "\tDog's age (such a human): " + age*7 +"\tDog's name in fact " + age;
    }
}