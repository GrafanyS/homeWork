package Tree1.Person;

import Tree1.Pet.IRespond;

public class Person extends Communications implements IRespond {
    /**
     * Абстрактный класс для определения людей имеющий общие для всех:
     *     * Поля,
     *     * Конструктор,
     *     * Геттеры;
     */
    private static final Person people2 = null;
    private static final Person people1 = null;
    private static final Relations relationType = null;
    private final String name;
    private final int age;

    public Person(String name, int age) {
        super(people1, people2, relationType);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return ("Имя: "+getName()+"; возраст:"+getAge());
    }

    @Override
    public void Respond()  {
        System.out.println("Зовет питомца");
    }
}
