package spring_introduction.java_code.way1.tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.java_code.way1.MyConfig;
import spring_introduction.java_code.way1.Person;

public class TestBean {
    public static void main(String[] args) {

        //Новый способ создания спринг контейнера
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean(Person.class);
        person.collYourPet();
    }
}
