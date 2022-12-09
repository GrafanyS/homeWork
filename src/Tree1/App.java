//Описать логику взаимодействия человека и домашнего питомца. Добавить разных животных.
// Добавить разные методы взаимодействия питомца и человека.
// Возможно добавить разных членов семьи?
// Нужно использовать абстрактные классы и интерфейсы.
//
//        Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.

package Tree1;


import Tree1.Person.*;
import Tree1.Pet.*;

public class App {
    /**
     * Тело программы.
     *  В нем созданы несколько личностей, назначены им родственные связи и приведен вызов функций исследования.
     */
    public static void main(String[] args) {
        PersonTree<Person> peoples = new PersonTree<>();
        peoples.add(new DogLover("Валетов Василий", 82));
        peoples.add(new CatLover("Войнаш Томара", 56));
        peoples.add(new DogLover("Валетова Елена", 79));
        peoples.add(new CatLover("Валетов Андрей", 50));

        Tree tree = new Tree();
        Person pa = new Person("Валетов Василий",82);
        Person ma = new Person("Валетова Елена", 79);
        Person so = new Person("Валетов Андрей", 50);
        Person dot = new Person("Войнаш Томара", 56);

        tree.addLink(pa,ma, Relations.HUSBAND, Relations.WIFE);
        tree.addLink(pa,so, Relations.FATHER, Relations.SON);
        tree.addLink(pa,dot, Relations.FATHER, Relations.DAUGHTER);
        tree.addLink(ma,so, Relations.MOTHER, Relations.SON);
        tree.addLink(ma,dot, Relations.MOTHER, Relations.DAUGHTER);
        tree.addLink(so,dot, Relations.BROTHER, Relations.SISTER);

        System.out.println("Список лиц:\n" + peoples + "\n");

        PetTree<Pet> pets = new PetTree<>();
        pets.add(new Cat("Нюша",9));
        pets.add(new Cat("Марик",7));
        pets.add(new Dog("Дружок",12));
        pets.add(new Dog("Граф",1));

        System.out.println("Список питомцев:\n" + pets + "\n");
        System.out.println(",\"12\"-------------------\n");
        Research.getAllCall(peoples,pets);
        System.out.println(",\"14\"-------------------\n");
        Research.getCats(pets);
        System.out.println("-------------------\n");
        Research.getDogs(pets);
        System.out.println("-------------------\n");
        Research.getCatLovers(peoples);
        System.out.println("-------------------\n");
        Research.getDogLovers(peoples);



        System.out.println("-------------------\n");
        System.out.println(tree);
        System.out.println("-------------------\n");
        Research.getResearch(pa,tree);
        System.out.println("-------------------\n");
        Research.getResearch(dot,tree);
        System.out.println("-------------------\n");
        Research.getResearch(so,tree);
        System.out.println("-------------------\n");
        Research.getResearch(Relations.SISTER, tree);
        System.out.println("-------------------\n");
        Research.getResearch(Relations.HUSBAND, pa, tree);
    }
}