
public abstract class Animal {


    private String name;

    private int age;


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){ return this.age;


    }

    public String sleep(){
        return this.name + " is sleeping";
    }

    public String eat(){
        return this.name + " is eating";
    }

    public String walk(){
        
        return this.name + " is walking ";

    }

}





///abstract- never intended to be a concrete class- not meant to create actual
////objects of that type
////very often the super class is an abstract class
