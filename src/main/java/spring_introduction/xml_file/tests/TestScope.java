package spring_introduction.xml_file.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_file.Pet;

public class TestScope {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext contextPrototype =
                new ClassPathXmlApplicationContext("applicationContextScope.xml");

        System.out.println("действие 1:");
        ClassPathXmlApplicationContext contextSingleton =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("действие 2 и 3:");
        Pet petPrototype1 = contextPrototype.getBean("myPet", Pet.class);
        Pet petPrototype2 = contextPrototype.getBean("myPet", Pet.class);

        //Здесь действие не происходит, так как бин питомца уже создан
        Pet petSingleton1 = contextSingleton.getBean("myPet", Pet.class);
        Pet petSingleton2 = contextSingleton.getBean("myPet", Pet.class);

        System.out.println("проверка равенства ссылок бинов прототип");
        System.out.println(petPrototype1==petPrototype2);
        System.out.println("проверка равенства ссылок бинов синглтон");
        System.out.println(petSingleton1==petSingleton2);

        contextPrototype.close();
        contextSingleton.close();

    }
}
