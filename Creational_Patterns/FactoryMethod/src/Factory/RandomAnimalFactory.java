package Factory;

import Animal.*;

import java.util.concurrent.ThreadLocalRandom;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        int type = ThreadLocalRandom.current().nextInt(0, 3);
        if(type == 0){
            return new Dog();
        }
        else if(type == 1){
            return new Cat();
        }
        else{
            return new Duck();
        }
    }
}
