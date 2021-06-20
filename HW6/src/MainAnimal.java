import java.util.Random;
public class MainAnimal {

    public static void main(String[] args){


        Dog dog = new Dog ("Боня", 600,  10);
        Cat cat = new Cat ("Васька", 40, 30);
        Cat cat1 = new Cat ("Васька", 40, 30);
        cat.animalRun();
        cat.animalSwim();
        dog.animalRun();
        dog.animalSwim();

        System.out.println("Всего котиков: " + cat.countCat);
        System.out.println("Всего собак: " + dog.countDog);
        System.out.println("Всего животных: " + dog.countAnimal);

    }
}
