package spring_introduction.annotations.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.annotations.Person;
import spring_introduction.annotations.Pet;

public class TestBeans {
    public static void main(String[] args) {

        //Создание бинов помеченных аннотацией @Component
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        //Получение бина кошки
        Pet pet = context.getBean("catBean", Pet.class);
        pet.say();

        //Получение бина персоны и проверка какой бин и как заDI-ился
        Person person = context.getBean("personBean", Person.class);
        person.collYourPet();

        //Проверка аннотации @Value("") и @Value("${}")
        System.out.println("Имя бина персоны: " + person.getName() + " || Возраст бина персоны: " + person.getAge());
    }
}
