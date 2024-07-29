package spring_introduction.java_code.way2;


import org.springframework.beans.factory.annotation.Value;

public class Person {

    private Pet pet;

    //@Value("Vadim") //Аннотация для ввода поля напрямую (hardcoded вариант)
    @Value("${person.name}") //Аннотация для ввода поля напрямую (вариант через проперти файл)
    private String name;
    //@Value("26") //Аннотация для ввода поля напрямую (hardcoded вариант)
    @Value("${person.age}") //Аннотация для ввода поля напрямую (вариант через проперти файл)
    private int age;

    public Person() {
        System.out.println("Person: Создали бин персоны");
    }

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person: Создали бин персоны c DI для поля pet через конструктор");
    }

    public void collYourPet() {
        System.out.println("Person: Привет мой питомец!");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Person: Создали бин персоны c DI для поля pet через сеттер");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
