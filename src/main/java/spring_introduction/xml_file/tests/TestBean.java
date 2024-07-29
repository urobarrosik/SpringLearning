package spring_introduction.xml_file.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.xml_file.Pet;

public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        context.getBean("myPet", Pet.class).say();

        context.close();
    }
}
