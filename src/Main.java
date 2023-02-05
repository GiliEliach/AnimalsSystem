import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Dog rex=new Dog(2);//should raise error because 2 for mood is not valid
        Dog doggy=new Dog(1);
        Cat mitzi=new Cat(0);
        Frog frog=new Frog(1);

        System.out.println("Let's check Doggy:");
        doggy.sayHello();
        doggy.sayHello(0);

        System.out.println("How many legs Doggy has? "+ doggy.getNumberOfLegs());
        System.out.println("Is Doggy a carnivorous? "+doggy.isCarnivorous());
        System.out.println("Is Doggy a mammal? "+doggy.isMammals());
        doggy.setCarnivorous(false);
        System.out.println("Is Doggy a carnivorous? "+doggy.isCarnivorous());

        System.out.println("Let's check Mitzi:");
        mitzi.sayHello();
        mitzi.sayHello(1);

        System.out.println("How many legs Mitzi has? "+ mitzi.getNumberOfLegs());
        System.out.println("Is Mitzi a carnivorous? "+mitzi.isCarnivorous());
        System.out.println("Is Mitzi a mammal? "+mitzi.isMammals());
        mitzi.setCarnivorous(false);
        System.out.println("Is Mitzi a carnivorous? "+mitzi.isCarnivorous());

        System.out.println("Let's check Frog:");
        mitzi.sayHello();
        mitzi.sayHello(1);

        System.out.println("How many legs Frog has? "+ frog.getNumberOfLegs());
        System.out.println("Is Frog a carnivorous? "+frog.isCarnivorous());
        System.out.println("Is Frog a mammal? "+frog.isMammals());
        frog.setMammals(true);
        System.out.println("Is Frog a mammal? "+frog.isMammals());
        System.out.println("Does Frog have gills? "+frog.hasGills());
        System.out.println("Does Frog lays eggs? "+frog.hasLaysEggs());

        System.out.println("Let's try polymorphism:");
        List<Animal> listOfAnimals=new ArrayList<>();
        listOfAnimals.add(frog);
        listOfAnimals.add(mitzi);
        listOfAnimals.add(doggy);
        for (Animal a : listOfAnimals) {//should print "false true - false true - false true" because of the above changes
            System.out.println(a.isCarnivorous() + " " + a.isMammals());
        }
    }
}