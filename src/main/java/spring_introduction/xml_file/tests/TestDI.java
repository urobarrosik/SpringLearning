package spring_introduction.xml_file.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_file.Person;
import spring_introduction.xml_file.Pet;

public class TestDI {
    public static void main(String[] args) {

        //Создаём спринг контейнер
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Получаем бин питомца из контейнера и создаём персону с этим бином в конструкторе
        Pet pet = context.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.collYourPet();

        //Получаем бин персоны с бином питомца внутри по умолчанию
        Person personBean = context.getBean("myPerson", Person.class);

        //Проверяем работу DI сеттером
        System.out.println(personBean.getAge() + " " + personBean.getFirstName());

        //Обязательно закрываем контейнер
        context.close();
    }
}
