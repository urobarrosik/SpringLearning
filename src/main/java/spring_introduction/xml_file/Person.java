package spring_introduction.xml_file;

public class Person {
    private Pet pet;
    private String firstName;
    private int age;

    //Конструктор для DI бинов через сеттер должен быть без аргумента
    public Person() {
        System.out.println("Person: Создали бин персоны");
    }

    //Конструктор для DI через конструктор
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person: Создали бин персоны и поместили в него бин питомца через сеттер");
    }

    public void collYourPet() {
        System.out.println("Person: Привет мой питомец!");
        pet.say();
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setAge(int age) {
        System.out.println("Person: Задали возраст через сеттер");
        this.age = age;
    }

    public void setFirstName(String firstName) {
        System.out.println("Person: Задали имя через сеттер");
        this.firstName = firstName;
    }
}
