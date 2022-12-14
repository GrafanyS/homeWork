package Tree1.Pet;

public abstract class Pet implements IRespond{
    /**
     * Абстрактный класс, для определения животных имеющий общие для всех:
     *  Поля,
     *  Конструктор,
     *  Геттеры;
     */
    private final String Name;
    private final int age;

    public Pet(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

//    abstract public void Respond();

    @Override
    public String toString() {
        return ("Имя: " + getName() + "; возраст:" + getAge());
    }
}
