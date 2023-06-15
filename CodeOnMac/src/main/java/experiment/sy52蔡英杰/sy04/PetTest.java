package main.java.experiment.sy52蔡英杰.sy04;

public class PetTest {
    public static void main(String[] args) {
        Pet myPet = new Pet("George");
        Dog myDog = new Dog("Spot");
        System.out.println(myPet.toString() + "\n" + "Speak: " +
                myPet.speak() + "\n" + myPet.move() + "" +
                myPet.getName() + "\n");
        System.out.println(myDog.toString() + "\n" + "Speak: " +
                myDog.speak() + "\n" + myDog.move() + "" + myDog.getName() + "\n");
    }
}

class Pet {
    protected String name;

    public Pet(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String move() {
        return "run";
    }

    public String speak() {
        return "";
    }

    public String toString() {
        return "My pet " + name;
    }
}

class Dog extends Pet {
    protected int weight;

    public Dog(String s) {
        super(s);
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String speak() {
        return "Woof Woof";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


