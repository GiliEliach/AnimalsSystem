import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Dog rexi=new Dog(2);//should raise error because 2 for mood is not valid
        Dog doggy=new Dog(1);
        Cat mitzi=new Cat(0);
        Frog frogi=new Frog(1);

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

        System.out.println("Let's check Frogi:");
        mitzi.sayHello();
        mitzi.sayHello(1);

        System.out.println("How many legs Frogi has? "+ frogi.getNumberOfLegs());
        System.out.println("Is Frogi a carnivorous? "+frogi.isCarnivorous());
        System.out.println("Is Frogi a mammal? "+frogi.isMammals());
        frogi.setMammals(true);
        System.out.println("Is Frogi a mammal? "+frogi.isMammals());
        System.out.println("Does Frogi have gills? "+frogi.hasGills());
        System.out.println("Does Frogi lays eggs? "+frogi.hasLaysEggs());

        System.out.println("Let's try polymorphism:");
        List<Animal> listOfAnimals=new ArrayList<>();
        listOfAnimals.add(frogi);
        listOfAnimals.add(mitzi);
        listOfAnimals.add(doggy);
        for (Animal a : listOfAnimals) {//should print "false true false true false true" because of the above changes
            System.out.println(a.isCarnivorous() + " " + a.isMammals());
        }
    }
}