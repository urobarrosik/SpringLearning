package spring_introduction.xml_file.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_file.Pet;

public class TestInitDestroy {
    public static void main(String[] args) {

        //init метод выполняется после открытия spring контейнера
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextInitDestroy.xml");

        Pet dog = context.getBean("myPet", Pet.class);
        dog.say();
        Pet dog2 = context.getBean("myPet", Pet.class);
        dog2.say();

        //destroy метод выполняется после закрытия spring контейнера
        context.close();
    }
}
