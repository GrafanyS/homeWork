package Tree1.Pet;

import Tree1.Person.Person;

public class CatLover extends Person implements ICallPet {
    /**
     *  Класс, наследник от `Person`, описывающий людей любящих кошек. Имплементируют интерфейс `CallPet`.
     *   Переопределяет метод `CallPet` в соответствии с поведением кошатника.
     */

    public CatLover(String name, int age) {
        super(name, age);
    }

    @Override
    public void callPet(Pet pet) {
        if (pet instanceof Dog) {
            System.out.printf("%s call %s с помощью \"Кис-Кис-Кис\", но он не реагирует:\n", super.getName(),
                    pet.getName());
        }

        if (pet instanceof Cat) {
            System.out.printf("%s вызов %s с помощью \"Кис-Кис-Кис\", и это говорит:\n", super.getName(),
                    pet.getName());
            pet.Respond();
        }
    }
}
