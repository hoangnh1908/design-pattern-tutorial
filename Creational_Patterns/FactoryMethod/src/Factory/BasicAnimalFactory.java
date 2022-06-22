package Factory;

import Animal.*;

public class BasicAnimalFactory implements AnimalFactory{
    int index = 0;
    @Override
    public Animal createAnimal() {
        if(index == 0){
            index++;
            return new Dog();
        }
        else if(index == 1){
            index++;
            return new Cat();
        }
        else{
            index = 0;
            return new Duck();
        }
    }
}
