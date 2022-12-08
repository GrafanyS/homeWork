package Tree1.Pet;

import Tree1.Person.Person;

public class DogLover extends Person implements ICallPet {
    /**
     *  Класс, наследник от `Person`, описывающий людей любящих собак. Имплементируют интерфейс `CallPet`.
     *  Переопределяет метод `CallPet` в соответствии с поведением собачника.
     */
    public DogLover(String name, int age) {
        super(name, age);
    }

    @Override
    public void callPet(Pet pet) {
        if(pet instanceof Cat){
            System.out.printf("%s зовет %s  свистом, но он не реагирует\n",super.getName(),pet.getName());
        }

        if(pet instanceof Dog){
            System.out.printf("%s зовет %s свистом, и он виляет хвостом и говорит:\n",super.getName(),pet.getName());
            pet.Respond();
        }
    }
}
