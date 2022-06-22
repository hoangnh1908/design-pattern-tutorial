import Animal.Animal;
import Factory.AnimalFactory;
import Factory.BasicAnimalFactory;
import Factory.RandomAnimalFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory;

        int type = ThreadLocalRandom.current().nextInt(0, 2);
        if(type == 0){
            factory = new BasicAnimalFactory();
        }else{
            factory = new RandomAnimalFactory();
        }

/*        Animal animal = factory.createAnimal();*/

        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());

    }
}
